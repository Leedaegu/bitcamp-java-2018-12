// 28단계: LogJ 1.x 적용하기
// => 애플리케이션을 실행하는 중에 내부 상태를 확인할 목적으로
//    기록을 남기는 것을 "로깅(logging)" 이라 한다.
// => 로깅은 애플리케이션을 실행하는 콘솔창으로 출력할 수도 있고
//    파일이나 네트웍으로도 출력할 수 있다.
// => 보통 실무에서는 파일로 기록을 남긴다.
// => 로깅 작업을 도와주는 대표적인 라이브러리가 log4j 이다.
//    출력 레벨에 따라 로깅을 조절할 수 있어 편리하다.
//
// 작업
// 1) log4j 1.x 라이브러리를 추가한다.
//     => mvnrepository.com에서 log4j 검색한다.
//     => build.gradle에 라이브러리 추가한다.
//
package com.eomcs.lms;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.ServerSocket;
import java.net.Socket;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.eomcs.lms.context.RequestMappingHandlerMapping;
import com.eomcs.lms.context.RequestMappingHandlerMapping.RequestMappingHandler;
import com.eomcs.lms.handler.Response;

public class ServerApp {

  // 보통 클래스에서 사용할 로그 출력 객체는 클래스의 스태틱 멤버로 선언한다.
  final static Logger logger = LogManager.getLogger(ServerApp.class);
  
  // Command 객체와 그와 관련된 객체를 보관하고 있는 빈 컨테이너
  ApplicationContext iocContainer;
  
  // 클라이언트 요청을 처리할 메서드 정보가 들어 있는 객체
  RequestMappingHandlerMapping handlerMapping;
  
  public void service() throws Exception {

    try (ServerSocket ss = new ServerSocket(8888)) {
      logger.info("서버 실행 중...");

      // Spring IoC 컨테이너 준비
      iocContainer = new AnnotationConfigApplicationContext(AppConfig.class);
      printBeans();
      
      // 스프링 IoC 컨테이너에서 RequestMappingHandlerMapping 객체를 꺼낸다.
      // 이 객체에 클라이언트 요청을 처리할 메서드 정보가 들어 있다.
      handlerMapping = 
          (RequestMappingHandlerMapping) iocContainer.getBean(
              RequestMappingHandlerMapping.class);
      
      
      while (true) {
        new RequestHandlerThread(ss.accept()).start();
      } // while

    } catch (Exception e) {
      e.printStackTrace();
    } // try(ServerSocket)

  }
  
  public static void main(String[] args) throws Exception {
    ServerApp app = new ServerApp();

    // App 을 실행한다.
    app.service();
  }
  
  // 바깥 클래스(ServerApp)의 인스턴스 필드를 사용해야 한다면 
  // Inner 클래스(non-static nested class)로 정의하라!
  // 
  class RequestHandlerThread extends Thread {
    
    Socket socket;
    
    public RequestHandlerThread(Socket socket) {
      this.socket = socket;
    }
    
    @Override
    public void run() {
      logger.info("클라이언트 연결되었음.");
      try (Socket socket = this.socket;
          BufferedReader in = new BufferedReader(
              new InputStreamReader(socket.getInputStream()));
          PrintWriter out = new PrintWriter(socket.getOutputStream())) {

        // 클라이언트의 요청 읽기
        String requestLine = in.readLine();
        logger.debug(requestLine);
        
        while(true) {
        String str = in.readLine();
        if(str.length() == 0)
          break; // 요청의 끝을 만나면 나간당
        
        }
        
        String commandPath = requestLine.split(" ")[1];
        // 클라이언트에게 응답하기
        // => HTTP 프로토콜에 따라 응답헤더를 출력한다.
        
        
        // => 클라이언트 요청을 처리할 메서드를 꺼낸다.
        RequestMappingHandler requestHandler = handlerMapping.get(commandPath);
        
        if (requestHandler == null) {
          out.println("HTTP/1.1 404 Not Found");
          out.println("Server: bitcamp");
          out.println("Content-Type: text/html; charset=UTF-8");
          out.println();
          out.println("실행할 수 없는 명령입니다.");
          out.flush();
          return;
        }
        
        
        try {
          out.println("HTTP/1.1 200 OK");
          out.println("Server: bitcamp");
          out.println("Content-Type: text/html; charset=UTF-8");
          out.println();
          // 클라이언트 요청을 처리할 메서드를 찾았다면 호출한다.
          requestHandler.method.invoke(
              requestHandler.bean, // 메서드를 호출할 때 사용할 인스턴스 
              new Response(in, out)); // 메서드 파라미터 값
          
        } catch (Exception e) {
          out.printf("실행 오류! : %s\n", e.getMessage());
          e.printStackTrace();
        }
        
        out.flush();
        
      } catch (Exception e) {
        logger.error("명령어 실행 중 오류 발생 : " + e.toString());
        StringWriter strWriter = new StringWriter();
        PrintWriter out = new PrintWriter(strWriter);
        e.printStackTrace(out);
        logger.error(strWriter.toString());
        
        
       
      }
      logger.info("클라이언트와 연결 종료.");
    }
  }
  
  private void printBeans() {
    logger.debug("---------------------------------------------------"); 
    String[] names = iocContainer.getBeanDefinitionNames();
    for (String name : names) {
      logger.debug(String.format("빈 생성 됨 (객체명%s, 클래스명=%s)", name, 
          iocContainer.getBean(name).getClass().getName()));
    }
    logger.debug("---------------------------------------------------"); 
  }
  
}










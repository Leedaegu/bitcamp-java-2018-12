// 13단계: stateful 방식을 stateless방식으로 전환하기
package com.eomcs.lms;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Set;
import com.eomcs.lms.dao.BoardDaoImpl;
import com.eomcs.lms.dao.LessonDaoImpl;
import com.eomcs.lms.dao.MemberDaoImpl;
import com.eomcs.lms.service.BoardDaoSkel;
import com.eomcs.lms.service.LessonDaoSkel;
import com.eomcs.lms.service.MemberDaoSkel;
import com.eomcs.lms.service.Service;

public class ServerApp {

  static BoardDaoImpl boardDao; 
  static LessonDaoImpl lessonDao; 
  static MemberDaoImpl memberDao; 

  static HashMap<String,Service> serviceMap;
  static Set<String> serviceKeySet;


  public static void main(String[] args) {

    try {
      boardDao = new BoardDaoImpl("board.bin");
      boardDao.loadData();
    } catch (Exception e) {
      System.out.println("게시물 데이터 로딩 중 오류 발생!");
    }

    try {
      lessonDao = new LessonDaoImpl("lesson.bin");
      lessonDao.loadData();
    } catch (Exception e) {
      System.out.println("수업 데이터 로딩 중 오류 발생!");
    }

    try {
      memberDao = new MemberDaoImpl("member.bin");
      memberDao.loadData();
    } catch (Exception e) {
      System.out.println("회원 데이터 로딩 중 오류 발생!");
    }

    serviceMap = new HashMap<>();
    serviceMap.put("/board/", new BoardDaoSkel(boardDao));
    serviceMap.put("/lesson/", new LessonDaoSkel(lessonDao));
    serviceMap.put("/member/", new MemberDaoSkel(memberDao));

    serviceKeySet = serviceMap.keySet();

    try (ServerSocket serverSocket = new ServerSocket(8888)) {
      System.out.println("서버 시작!");

      while (true) {
        
        new RequestProcessorThread(serverSocket.accept()).start();
      }

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  static class RequestProcessorThread extends Thread {

    Socket socket;

    public RequestProcessorThread(Socket socket) {
      this.socket = socket;
    }

    @Override
    public void run() {
      try (Socket socket = this.socket;
          ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
          ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream())) {

        System.out.println("클라이언트와 연결되었음.");

        String request = in.readUTF();
        System.out.println(request);

        Service service = getService(request);
               
        if (service == null) {
          out.writeUTF("FAIL");
          
        } else {
          service.execute(request, in, out);
        }
        out.flush();

      } catch (Exception e) {
        e.printStackTrace();
      }
      System.out.println("클라이언트와의 연결을 끊었음.");
    }
    
    static Service getService(String request) { 
      for (String key : serviceKeySet) {    
        if(request.startsWith(key)) {
          return serviceMap.get(key);    
        }
      }
      return null;
    }
    
  }
}








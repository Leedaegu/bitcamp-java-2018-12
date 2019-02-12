// Stateless 응용 - 서버에서 계산 결과 유지하기 - 선생님 소스
package ch23.e;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class CalculatorServer {
  public static void main(String[] args) {

    try (ServerSocket serverSocket = new ServerSocket(8888)) {
      System.out.println("서버 실행 중...");

      int result = 0;

      while (true) {
        System.out.println();
        System.out.println("클라이언트를 연결해 주세요.");

        try  (
            Socket socket = serverSocket.accept();
            BufferedReader in = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));
            PrintStream out = new PrintStream(socket.getOutputStream())) { 

          System.out.println("클라이언트와 연결됨!\n요청처리 중...");

          result = Integer.parseInt(in.readLine());

          String[] input = in.readLine().split(" ");

          int b = 0;
          String op = null;

          try { 
            op = input[0];
            b = Integer.parseInt(input[1]);
          } catch (Exception e) {
            out.println("식의 형식이 바르지 않습니다.");
            out.println(result);
            out.flush();
            System.out.println("요청 완료!");
            System.out.println("클라이언트와 연결 끊음!");
            continue;
          }

          switch (op) {
            case "+": result += b; break;
            case "-": result -= b; break;
            case "*": result *= b; break;
            case "/": result /= b; break;
            case "%": result %= b; break;
            default:
              out.printf("%s 연산자를 지원하지 않습니다.\n", op);
              out.println(result);
              out.flush();
              System.out.println("요청 완료!");
              System.out.println("클라이언트와 연결 끊음!");
              continue;

          }

          out.printf("결과는 %d 입니다.\n", result);
          out.println(result);
          System.out.println("클라이언트에게 계산결과를 보냄.");
          out.flush();

        } catch (Exception e) {
          // 클라이언트 요청을 처리하다가 예외가 발생하면 무시하고 연결을 끊는다.
          System.out.println("클라이언트와 통신 중 오류 발생!");
        }

        System.out.println("클라이언트와 연결 끊음!");
      } // while

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

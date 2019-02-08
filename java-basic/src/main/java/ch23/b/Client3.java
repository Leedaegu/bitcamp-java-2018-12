// 데이터 주고받기 - 에코(echo) 클라이언트 만들기
package ch23.b;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client3 {

  public static void main(String[] args) throws Exception {

    try(Socket socket = new Socket("localhost", 8888);
        BufferedOutputStream out = new BufferedOutputStream(socket.getOutputStream());
        Scanner in = new Scanner(socket.getInputStream());
        FileInputStream fileIn = new FileInputStream("")) { 

      System.out.println("서버와 연결 되었음!");

      out.println("Hello!");
      out.flush(); // 스트링 객체의 내부 버퍼에 출력된 내용을 네트위크로 방출 시킨다.
      System.out.println("서버에 데이터를 보냈음!");


      String response = in.nextLine();
      System.out.println(response);

    } catch (Exception e) {

    }

  }
}

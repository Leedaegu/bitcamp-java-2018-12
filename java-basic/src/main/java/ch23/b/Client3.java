// 데이터 주고받기 - 파일보내는 클라이언트 만들기
package ch23.b;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client3 {

  public static void main(String[] args) throws Exception {

    try(Socket socket = new Socket("192.168.0.047", 8888);
        DataOutputStream out = new DataOutputStream(
            new BufferedOutputStream(socket.getOutputStream()));
        Scanner in = new Scanner(socket.getInputStream())) { 

      System.out.println("서버와 연결 되었음!");

      File file = new File("temp/sana.mp4");
      try(BufferedInputStream fileIn = new BufferedInputStream(
          new FileInputStream(file))) {

        // 서버에 보낼 파일의 크기를 먼저 알려준다.
        long fileLen = file.length();
        out.writeLong(fileLen);
        out.writeUTF("사나없이사나마나.mp4");
        out.flush();

        System.out.println("서버에 데이터를 보내는중...");
        for (long i = 0; i < fileLen; i++) {
          out.write(fileIn.read());
        }
        out.flush();
        System.out.println("서버에 데이터를 보냈음!");
      }

      System.out.println("서버의 응답을 기다리고 있음!");
      String response = in.nextLine();
      System.out.println(response);

    } catch (Exception e) {
      e.printStackTrace();
    }

  }
}

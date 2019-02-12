//// Stateless 응용 - 계산 결과 유지하기 - 내 소스
package ch23.e;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class CalculatorClient {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);
    int value = 0;

    while (true) {
      System.out.println();
      System.out.print("> ");
      String input = keyboard.nextLine();
      if (input.equalsIgnoreCase("quit"))
        break;

      try (Socket socket = new Socket("localhost", 8888);
          PrintStream out = new PrintStream(socket.getOutputStream());
          BufferedReader in = new BufferedReader(
              new InputStreamReader(socket.getInputStream()))) {

        System.out.println("서버와 연결됨!\n서버에게 계산 작업을 요청함!");

        out.println(value);
        out.flush();

        out.println(input);
        out.flush();

        String response = in.readLine();
        System.out.println("서버에게 계산 결과를 받음.");
        System.out.println(response);

        value = Integer.parseInt(in.readLine());

      } catch (Exception e) {
        e.printStackTrace();
      }
      System.out.println("서버와 연결 끊음!");

    } // while

    keyboard.close();
  }
}












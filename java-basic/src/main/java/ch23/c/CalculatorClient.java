// 클라이언트 만들기
package ch23.c;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class CalculatorClient {

  public static void main(String[] args) throws Exception {
        
    try(Scanner keyboard = new Scanner(System.in);
        Socket socket = new Socket("localhost", 8888);
        PrintWriter out = new PrintWriter(socket.getOutputStream());
        Scanner in = new Scanner(socket.getInputStream())) {
      
      System.out.println(in.nextLine());
      System.out.println(in.nextLine());
      System.out.println(in.nextLine());
      
      String operator = keyboard.nextLine();
                  
      out.println(operator);
      out.flush();
            
      System.out.println(in.nextInt());
      
      keyboard.nextLine();

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

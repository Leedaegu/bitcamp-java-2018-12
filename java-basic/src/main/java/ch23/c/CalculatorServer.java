// 서버 만들기
package ch23.c;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class CalculatorServer {

  public static void main(String[] args) throws Exception {

    int a = 0;

    try(Scanner keyboard = new Scanner(System.in);
        ServerSocket serverSocket = new ServerSocket(8888);     
        Socket socket = serverSocket.accept();
        PrintWriter out = new PrintWriter(socket.getOutputStream());
        Scanner in = new Scanner(socket.getInputStream())) {

      out.println("계산기 서버에 오신 걸 환영합니다!");
      out.println("계산식을 입력하세요!");
      out.println("예) 23 + 7");
      out.flush();

      int no = in.nextInt();
      System.out.println(no);
      
      String Operator = in.next();
      System.out.println(Operator);
      
      String no2 = in.next();
      System.out.println(no2);

      if (Operator.equals("+"))
        a = Calculator.plus(no, Integer.parseInt(no2));
      //        else if (Operator.equals("-"))
      //          claculator.minus(no, no2);
      //        else if (Operator.equals("*"))
      //          claculator.multiple(no, no2);
      //        else if (Operator.equals("/"))
      //          claculator.divide(no, no2);
      //        else if (Operator.equals("%"))
      //          claculator.remained(no, no2);


      out.println(a);
      out.flush();


      keyboard.nextLine();

    } catch (Exception e) {
      e.printStackTrace();
    }

  }
}


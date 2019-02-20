package ch25.c;

import java.util.Scanner;

public class a2 {

  public static void main(String[] args) {

    System.out.print("숫자> ");

    Scanner keyboard = new Scanner(System.in);
    int a = keyboard.nextInt();

    int b = m1(a);  

    System.out.println(b);
    System.out.println("프로그램종료");

    keyboard.close();
  } // main
  

  public static int m1(int a) {    
    if (a < 100) 
      return a;

    return 100;

  } // m1

}

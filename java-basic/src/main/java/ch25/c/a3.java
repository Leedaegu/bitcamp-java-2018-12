package ch25.c;

import java.util.Scanner;

public class a3 {

  public static void main(String[] args) {

    System.out.print("숫자> ");
    
    Scanner keyboard = new Scanner(System.in);    
    int a = keyboard.nextInt();

    keyboard.close();
    
    if (a < 100)
      return;
    
    System.out.println(a);
    
    System.out.println("프로그램종료");

    
  } // main

  
}

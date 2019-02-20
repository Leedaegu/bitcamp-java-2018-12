package ch25.c;

import java.util.Scanner;

public class a {

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    System.out.print("숫자> ");
    int a = keyboard.nextInt();

    m1(a);  
    System.out.println("프로그램종료");

    keyboard.close();
  } // main

  
  public static void m1(int a) {    
    if (a < 100) 
      return;    
    
    System.out.println(a);

  } // m1
  
}

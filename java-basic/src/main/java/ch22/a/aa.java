package ch22.a;

import java.util.Scanner;

public class aa {



  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    
    System.out.println("숫자를 입력하세요 ");
    int num = Integer.parseInt(keyboard.nextLine());
    
    int a = m1(keyboard,num);
    System.out.println(a);
    keyboard.close();
    
  }
  
  public static int m1(Scanner keyboard,int num) {

    System.out.println("숫자를 입력하세요 ");
    int num2 = Integer.parseInt(keyboard.nextLine());
    
    return num + num2;    

  }
  
}

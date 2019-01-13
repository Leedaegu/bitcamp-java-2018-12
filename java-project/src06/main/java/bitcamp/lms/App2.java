package bitcamp.lms;

import java.util.Scanner;
import java.util.Date;

public class App2 {
  
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    final int LENGTH = 10;
    
    int[] no = new int[LENGTH];
    String[] name = new String[LENGTH];
    String[] email = new String[LENGTH];
    String[] password = new String[LENGTH];
    String[] photo = new String[LENGTH];
    String[] tell = new String[LENGTH];
    Date[] registeredDate = new Date[LENGTH];

    int index = 0;
    
    while (index < LENGTH) {
      System.out.print("번호? ");
      no[index] = Integer.parseInt(keyboard.nextLine());

      System.out.print("이름? ");
      name[index] = keyboard.nextLine();

      System.out.print("이메일? ");
      email[index] = keyboard.nextLine();

      System.out.print("암호? ");
      password[index] = keyboard.nextLine();

      System.out.print("사진? ");
      photo[index] = keyboard.nextLine();

      System.out.print("전화? ");
      tell[index] = keyboard.nextLine();

      registeredDate[index] = new Date(System.currentTimeMillis());

      index++;

      System.out.print("\n계속 입력하시겠습니까?(Y/n) ");
      String answer = keyboard.nextLine();
      System.out.println();

      if(!answer.equalsIgnoreCase("y")) 
        break;
    }

    keyboard.close();

    int count = 0;
    while (count < index) {


    System.out.printf("번호: %d\n", no[count]);
    System.out.printf("이름: %s\n", name[count]);
    System.out.printf("이메일: %s\n", email[count]);
    System.out.printf("암호: %s\n", password[count]);
    System.out.printf("사진: %s\n", photo[count]);
    System.out.printf("전화: %s\n", tell[count]);
    System.out.printf("가입일: %s\n", registeredDate[count]);
    count++;

    }
  }
}

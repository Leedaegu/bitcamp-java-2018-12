package com.eomcs.lms;

import java.sql.Date;
import java.util.Scanner;

public class App2 {

  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);
    final int LENGTH = 100;

    int[] no = new int[LENGTH];
    String[] name = new String[LENGTH];
    String[] email = new String[LENGTH];
    String[] password = new String[LENGTH];
    String[] photo = new String[LENGTH];
    String[] tel = new String[LENGTH];
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
      tel[index] = keyboard.nextLine();

      registeredDate[index] = new Date(System.currentTimeMillis()); 

      index++;

      System.out.print("\n계속 입력하시겠습니까? ");
      String answer = keyboard.nextLine().toLowerCase();
      
      if (!answer.equals("y")) {
        break;
      }
      System.out.println();
    }

    keyboard.close();

    System.out.println(); 

    int size = 0;
    while (size < LENGTH) {
      System.out.printf("%3d, %-4s, %-20s, %-15s, %s\n",
          no[size], name[size], email[size], tel[size], registeredDate[size]);
      
      size++;    

    }
  }
}
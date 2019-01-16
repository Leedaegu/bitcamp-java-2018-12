package com.eomcs.lms;

import java.sql.Date;
import java.util.Scanner;

public class App3 {

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    final int LENGTH = 100;

    int[] no = new int[LENGTH];
    String[] contents = new String[LENGTH];
    Date[] createdDate = new Date[LENGTH];
    int[] viewCount = new int[LENGTH];       

    int index = 0;

    while (index < LENGTH) {
      System.out.print("번호? ");
      no[index] = Integer.parseInt(keyboard.nextLine());

      System.out.print("내용? ");
      contents[index] = keyboard.nextLine();

      createdDate[index] = new Date(System.currentTimeMillis()); 

      viewCount[index] = 0;

      index++;

      System.out.print("\n계속 입력하시겠습니까? ");
      String answer = keyboard.nextLine().toLowerCase();

      if(!answer.equals("y") && answer.length() > 0) {
        break;
      }
      System.out.println();
    }

    keyboard.close();

    System.out.println(); 

    for(int size = 0; size < index; size++)
    System.out.printf("%3d, %-20s , %s, %d\n", 
        no[size], contents[size], createdDate[size], viewCount[size]);

  }
}

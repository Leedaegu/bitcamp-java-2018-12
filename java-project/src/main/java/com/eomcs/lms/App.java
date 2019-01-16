package com.eomcs.lms;

import java.sql.Date;
import java.util.Scanner;

public class App {

  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);
    final int LENGTH = 100;

    int[] no = new int[LENGTH];
    String[] title = new String[LENGTH];
    String[] contents = new String[LENGTH];
    Date[] startDate = new Date[LENGTH];
    Date[] endDate = new Date[LENGTH];
    int[] totalHours = new int[LENGTH];
    int[] dayHours = new int[LENGTH];

    int index = 0;

    while (index < LENGTH) {
      System.out.print("번호? ");
      no[index] = Integer.parseInt(keyboard.nextLine());

      System.out.print("수업명? ");
      title[index] = keyboard.nextLine();

      System.out.print("수업내용? ");
      contents[index] = keyboard.nextLine();

      System.out.print("시작일? ");
      startDate[index] = Date.valueOf(keyboard.nextLine());

      System.out.print("종료일? ");
      endDate[index] = Date.valueOf(keyboard.nextLine());

      System.out.print("총수업시간? ");
      totalHours[index] = Integer.parseInt(keyboard.nextLine());

      System.out.print("일수업시간? ");
      dayHours[index] = Integer.parseInt(keyboard.nextLine());

      index++;

      System.out.print("\n계속 입력하시겠습니까? ");
      String answer = keyboard.nextLine().toLowerCase();
      if (!answer.equals("y") && answer.length() > 0) {
        break;
      }
      System.out.println();
    }

    keyboard.close();

    System.out.println(); 

    for (int Length = 0; Length < index; Length++) {
      System.out.printf("%3d, %-15s, %10s ~ %10s, %4d\n", 
          no[Length], title[Length], startDate[Length], endDate[Length], totalHours[Length]);
    }
  }
}



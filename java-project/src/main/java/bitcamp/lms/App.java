package bitcamp.lms;

import java.util.Scanner;
import java.sql.Date;

public class App {

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);



    int[] no = new int[10];
    String[] title = new String[10];
    String[] contents = new String[10];
    Date[] startDate = new Date[10];
    Date[] endDate = new Date[10];
    int[] totalHours = new int[10];
    int dayHours[] = new int[10];

    int length = 0;

    while (length < 10){

      System.out.print("번호? ");
      no[length] = Integer.parseInt(keyboard.nextLine());

      System.out.print("수업명? ");
      title[length] = keyboard.nextLine();

      System.out.print("수업내용? ");
      contents[length] = keyboard.nextLine();

      System.out.print("시작일? ");
      startDate[length] = Date.valueOf(keyboard.nextLine());

      System.out.print("종료일? ");
      endDate[length] = Date.valueOf(keyboard.nextLine());

      System.out.print("총수업시간? ");
      totalHours[length] = Integer.parseInt(keyboard.nextLine());

      System.out.print("일수업시간? ");
      dayHours[length] = Integer.parseInt(keyboard.nextLine());

      length++;

      System.out.println();

      System.out.print("계속 입력하시겠습니까?(y/n) ");
      String answer = keyboard.nextLine();

      System.out.println();

      if(!answer.equals("y")&&!answer.equals("Y"))     
        break;
    }

    keyboard.close();

    System.out.println();

    for (int size = 0; size < length; size++) {

      System.out.printf("번호: %d\n", no[size]);
      System.out.printf("수업명: %s\n", title[size]);
      System.out.printf("수업내용: %s\n", contents[size]);
      System.out.printf("기간: %s ~ %s\n", startDate[size], endDate[size]);
      System.out.printf("총수업시간: %d 시간\n", totalHours[size]);
      System.out.printf("일수업시간: %d 시간\n", dayHours[size]);
      System.out.println();
    }
  }
}

package bitcamp.lms;

import java.sql.Date;
import java.util.Scanner;

public class App {

  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    final int LENGTH = 10;

    int[] no = new int[LENGTH];
    String[] title = new String[LENGTH];
    String[] contents = new String[LENGTH];
    Date[] startDate = new Date[LENGTH];
    Date[] endDate = new Date[LENGTH];
    int[] totalHours = new int[LENGTH];
    int dayHours[] = new int[LENGTH];

    int index = 0;
    while (index < LENGTH){

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

      System.out.print("\n계속 입력하시겠습니까?(y/n) ");
      String answer = keyboard.nextLine().toLowerCase();


      if(!answer.equals("y")&& answer.length() > 0 ) {   
        break;
      }

      System.out.println();
    }
    keyboard.close();
    
    System.out.println();
    
    for (int size = 0; size < index; size++) {

      System.out.printf("%d %s, %s, %s~ %s %d, %d\n",
          no[size], title[size], contents[size], startDate[size], endDate[size], 
          totalHours[size], dayHours[size]);
//      System.out.printf("번호: %d\n", no[size]);
//      System.out.printf("수업명: %s\n", title[size]);
//      System.out.printf("수업내용: %s\n", contents[size]);
//      System.out.printf("기간: %s ~ %s\n", startDate[size], endDate[size]);
//      System.out.printf("총수업시간: %d 시간\n", totalHours[size]);
//      System.out.printf("일수업시간: %d 시간\n", dayHours[size]);
//      System.out.println();
    }
  }
}

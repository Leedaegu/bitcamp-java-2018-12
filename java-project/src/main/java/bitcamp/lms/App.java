package bitcamp.lms;

import java.sql.Date;
import java.util.Scanner;

public class App {

  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    int[] number = new int[10];
    String[] classname = new String[10];
    String[] classcontents = new String[10];
    Date[] startd = new Date[10];
    Date[] finishd = new Date[10];
    int[] totalh = new int[10];
    int[] dayh = new int [10];

    int i = 0;

    while (i < 10){
      System.out.print("번호? ");
      number[i] = Integer.parseInt(keyboard.nextLine());

      System.out.print("수업명? ");
      classname[i] = keyboard.nextLine();

      System.out.print("수업내용? ");
      classcontents[i] = keyboard.nextLine();

      System.out.print("시작일? ");
      startd[i] = Date.valueOf(keyboard.nextLine());

      System.out.print("종료일? " );
      finishd[i] = Date.valueOf(keyboard.nextLine());

      System.out.print("총수업시간? ");
      totalh[i] = Integer.parseInt(keyboard.nextLine());

      System.out.print("일수업시간? ");
      dayh[i] = Integer.parseInt(keyboard.nextLine());

      i++;

      System.out.println();
      System.out.print("계속 입력하시겠습니까? (Y/n) ");
      String answer = keyboard.nextLine();
      System.out.println();

      if (!answer.equals("y") && !answer.equals("Y")) 
        break;

    }

    keyboard.close();
    int j = 0;

    while (j < i) {
      System.out.printf("%d , %s, %s ~ %s, %d\n", 
          number[j], classname[j], startd[j], finishd[j], totalh[j]);
      j++;


    }



  }
}
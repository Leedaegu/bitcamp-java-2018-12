package bitcamp.lms;

import java.sql.Date;
import java.util.Scanner;

public class App {

  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    final int LENGTH = 10;
    
    Lesson[] lessons = new Lesson[LENGTH];

   
    int index = 0;
    while (index < LENGTH){
      
      Lesson lesson = new Lesson();

      System.out.print("번호? ");
      lesson.no = Integer.parseInt(keyboard.nextLine());

      System.out.print("수업명? ");
      lesson.title = keyboard.nextLine();

      System.out.print("수업내용? ");
      lesson.contents = keyboard.nextLine();

      System.out.print("시작일? ");
      lesson.startDate = Date.valueOf(keyboard.nextLine());

      System.out.print("종료일? ");
      lesson.endDate = Date.valueOf(keyboard.nextLine());

      System.out.print("총수업시간? ");
      lesson.totalHours = Integer.parseInt(keyboard.nextLine());

      System.out.print("일수업시간? ");
      lesson.dayHours = Integer.parseInt(keyboard.nextLine());

      lessons[index] = lesson;
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
          lessons[size].no, lessons[size].title, lessons[size].contents, lessons[size].startDate, lessons[size].endDate, 
          lessons[size].totalHours, lessons[size].dayHours);
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

package bitcamp.lms;

import java.sql.Date;
import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    
    Scanner keyboard = new Scanner(System.in);
    
    int LENGTH = 10;
    Lesson[] lessons = new Lesson[LENGTH];

  
    int i = 0;
    while (i < LENGTH){
      
      bitcamp.lms.Lesson lesson = new bitcamp.lms.Lesson();
      
      System.out.print("번호? ");
      lesson.number = Integer.parseInt(keyboard.nextLine());

      System.out.print("수업명? ");
      lesson.classname = keyboard.nextLine();

      System.out.print("수업내용? ");
      lesson.classcontents = keyboard.nextLine();

      System.out.print("시작일? ");
      lesson.startd = Date.valueOf(keyboard.nextLine());

      System.out.print("종료일? " );
      lesson.finishd = Date.valueOf(keyboard.nextLine());

      System.out.print("총수업시간? ");
      lesson.totalh = Integer.parseInt(keyboard.nextLine());

      System.out.print("일수업시간? ");
      lesson.dayh = Integer.parseInt(keyboard.nextLine());
      lessons[i] = lesson;
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
          lessons[j].number, lessons[j].classname, lessons[j].startd, lessons[j].finishd, lessons[j].totalh);
      j++;


    }



  }
}
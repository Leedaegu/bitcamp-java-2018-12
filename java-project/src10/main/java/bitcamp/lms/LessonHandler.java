package bitcamp.lms;

import java.sql.Date;
import java.util.Scanner;

public class LessonHandler {
  static Scanner keyboard;
  
  static final int LENGTH = 10;    
  
  static Lesson[] lessons = new Lesson[LENGTH];
  static int lessonIdx = 0;
  
   static void listLesson() {
    for (int size = 0; size < lessonIdx; size++) {
      System.out.printf("%d %s, %s, %s~ %s %d, %d\n",
          lessons[size].no, lessons[size].title, lessons[size].contents, lessons[size].startDate, lessons[size].endDate, 
          lessons[size].totalHours, lessons[size].dayHours);
    }
  }
    static void addLesson() {
     Lesson lesson = new Lesson();

     System.out.println();
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

     lessons[lessonIdx] = lesson;

     lessonIdx++;

     System.out.println("저장하였습니다.");
   }
    
}

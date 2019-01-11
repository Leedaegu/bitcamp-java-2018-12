package bitcamp.lms;

import java.util.Scanner;
import java.sql.Date;

public class App {

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    
    System.out.print("번호? ");
    int no = Integer.parseInt(keyboard.nextLine());
        
    System.out.print("수업명? ");
    String title = keyboard.nextLine();
           
    System.out.print("수업내용? ");
    String contents = keyboard.nextLine();
    
    System.out.print("시작일? ");
    Date startDate = Date.valueOf(keyboard.nextLine());
    
    System.out.print("종료일? ");
    Date endDate = Date.valueOf(keyboard.nextLine());
    
    System.out.print("총수업시간? ");
    int totalHours = Integer.parseInt(keyboard.nextLine());
    
    System.out.print("일수업시간? ");
    int dayHours = Integer.parseInt(keyboard.nextLine());
    
    keyboard.close();
    
    System.out.println();
    
    System.out.printf("번호: %d\n", no);
    System.out.printf("수업명: %s\n", title);
    System.out.printf("수업내용: %s\n", contents);
    System.out.printf("기간: %s ~ %s\n", startDate, endDate);
    System.out.printf("총수업시간: %d 시간\n", totalHours);
    System.out.printf("일수업시간: %d 시간\n", dayHours);

    
  }
}

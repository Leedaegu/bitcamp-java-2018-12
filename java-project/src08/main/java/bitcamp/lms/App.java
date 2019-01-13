package bitcamp.lms;

import java.sql.Date;
import java.util.Scanner;

public class App {

  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    final int LENGTH = 10;    

    Lesson[] lessons = new Lesson[LENGTH];
    int lessonIdx = 0;
    Member[] members = new Member[LENGTH];
    int memberIdx = 0;
    Board[] boards = new Board[LENGTH];
    int boardIDX = 0;

    while (true){
      System.out.print("명령> ");
      String command = keyboard.nextLine().toLowerCase();

      if (command.equals("/lesson/add")) {
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

      } else if (command.equals("/lesson/list")) {
        for (int size = 0; size < lessonIdx; size++) {
          System.out.printf("%d %s, %s, %s~ %s %d, %d\n",
              lessons[size].no, lessons[size].title, lessons[size].contents, lessons[size].startDate, lessons[size].endDate, 
              lessons[size].totalHours, lessons[size].dayHours);
        }
      }else if (command.equals("/member/add")) {
        Member member = new Member();

        System.out.print("번호? ");
        member.no = Integer.parseInt(keyboard.nextLine());

        System.out.print("이름? ");
        member.name = keyboard.nextLine();

        System.out.print("이메일? ");
        member.email = keyboard.nextLine();

        System.out.print("암호? ");
        member.password = keyboard.nextLine();

        System.out.print("사진? ");
        member.photo = keyboard.nextLine();

        System.out.print("전화? ");
        member.tell = keyboard.nextLine();

        member.registeredDate = new Date(System.currentTimeMillis());

        members[memberIdx] = member;        
        memberIdx++;

        System.out.println("저장하였습니다.");


      } else if (command.equals("/member/list")) {
        for (int size = 0; size < memberIdx; size++) {
          System.out.printf("%d, %s, %s, %s, %s, %s, %s\n",
              members[size].no, members[size].name, members[size].email,members[size].password,
              members[size].photo, members[size].tell, members[size].registeredDate);
        }

      } else if (command.equals("/board/add")) {
        Board board = new Board();

        System.out.print("번호? ");
        board.no = Integer.parseInt(keyboard.nextLine());

        System.out.print("내용? ");
        board.contents = keyboard.nextLine();

        board.createdDate = new Date(System.currentTimeMillis());

        board.viewCount = 0;

        boards[boardIDX] = board;

        boardIDX++;

        System.out.println("저장하였습니다.");

      } else if (command.equals("/board/list")) {
        for (int i = 0; i < boardIDX; i++) {
          System.out.printf("%d, %s, %s, %s\n",
              boards[i].no, boards[i].contents, boards[i].createdDate, boards[i].viewCount);
        }
      } else if (command.equals("quit")) {
        System.out.println("안녕!");
        break;

      } else {
        System.out.println("실행할 수 없는 명령입니다.");
      }

      System.out.println(); //결과후 빈줄출력
    }
    keyboard.close();
  }
}


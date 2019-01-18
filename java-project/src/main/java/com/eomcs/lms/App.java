package com.eomcs.lms;

import java.sql.Date;
import java.util.Scanner;

public class App {

  static Scanner keyboard = new Scanner(System.in);
  static final int LENGTH = 100;

  static Lesson[] lessons = new Lesson[LENGTH];    
  static int lessonIdx = 0;

  static Member[] members = new Member[LENGTH];
  static int memberIdx = 0;

  static Board[] boards = new Board[LENGTH];
  static int boardIdx = 0;

  public static void main(String[] args) {

    while (true) {
      String command = prompt();
      System.out.println();
      
      if (command.equals("/lesson/add")) {      
        addLesson();

      } else if (command.equals("/lesson/list")) {
        listLesson(); 

      } else if (command.equals("/member/add")) {
        addMember();

      } else if (command.equals("/member/list")) {
        listMember(); 

      } else if (command.equals("/board/add")) {
        addBoard();

      } else if (command.equals("/board/list")) {
        listBoard();

      } else if (command.equals("quit")) {
        System.out.println("안녕!");
        break;

      } else {
        System.out.println("실행할 수 없는 명령 입니다.");
      }

      System.out.println();
    }

    keyboard.close();
  }
  
  private static String prompt() {
    System.out.print("명령> ");   
    return keyboard.nextLine().toLowerCase();
  }

  private static void listBoard() {
    for(int size = 0; size < boardIdx; size++)
      System.out.printf("%3d, %-20s , %s, %d\n", 
          boards[size].no, boards[size].contents,
          boards[size].createdDate, boards[size].viewCount);
  }

  private static void addBoard() {
    Board board = new Board();

    System.out.print("번호? ");
    board.no = Integer.parseInt(keyboard.nextLine());

    System.out.print("내용? ");
    board.contents = keyboard.nextLine();

    board.createdDate = new Date(System.currentTimeMillis()); 

    board.viewCount = 0;

    boards[boardIdx] = board;

    boardIdx++;

    System.out.println("저장 하였습니다.");
  }

  private static void listMember() {
    for (int size = 0; size < memberIdx; size++) {
      System.out.printf("%3d, %-4s, %-20s, %-15s, %s\n",
          members[size].no, members[size].name, 
          members[size].email, members[size].tel, members[size].registeredDate);

    }
  }

  private static void addMember() {
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
    member.tel = keyboard.nextLine();

    member.registeredDate = new Date(System.currentTimeMillis()); 

    members[memberIdx] = member;

    memberIdx++;

    System.out.println("저장 하였습니다.");
  }

  private static void listLesson() {
    for (int Length = 0; Length < lessonIdx; Length++) {
      System.out.printf("%3d, %-15s, %10s ~ %10s, %4d\n", 
          lessons[Length].no, lessons[Length].title, lessons[Length].startDate,
          lessons[Length].endDate, lessons[Length].totalHours);
    }
  }

  private static int addLesson() {
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

    lessons[lessonIdx] = lesson;
    lessonIdx++;

    System.out.println("저장 하였습니다.");
    return lessonIdx;
  }
}



package com.eomcs.lms;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Stack;
import com.eomcs.lms.domain.Board;
import com.eomcs.lms.domain.Lesson;
import com.eomcs.lms.domain.Member;
import com.eomcs.lms.handler.BoardAddCommand;
import com.eomcs.lms.handler.BoardDeleteCommand;
import com.eomcs.lms.handler.BoardDetailCommand;
import com.eomcs.lms.handler.BoardListCommand;
import com.eomcs.lms.handler.BoardUpdateCommand;
import com.eomcs.lms.handler.Command;
import com.eomcs.lms.handler.LessonAddCommand;
import com.eomcs.lms.handler.LessonDeleteCommand;
import com.eomcs.lms.handler.LessonDetailCommand;
import com.eomcs.lms.handler.LessonListCommand;
import com.eomcs.lms.handler.LessonUpdateCommand;
import com.eomcs.lms.handler.MemberAddCommand;
import com.eomcs.lms.handler.MemberDeleteCommand;
import com.eomcs.lms.handler.MemberDetailCommand;
import com.eomcs.lms.handler.MemberListCommand;
import com.eomcs.lms.handler.MemberUpdateCommand;

public class App {

  static Scanner keyboard = new Scanner(System.in);

  // 사용자가 입력한 명령을 보관할 스택 준비
  static Stack<String> commandHistory = new Stack<>();
  static ArrayDeque<String> commandHistory2 = new ArrayDeque<>();

  static ArrayList<Lesson> lessonList = new ArrayList<>(); //load ,save 메서드에서 접근하기 위에밖으로뺀후 static으로 만든다.
  static ArrayList<Member> memberList = new ArrayList<>();
  static ArrayList<Board> boardList = new ArrayList<>();

  public static void main(String[] args) {
    // 데이터 로딩
    loadLessonData();
    loadMemberData();
    loadBoardData();
    System.out.println();

    HashMap<String,Command> commandMap = new HashMap<>();

    commandMap.put("/lesson/add", new LessonAddCommand(keyboard, lessonList));
    commandMap.put("/lesson/list", new LessonListCommand(keyboard, lessonList));
    commandMap.put("/lesson/detail", new LessonDetailCommand(keyboard, lessonList));
    commandMap.put("/lesson/delete", new LessonDeleteCommand(keyboard, lessonList));
    commandMap.put("/lesson/update", new LessonUpdateCommand(keyboard, lessonList));

    commandMap.put("/member/add", new MemberAddCommand(keyboard, memberList));
    commandMap.put("/member/list", new MemberListCommand(keyboard, memberList));
    commandMap.put("/member/detail", new MemberDetailCommand(keyboard, memberList));
    commandMap.put("/member/delete", new MemberDeleteCommand(keyboard, memberList));
    commandMap.put("/member/update", new MemberUpdateCommand(keyboard, memberList));

    commandMap.put("/board/add", new BoardAddCommand(keyboard, boardList));
    commandMap.put("/board/list", new BoardListCommand(keyboard, boardList));
    commandMap.put("/board/detail", new BoardDetailCommand(keyboard, boardList));
    commandMap.put("/board/delete", new BoardDeleteCommand(keyboard, boardList));
    commandMap.put("/board/update", new BoardUpdateCommand(keyboard, boardList));

    while (true) {
      String command = prompt();

      // 사용자가 입력한 명령을 스택에 보관한다.
      commandHistory.push(command);

      // 사용자가 입력한 명령을 큐에 보관한다.
      commandHistory2.offer(command);

      if (command.equals("quit")) {
        quit();
        break;

      } else if (command.equals("history")) {
        printCommandHistory(new Iterator<String>() {
          int index = commandHistory.size() - 1;

          @Override
          public boolean hasNext() {
            return index >= 0; 
          }

          @Override
          public String next() {
            return commandHistory.get(index--);
          }
        });

      } else if (command.equals("history2")) {
        printCommandHistory(commandHistory2.iterator());

      } else {
        Command commandHandler = commandMap.get(command);

        if (commandHandler == null)
          System.out.println("실행할 수 없는 명령입니다.");
        else 
          try {
            commandHandler.execute();

          } catch (Exception e) {
            // 예외가 발생하면 다음 문장을 실행하고 계속 프로그램을 실행한다.
            System.out.printf("작업 중 오류 발생: %s\n", e.toString());
          }
      }

      System.out.println(); // 결과 출력 후 빈 줄 출력
    }

    keyboard.close();
  }

  private static void printCommandHistory(Iterator<String> iterator) {
    try {
      int count = 0;
      while (iterator.hasNext()) {
        System.out.println(iterator.next());
        if (++count % 5 == 0) {
          System.out.print(":");
          String input = keyboard.nextLine();
          if (input.equalsIgnoreCase("q"))
            break;
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private static String prompt() {
    System.out.print("명령> ");
    return keyboard.nextLine().toLowerCase();
  }

  private static void quit() {
    saveLessonDate();
    saveMemberDate();
    saveBoardDate();
    System.out.println("안녕!");
  }

  private static void loadLessonData() {
    try (FileReader in = new FileReader("lesson.csv"); 
        Scanner in2 = new Scanner(in)){ // Scanner 는 데코레이터패턴이아니다 수퍼클래스가다르기때문에 (한줄씩읽기위해사용)
      // () 안에서는 세미콜론을 안찍어도된다.
      while (true) {       
        //레슨리스트에 add하는것은 당연히 Lesson객체이다. Lesson.vlaueOf에주는 파라미터는 파일에서 읽어들인값이다.
        lessonList.add(Lesson.valueOf(in2.nextLine()));
      }

    } catch (FileNotFoundException e) {
      e.printStackTrace();

    } catch (IOException e) { // 위의 catch와 다른블럭이기때문에 같은 e를써도 괜찮다 다른e다.
      e.printStackTrace();

    } catch (NoSuchElementException e) { 
      System.out.println("수업 데이터 로딩 완료!");
    }
  }

  public static void saveLessonDate() {
    Lesson.outWrite(lessonList); // OutWrite메서드로 빼줬다.
    
  }
  
  private static void loadMemberData() {
    try (FileReader in = new FileReader("member.csv"); 
        Scanner in2 = new Scanner(in)){ // Scanner 는 데코레이터패턴이아니다 수퍼클래스가다르기때문에 (한줄씩읽기위해사용)
      // () 안에서는 세미콜론을 안찍어도된다.
      while (true) {       
        //레슨리스트에 add하는것은 당연히 Lesson객체이다. Lesson.vlaueOf에주는 파라미터는 파일에서 읽어들인값이다.
        memberList.add(Member.valueOf(in2.nextLine()));
      }

    } catch (FileNotFoundException e) {
      e.printStackTrace();

    } catch (IOException e) { // 위의 catch와 다른블럭이기때문에 같은 e를써도 괜찮다 다른e다.
      e.printStackTrace();

    } catch (NoSuchElementException e) { 
      System.out.println("회원 데이터 로딩 완료!");
    }
  }

  public static void saveMemberDate() {
    Member.outWrite(memberList); // OutWrite메서드로 빼줬다.
    
  }

  private static void loadBoardData() {
    try (FileReader in = new FileReader("board.csv"); 
        Scanner in2 = new Scanner(in)){ // Scanner 는 데코레이터패턴이아니다 수퍼클래스가다르기때문에 (한줄씩읽기위해사용)
      // () 안에서는 세미콜론을 안찍어도된다.
      while (true) {       
        //레슨리스트에 add하는것은 당연히 Lesson객체이다. Lesson.vlaueOf에주는 파라미터는 파일에서 읽어들인값이다.
        boardList.add(Board.valueOf(in2.nextLine()));
      }

    } catch (FileNotFoundException e) {
      e.printStackTrace();

    } catch (IOException e) { // 위의 catch와 다른블럭이기때문에 같은 e를써도 괜찮다 다른e다.
      e.printStackTrace();

    } catch (NoSuchElementException e) { 
      System.out.println("게시판 데이터 로딩 완료!");
    }
  }

  public static void saveBoardDate() {
    Board.outWrite(boardList); // OutWrite메서드로 빼줬다.
    
  }
}

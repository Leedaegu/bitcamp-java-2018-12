// 연습 - 게시물 등록
package ch25.b.two;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class BoardInsertApp {

  // 다음과 같이 게시물을 등록하는 프로그램을 작성하라!
  // ----------------------------
  // 제목? aaa
  // 내용? bbb
  // 등록하시겠습니까?(Y/n) y
  // 등록하였습니다.
  // 등록하시겠습니까?(Y/n) n
  // 등록을 취소 하였습니다.
  //----------------------------
  public static void main(String[] args) {
    
    String title;
    String contents;
    
    try(Scanner keyboard = new Scanner(System.in)) {

      System.out.print("제목? ");
      title = keyboard.nextLine();

      System.out.print("내용? ");
      contents = keyboard.nextLine();

      System.out.print("등록 하시겠습니까?(Y/n) ");
      String input = keyboard.nextLine();

      if(!input.equalsIgnoreCase("y") && 
          input.length() != 0) {
        System.out.println("등록을 취소 하였습니다.");
        return;
      }
    }

    try (Connection con = DriverManager.getConnection(
        "jdbc:mariadb://localhost/bitcampdb?user=bitcamp&password=1111")) {
      
      System.out.println("DBMS에 연결됨!");

      try (Statement stmt = con.createStatement()) {

//        stmt.executeUpdate(
//            "insert into x_board(title,contents)"
//                + " values('" + title + "','" + contents + "')");
        
        stmt.executeUpdate(
            String.format(
            "insert into x_board(title,contents) values('%s','%s')", title, contents));
            

        System.out.println("등록하였습니다.");

      } // Statement try
      
    } catch (Exception e) {
      System.out.println("DBMS에 연결 실패!");
      e.printStackTrace();

    }
    
  } //main
}

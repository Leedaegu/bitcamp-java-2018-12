// 연습 - 게시물 변경
package ch25.b.two;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class BoardUpdateApp {

  // 다음과 같이 게시물을 변경하는 프로그램을 작성하라!
  // ----------------------------
  // 번호? 1
  // 제목? xxx
  // 내용? xxxxx
  // 변경하였습니다.
  // (또는)
  // 해당 번호의 게시물이 존재하지 않습니다.
  //----------------------------
  public static void main(String[] args) {

    int no = 0;
    String title = null;
    String contents = null; 

    try(Scanner keyboard = new Scanner(System.in)) {
      System.out.print("번호? ");
      no = Integer.parseInt(keyboard.nextLine());

      System.out.print("제목? ");
      title = keyboard.nextLine();

      System.out.print("내용? ");
      contents = keyboard.nextLine();
    }

    try (Connection con = DriverManager.getConnection(
        "jdbc:mariadb://localhost/bitcampdb?user=bitcamp&password=1111")) {
      System.out.println("DBMS에 연결됨!");

      try (Statement stmt = con.createStatement()) {

        //        int count = stmt.executeUpdate(
        //            "update x_board set"
        //                + " title = '" + title
        //                + "', contents = '" + contents + "'"                
        //                + " where board_id = " + no);

        int count = stmt.executeUpdate(
            String.format(
                "update x_board set title = '%s', contents = '%s' where board_id = %d",
                title, contents, no));

        if (count == 0) {
          System.out.println("해당 번호의 게시물이 존재하지 않습니다.");
        } else {
          System.out.println("변경하였습니다.");
        }
      }

    } catch (Exception e) {
      System.out.println("DBMS에 연결중 오류발생!");
      e.printStackTrace();
    }

  } // main
}






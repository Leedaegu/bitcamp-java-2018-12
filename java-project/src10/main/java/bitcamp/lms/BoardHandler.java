package bitcamp.lms;

import java.sql.Date;
import java.util.Scanner;

public class BoardHandler {
  static Scanner keyboard;

  static final int LENGTH = 10;
  static Board[] boards = new Board[LENGTH];
  static int boardIDX = 0;

  static void listBoard() {
    for (int i = 0; i < boardIDX; i++) {
      System.out.printf("%d, %s, %s, %s\n",
          boards[i].no, boards[i].contents, boards[i].createdDate, boards[i].viewCount);
    }
  }

  static void addBoard() {
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
  }


}

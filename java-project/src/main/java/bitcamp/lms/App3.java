package bitcamp.lms;

import java.util.Scanner;
import bitcamp.lms.Board;

public class App3 {

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    final int LENGTH = 10;
    Board[] boards = new Board[100];

    //    for (int i = 0; i < boards.length; i++) {
    //      boards[i] = new Board();
    //    }


    int size = 0;
    while(size < LENGTH) {
      Board board = new Board();
      System.out.print("번호? ");
      board.number = keyboard.nextInt();
      keyboard.nextLine();

      System.out.print("내용? ");
      board.contents = keyboard.nextLine();
      
      boards[size] = board;

      size++;

      System.out.print("\n계속 입력하시겠습니까?(y/n) ");
      String input = keyboard.nextLine();
      System.out.println();

      if (!input.equalsIgnoreCase("y")) {
        break;
      }
      System.out.println();
    }
    keyboard.close();
    System.out.println();
    
    int i = 0;
    while(i < size) {
      System.out.printf("번호:%d", boards[i].number);
      System.out.printf(" 내용:%s", boards[i].contents);
      System.out.print(" 작성일:2019-01-01");
      System.out.print(" 조회수:0\n");
      i++;
    }
  }
}

package bitcamp.lms;

import java.util.Scanner;
import java.sql.Date;

public class App3 {

  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    final int LENGTH = 10;
    
    Board[] boards = new Board[LENGTH];
    
    int index = 0;
    while (index < LENGTH){
      Board board = new Board();
      
      System.out.print("번호? ");
      board.no = Integer.parseInt(keyboard.nextLine());

      System.out.print("내용? ");
      board.contents = keyboard.nextLine();

      board.createdDate = new Date(System.currentTimeMillis());

      board.viewCount = 0;

        boards[index] = board;
      
      index++;

      System.out.print("\n계속 입력하시겠습니까(y/n) ");
      String answer = keyboard.nextLine();
      System.out.println();
      
      if (!answer.equalsIgnoreCase("y"))
        break;

    }

    keyboard.close();

    System.out.println();


    for (int i = 0; i < index; i++) {
      System.out.printf("%d, %s, %s, %s\n",
          boards[i].no, boards[i].contents, boards[i].createdDate, boards[i].viewCount);
     
    }




  }
}

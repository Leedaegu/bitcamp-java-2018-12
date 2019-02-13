package com.eomcs.lms.handler;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Date;
import java.util.List;
import java.util.Scanner;
import com.eomcs.lms.domain.Board;

public class BoardUpdateCommand implements Command {

  Scanner keyboard;
  List<Board> list;

  public BoardUpdateCommand(Scanner keyboard) {
    this.keyboard = keyboard;
  }

  @Override
  public void execute(ObjectInputStream in, ObjectOutputStream out) {
    Board board = new Board();
    
    System.out.print("번호? ");
    board.setNo(Integer.parseInt(keyboard.nextLine()));
    System.out.print("내용? ");
    board.setContents(keyboard.nextLine());
    
    board.setCreatedDate(new Date(System.currentTimeMillis()));     
    board.setViewCount(0);
    
    try {
      out.writeUTF("/board/update");
      out.flush();
      if (!in.readUTF().equals("OK"))
        throw new Exception("서버에서 해당 명령어를 처리하지 못합니다.");

      out.writeObject(board);
      out.flush();

      String status = in.readUTF();

      if (status.equals("OK"))
        System.out.println("데이터 변경 성공!");
      else
        throw new Exception("데이터 변경 실패!");

    } catch (Exception e) {
      System.out.printf("게시글 변경 오류! : %s\n", e.getMessage());

    }

  }
}

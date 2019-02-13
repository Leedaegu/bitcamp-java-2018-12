package com.eomcs.lms.handler;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class LessonDeleteCommand implements Command {

  Scanner keyboard;

  public LessonDeleteCommand(Scanner keyboard) {
    this.keyboard = keyboard;
  }

  @Override
  public void execute(ObjectInputStream in, ObjectOutputStream out) {
    System.out.print("번호? ");
    int no = Integer.parseInt(keyboard.nextLine());

    try {
      out.writeUTF("/lesson/delete");
      out.flush();
      if (!in.readUTF().equals("OK"))
        throw new Exception("서버에서 해당 명령어를 처리하지 못합니다.");

      out.writeInt(no);
      out.flush();

      String status = in.readUTF();

      if (status.equals("OK"))
        System.out.println("데이터 삭제 성공!");
      else
        throw new Exception("데이터 삭제 성공!");

    } catch (Exception e) {
      System.out.printf("수업 데이터 삭제 오류! : %s\n", e.getMessage());
    }
  }
}

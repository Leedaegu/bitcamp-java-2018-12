package com.eomcs.lms.handler;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Date;
import java.util.List;
import java.util.Scanner;
import com.eomcs.lms.domain.Lesson;

public class LessonUpdateCommand implements Command {

  Scanner keyboard;

  public LessonUpdateCommand(Scanner keyboard) {
    this.keyboard = keyboard;
  }

  @Override
  public void execute(ObjectInputStream in, ObjectOutputStream out) {
    Lesson lesson = new Lesson();

    System.out.print("번호? ");
    int no = Integer.parseInt(keyboard.nextLine());

    int index = indexOfLesson(no);
    if (index == -1) {
      System.out.println("해당 수업을 찾을 수 없습니다.");
      return;
    }

    Lesson lesson = list.get(index);

    Lesson temp = lesson.clone();

    System.out.printf("수업명(%s)? ", lesson.getTitle());
    String input = keyboard.nextLine();
    if (input.length() > 0) 
      temp.setTitle(input);

    System.out.printf("설명(%s)? ", lesson.getContents());
    if ((input = keyboard.nextLine()).length() > 0)
      temp.setContents(input);

    System.out.printf("시작일(%s)? ", lesson.getStartDate());
    if ((input = keyboard.nextLine()).length() > 0)
      temp.setStartDate(Date.valueOf(input));

    System.out.printf("종료일(%s)? ", lesson.getEndDate());
    if ((input = keyboard.nextLine()).length() > 0)
      temp.setEndDate(Date.valueOf(input));

    System.out.printf("총수업시간(%d)? ", lesson.getTotalHours());
    if ((input = keyboard.nextLine()).length() > 0)
      temp.setTotalHours(Integer.parseInt(input));

    System.out.printf("일수업시간(%d)? ", lesson.getDayHours());
    if ((input = keyboard.nextLine()).length() > 0)
      temp.setDayHours(Integer.parseInt(input));

    out.writeUTF("/lesson/update");
    out.flush();
    if (!in.readUTF().equals("OK"))
      return;

    out.writeObject(lesson);
    out.flush();

    String status = in.readUTF();

    if (status.equals("OK"))
      System.out.println("데이터 변경 성공!");
    else
      System.out.println("데이터 변경 실패!");

  }


}

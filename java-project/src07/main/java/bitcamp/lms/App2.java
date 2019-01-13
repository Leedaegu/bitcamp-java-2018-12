package bitcamp.lms;

import java.util.Scanner;
import java.util.Date;

public class App2 {

  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    final int LENGTH = 10;

    Member[] members = new Member[LENGTH];

    int index = 0;

    while (index < LENGTH) {
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
      member.tell = keyboard.nextLine();

      member.registeredDate = new Date(System.currentTimeMillis());

      members[index] = member;
      
      index++;

      System.out.print("\n계속 입력하시겠습니까?(Y/n) ");
      String answer = keyboard.nextLine();
      System.out.println();

      if(!answer.equalsIgnoreCase("y")) 
        break;
    }

    keyboard.close();

    int count = 0;
    while (count < index) {


      System.out.printf("번호: %d ", members[count].no);
      System.out.printf("이름: %s ", members[count].name);
      System.out.printf("이메일: %s ", members[count].email);
      System.out.printf("암호: %s ", members[count].password);
      System.out.printf("사진: %s ", members[count].photo);
      System.out.printf("전화: %s ", members[count].tell);
      System.out.printf("가입일: %s\n", members[count].registeredDate);
      count++;

    }
  }
}

package bitcamp.lms.handler;

import java.sql.Date;
import java.util.Scanner;
import bitcamp.lms.domain.Member;

public class MemberHandler {  

  public static Scanner keyboard;
  static final int LENGTH = 10;   
  static Member[] members = new Member[LENGTH];
  static int memberIdx = 0;

  public static void listMember() {
    for (int size = 0; size < memberIdx; size++) {
      System.out.printf("%d, %s, %s, %s, %s, %s, %s\n",
          members[size].no, members[size].name, members[size].email,members[size].password,
          members[size].photo, members[size].tell, members[size].registeredDate);
    }
  }

  public static void addMember() {
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

    members[memberIdx] = member;        
    memberIdx++;

    System.out.println("저장하였습니다.");
  }




}

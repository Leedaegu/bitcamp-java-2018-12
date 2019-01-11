package bitcamp.lms;

import java.util.Scanner;

public class App2 {

  public static void main(String[] args) {
    
    Scanner keyboard = new Scanner(System.in);
    
    int LENGTH = 10;
    Member[] members = new Member[LENGTH];

    int i = 0;
    while(i < LENGTH) {
      
      bitcamp.lms.Member member = new bitcamp.lms.Member();
      
      System.out.print("번호? ");
      member.number = Integer.parseInt(keyboard.nextLine());

      System.out.print("이름? ");
      member.name = keyboard.nextLine();

      System.out.print("이메일? ");
      member.email = keyboard.nextLine();

      System.out.print("암호? ");
      member.code = keyboard.nextInt();
      keyboard.nextLine();

      System.out.print("사진? ");
      member.picture = keyboard.nextLine();

      System.out.print("전화? ");
      member.tell = keyboard.nextLine();
          
      members[i] = member;
        
      i++;

      System.out.println();
      System.out.print("계속 입력하시겠습니까?(Y/n) ");
      String answer = keyboard.nextLine();
      if (!answer.equals("y") && !answer.equals("Y")) {
        break;
      
      }

      System.out.println();
    }

    keyboard.close();
    System.out.println();

    
    for (int j = 0; j < i; j++) {

      System.out.printf("%d, %s, %s, %s" + "2019-01-01\n",
          members[j].number ,members[j].name ,members[j].email ,members[j].tell);
    
    }
  }
}
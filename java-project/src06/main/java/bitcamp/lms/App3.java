package bitcamp.lms;

import java.util.Scanner;
import java.sql.Date;

public class App3 {

  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    int[] no = new int[100];
    String[] contents = new String[100];
    Date[] createdDate = new Date[100];
    int[] viewCount = new int[100];

    int index = 0;

    while (index < 100){

      System.out.print("번호? ");
      no[index] = Integer.parseInt(keyboard.nextLine());

      System.out.print("내용? ");
      contents[index] = keyboard.nextLine();

      createdDate[index] = new Date(System.currentTimeMillis());

      viewCount[index] = 0;

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
      System.out.printf("%d, %s, %s, %s\n", no[i], contents[i], createdDate[i], viewCount[i]);
     
    }




  }
}

package bitcamp.lms;

public class App3 {

  public static void main(String[] args) {
    java.util.Scanner keyboard = new java.util.Scanner(System.in);

    int[] number = new int[100];
    String[] contents = new String[100];

    int i = 0;

    while(true) {
      System.out.print("번호? ");
      number[i] = keyboard.nextInt();
      keyboard.nextLine();

      System.out.print("내용? ");
      contents[i] = keyboard.nextLine();

      i++;

      System.out.print("\n계속 입력하시겠습니까?(y/n) ");
      String input = keyboard.nextLine();
      System.out.println();

      if (!input.equalsIgnoreCase("y"))
        break;
    }
    keyboard.close();

    int i2 = 0;
    while(i2 < i) {
      System.out.printf("번호:%d", number[i2]);
      System.out.printf(" 내용:%s", contents[i2]);
      System.out.print(" 작성일:2019-01-01");
      System.out.print(" 조회수:0");
      i2++;
    }
  }
}

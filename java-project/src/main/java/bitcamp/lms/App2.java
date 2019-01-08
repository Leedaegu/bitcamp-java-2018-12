package bitcamp.lms;

public class App2 {

  public static void main(String[] args) {
    java.util.Scanner keyboard = new java.util.Scanner(System.in);

    int[] number = new int[10];
    String[] name = new String[10];
    String[] email = new String[10];
    int[] code = new int[10];
    String[] picture = new String[10];
    String[] tell = new String[10];

    int i = 0;
    while(i < 10) {
      System.out.print("번호? ");
      number[i] = Integer.parseInt(keyboard.nextLine());

      System.out.print("이름? ");
      name[i] = keyboard.nextLine();

      System.out.print("이메일? ");
      email[i] = keyboard.nextLine();

      System.out.print("암호? ");
      code[i] = keyboard.nextInt();
      keyboard.nextLine();

      System.out.print("사진? ");
      picture[i] = keyboard.nextLine();

      System.out.print("전화? ");
      tell[i] = keyboard.nextLine();

      i++;

      System.out.println();
      System.out.print("계속 입력하시겠습니까?(Y/n) ");

      String answer = keyboard.nextLine();
      if (!answer.equals("y") && !answer.equals("Y")) {
        break;
      }


    }

    keyboard.close();
    for (int j = 0; j < i; j++) {

      System.out.printf("%d, %s, %s, %s" + "2019-01-01\n",
          number[j],name[j],email[j],tell[j]);
    }
  }
}
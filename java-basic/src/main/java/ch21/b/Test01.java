// 예외 처리하기 - try ~ catch ~ finally
package ch21.b;

import java.util.Scanner;

public class Test01 {

  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);
    System.out.print("숫자를 입력하세요: ");

    String input = keyboard.nextLine();

    try {

      // 예외가 발생할 수 있는 코드를 두는 블록
      int value = Integer.parseInt(input);
      System.out.println(value % 2 == 0 ? "짝수입니다." : "홀수 입니다.");
      //  return;

    } catch(Exception e) {
      // 예외가 발생했을 때 실행되는 블록
      System.out.println("입력 값이 유효하지 않습니다.\n정수 값을 입력하세요!");
      //  return;

    } finally {
      // 정상적으로 실행하는 예외가 발생되든 무조건 맨 마지막에 실행되는 블록
      // => 필수 블록이 아니다. 생략해도 된다.
      System.out.println("종료합니다.");
      keyboard.close();

    }


  }

}



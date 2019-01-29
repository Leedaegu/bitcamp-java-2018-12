// 예외 던지기 - 리턴 값으로 예외를 보고하는 경우
package ch21.d;

import java.util.ArrayList;

public class Test02 {
  static ArrayList<String> list = new ArrayList<>();

  public static void main(String[] args) {
    addName("홍길동");
    addName("임꺽정");
    addName(null);
    addName(null);
    addName("유관순");

    // Exception 계열(RuntimeException 제외)의 예외가 발생하는 메서드를 호출할 때는
    // 반드시 예외 처리를 해야 한다.
    for (int i = 0; i < list.size(); i++) {
      String name = getName(i);

      if (name == null) {
        System.out.println("목록에서 데이터를 꺼내는 중에 오류 발생!");
      } else {
        System.out.println(getName(i));
      }     
    }

    System.out.printf("입력된 이름 개수는 %d 입니다.\n", list.size());
    // int result = divide(1000, 7); // OK!
    // int result = divide(1000, 0); // OK! 예외임을 알 수 있다.
    int result = divide(1919191919, -1); // 정상적인 나누기 임에도 불구하고
    if (result == -1919191919) { // 리턴 값이 -1919191919 이기 때문에 오류로 판단한다.
      System.out.println("나누기 오류 입니다.");
    } else {
      System.out.println(result);
    }

  }

  static void addName(String name) {
    list.add(name);
  }

  // 2) 예외를 보고하기
  static String getName(int index) {
    if(index < 0 || index >= list.size())
      return null;

    return list.get(index);

  }
  static int divide(int a, int b) {
    if (b == 0) {
      // 호출자에게 어떤 값으로 알려줘야 오류를 전달할 수 있을까?
      return -1919191919;
    }
    return a / b;
  }

}

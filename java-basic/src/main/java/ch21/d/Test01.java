// 예외 던지기 - 예외를 보고하지 않는경우
package ch21.d;

import java.util.ArrayList;

public class Test01 {
  static ArrayList<String> list = new ArrayList<>();

  public static void main(String[] args) {
    addName("홍길동");
    addName("임꺽정");
    addName("유관순");

    System.out.println(getName(0));
    System.out.println(getName(1));
    System.out.println(getName(2));
    System.out.println(getName(3)); // 예외 발생! 즉시 보고! 즉시 종료!

    System.out.printf("입력된 이름 개수는 %d 입니다.\n", list.size());
  }

  static void addName(String name) {
    list.add(name);
  }

  // 1) 예외 상황을 보고하지 않는 경우
  static String getName(int index) {
    return list.get(index);
  }

}

  // 메서드 - 정의하고 사용하는 방법
package ch06;

public class Test01 {
  public static void main(String[] args) {
    m1();
    m2();
    m1();
    m2();
  } 
  //메서드 정의(definition) 변수는 선언이라하고 메서드는 정의라고한다.
  static void m1() {
    System.out.println("Hello, ");
  }
  static void m2() {
    System.out.println("World!");
  }
}

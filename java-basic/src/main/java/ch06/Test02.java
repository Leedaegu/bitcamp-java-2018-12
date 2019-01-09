// 메서드 - 정의하고 사용하는 방법
package ch06;

public class Test02 {
  public static void main(String[] args) {
    m1("홍길동", 20);
    m1("홍길동", 21);
    m1("홍길동", 22);
  } 
  //메서드 정의(definition) 변수는 선언이라하고 메서드는 정의라고한다.
  static void m1(String name, int age ) {
    System.out.printf("이름: %s\n", name);
    System.out.printf("나이: %d\n", age);
  }

}


// Lambda 문법 - 람다 파터미터 2
package ch19.h;

public class Test04 {

  // 다음과 같이 추상메서드가 한 개 있는 인터페이스를 "functional interface"라고 부른다.
  // => 이런 경우에 람다 문법을 사용할 수 있다.
  static interface player {
    void play(String name, int age); 
  }

  public static void main(String[] args) {

    // 1) 파라미터는 괄호() 안에 선언한다.
    player p1 = (String name, int age) ->
    System.out.printf("%s(%d)님 환영합니다!\n", name, age);
    p1.play("홍길동", 20);

    // 2) 파라미터 타입을 생략할 수 있다.
    player p2 = (name, age) ->
    System.out.printf("%s(%d)님 환영합니다!\n", name, age);
    p2.play("임꺽정", 30);

    // 3) 파라미터가 여러 개일 때는 괄호를 생략할 수 없다.
/*  player p3 = name, age ->
    System.out.printf("%s(%d)님 환영합니다!\n", name, age);
    p3.play("임꺽정", 30);
*/    
  }
}

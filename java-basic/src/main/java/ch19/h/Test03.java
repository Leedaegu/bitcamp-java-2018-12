// Lambda 문법 - 람다 파터미터 1
package ch19.h;

public class Test03 {

  // 다음과 같이 추상메서드가 한 개 있는 인터페이스를 "functional interface"라고 부른다.
  // => 이런 경우에 람다 문법을 사용할 수 있다.
  static interface player {
    void play(String name); 
  }

  public static void main(String[] args) {

    // 1) 파라미터는 괄호() 안에 선언한다.
    player p1 = (String name) -> System.out.println(name + "님 환영합니다!");
    p1.play("홍길동");

    // 2) 파라미터 타입을 생략할 수 있다.
    player p2 = (name) -> System.out.println(name + "님 환영합니다!");
    p2.play("임꺽정");
   
    // 3) 파라미터가 한 개일 때는 괄호도 생략할 수 있다.
    player p3 = name -> System.out.println(name + "님 환영합니다!");
    p3.play("안중근");
    
  }
}

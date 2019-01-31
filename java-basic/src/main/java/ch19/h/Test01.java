// Lambda 문법 - functional interface를 효과적으로 다루는 문법
package ch19.h;

public class Test01 {

  // 다음과 같이 추상메서드가 한 개 있는 인터페이스를 "functional interface"라고 부른다.
  // => 이런 경우에 람다 문법을 사용할 수 있다.
  static interface player {
    void play(); 
  }

  public static void main(String[] args) {
    // 익명 클래스로 인터페이스 구현하기
    player p1 = new player() {
      public void play() {
        System.out.println("테스트2");
      }
    };
    p1.play();

    // 람다 클래스로 인터페이스 구현하기
    player p2 = () -> {
      System.out.println("테스트2");
    };
    p2.play();
    
  }
}

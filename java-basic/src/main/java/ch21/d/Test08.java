//예외 던지기 - RuntimeException 예외 던지기 3
package ch21.d;

public class Test08 {

  public static void main(String[] args) {
    // RuntimeException 도 Exception과 마찬가지로
    // main()에서는 예외를 처리해야한다.
    // 정상적인 프로그램 종료를 해야한다.
    try {
    m3();
    } catch (Exception e) {
      System.out.println(e.toString());
    }
    System.out.println("종료!");
  }

  static void m3() {
    m2();
  }

  static void m2() {
    m1();
  }

  static void m1() throws RuntimeException {
    //RuntimeException 예외가 최초로 발생되는 메서드를 만들 때는
    // 가능한 메서드 선언부의 throws 절에 어떤 예외가 발생하는지 적어라!
    // 왜? 다른 개발자가 알아볼수 있도록
    // RuntimeException은 안 적어도 되지만, 가능한 다른 개발자가 알아볼수 있도록 적어라!
    throw new RuntimeException("m1()에서 발생한 예외");
  }

}









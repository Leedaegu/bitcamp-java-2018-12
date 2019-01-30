//예외 던지기 - RuntimeException 예외 던지기 2
package ch21.d;

public class Test07 {

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

  static void m1() {
    //RuntimeException 예외를 발생시키는 메서드는
    // 메서드 선언부에 어떤 예외를 던지는지 선언(보고)하지 않아도 된다.
    throw new RuntimeException("m1()에서 발생한 예외");
  }

}









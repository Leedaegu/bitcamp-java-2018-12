package ch09;

public class Calculator3 {

  // 클래스에서 공통으로 관리하지 않고
  // 개별적으로 관리해야 할 값이 있다면 인스턴스 필드로 선언한라!
  int result = 0;// <==인스턴스 필드 = 논스태틱(non-static) 필드

  static void plus(Calculator3 that, int a) {
    //result가 더이상 클래스 필드가 아니기 때문에 다음과 같이 사용할 수 없다.
    //result += a; //컴파일 오류!
    that.result += a;
  }

  static void minus(Calculator3 that, int a) {
    //result - a;
    that.result -= a;
  }

  static void multiple(Calculator3 that, int a) {
    //result *= a;
    that.result *= a;
  }

  static void divide(Calculator3 that, int a) {
    //result /= a;
    that.result /= a;
  }

}
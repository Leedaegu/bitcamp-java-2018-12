package ch09;

public class Calculator4 {

  int result = 0;// <==인스턴스 필드 = 논스태틱(non-static) 필드

  
  void plus(int a) {
    this.result += a;
  }

  void minus(int a) {
    result -= a;
  }

  void multiple(int a) {
    this.result *= a;
  }

  void divide(int a) {
    result /= a;
  }

}
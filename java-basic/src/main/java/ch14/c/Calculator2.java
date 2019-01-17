// 오버로딩(overloading) - 같은 이름의 메서드를 여러 개 정의할 수 있다.
package ch14.c;

public class Calculator2 extends Calculator {

  public void minus(int a, int b) {
    this.result -= (a + b);
  }
}

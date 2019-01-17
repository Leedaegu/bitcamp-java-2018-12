// 오버로딩(overloading) - 같은 이름의 메서드를 여러 개 정의할 수 있다.
package ch14.c;

public class Calculator {
  int result;
  
  public void plus(int value) {
    this.result += value;
  }
  
  public void plus(int v1, int v2) {
    this.result += v1 + v2;
  }
  
  public void plus(int[] arr) {
    for (int value : arr)
    this.result += value;
  }
  
  
  
  public void minus(int value) {
    this.result -= value;

  }
}

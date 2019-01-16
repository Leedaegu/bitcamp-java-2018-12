package ch13.a;
  

public class Calculator2 {
  // Calculator2에 곱하기, 나누기 기능을 추가하려면
  // 기존의 코드를 그대로 복사해야 한다.
  private int result;

  public int getResult() {
    return this.result;
  }

  public void plus(int value) {
    this.result += value;

  }

  public void minus(int value) {
    this.result -= value;

  }

  public void multiple(int value) {
    this.result *= value;
    
  }
  
  public void divide(int value) {
    this.result /= value;
    
  }
  
}

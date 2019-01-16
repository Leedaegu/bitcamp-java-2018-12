package ch13.b;

import ch13.Calculator;

// 기존 클래스의 기능을 상속 받겠다고 선언한다
// 기존 클래스의 기능을 내 것처럼 사용하겠다고 선언하는 것이다.


public class Calculator2 extends Calculator{

  public void multiple(int value) {
    
    this.result *= value;
    
  }
  
  public void divide(int value) {
    this.result /= value;
    
  }
  
}

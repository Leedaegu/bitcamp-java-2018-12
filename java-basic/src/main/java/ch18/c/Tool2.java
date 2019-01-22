// 다중 인터페이스를 구현하지 못하는 경우 - 메서드명과 파라미터는 같은데 리턴 타입이 다른 경우
package ch18.c;

// 한 클래스가 여러 규칙에 따라 동작하도록 정의할 수 있는데
// 불가능한 경우가 있다.

public class Tool2 implements ProtocolA, ProtocolC {

  @Override
  public void m1() {
    System.out.println("Tool.m1()");    
  }

  // 다음 메서드는 ProtocolA 규칙은 만족시키지만 ProtocolC 규칙은 만족시키지 못한다.
  @Override
  public void m2() {    
    System.out.println("Tool.m2()");
  }
  
  @Override
  public void m3() {    
    System.out.println("Tool.m3()");
  }
  
  


}

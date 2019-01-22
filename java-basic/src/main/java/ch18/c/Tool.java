// 다중 인터페이스 구현 - 한 클래스는 여러 규칙을 준수할 수 있다.
package ch18.c;

// 한 클래스가 여러 규칙에 따라 동작하도록 정의할 수 있다.

public class Tool implements ProtocolA, ProtocolB {

  @Override
  public void m1() {
    System.out.println("Tool.m1()");    
  }

  // m2()는 ProtocolA와 ProtocolB 모두 만족시킨다.
  @Override
  public void m2() {    
    System.out.println("Tool.m2()");
  }
  
//  @Override
//  public void m2() {
//    System.out.println("Tool.m2()");
//  }
  
  @Override
  public void m3() {    
    System.out.println("Tool.m3()");
  }
  
  


}

// 서브 인터페이스 구현 - 수퍼 인터페이스의 메서드까지 모두 구현해야 한다.
package ch18.d;

public class Tool implements ProtocolA3 {
  
  @Override
  public void m1() {
    System.out.println("Tool.m1()");
  }
  
  @Override
  public void m2() {
    System.out.println("Tool.m2()");
  }
  
  @Override
  public void m3() {
    System.out.println("Tool.m3()");
  }
  
  @Override
  public void m4() {
    System.out.println("Tool.m4()");
  }
  
}

// 인터페이스 구현 - 접근 범위를 좁힐 수는 없다.
package ch18.b;

public abstract class Tool implements SpecA {
 
  @Override
 // private void m1() {} //컴파일 오류!
 // protected void m1() {} //컴파일 오류!
 // void m1() {} //컴파일 오류!
  public void m1() {}
 // public void m2() {}
}

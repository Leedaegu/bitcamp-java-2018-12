// 인터페이스 정의 - public과 abstract는 생략할 수 있다.
package ch18.b;

public interface SpecA {

  // 컴파일 오류
  // private abstract void m1();
  // protected abstract void m1();
  
  // OK!
  // public abstract void m1();  
  // abstract void m1();
  void m1();
  void m2();
}

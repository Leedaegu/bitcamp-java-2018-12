// 추상 메서드와 추상 클래스
package ch17.a;

// 추상 메서드는 클래스는 추상 클래스만 가질 수 있다.

public abstract class A {
  
  public void m1() {
    System.out.println("A.m1()");
    
    }
  
  public abstract void m2(String name);
}

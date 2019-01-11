//클래스 필드 공유
package ch08;

public class Test05 {

  static int a;
  
  public static void main(String[] args) {
    a = 100; //같은 클래스에 소속된 멤버이기 때문에 클래스 명을 생략해도 된다.
    m1();
    m2();
    System.out.println(a);
  }
  static void m1() {
    a = 200;
  }
  static void m2() {
    a = 300;
  }
}

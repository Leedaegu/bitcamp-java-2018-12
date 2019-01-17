// 자바는 다중 상속을 허락하지 않는다.
package ch13.f;

public class Test03 extends A, X { // 컴파일 오류!

  public static void main(String[] args) {
    
    Y obj = new Y();
    
    Test03 obj = new Test03();
    
    obj.m1();
   


  }

}

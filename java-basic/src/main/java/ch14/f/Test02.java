// 다형적 변수의 규칙 2 - 형변환
package ch14.f;

public class Test02 {

  public static void main(String[] args) {
    
    A obj = new B();
    obj.m1();
    // obj.m2(); // 컴파일 에러!
    
    // B obj2 = obj;
        
    B obj2 = (B) obj;
    obj2.m2();
    
    if (obj == obj2) {
      System.out.println("obj == obj2"); 
    }
    
    A obj3 = new A();
    B obj4 = (B) obj3; // 실행오류!
    
    obj3.m1();
    obj4.m2();
    
  }

}

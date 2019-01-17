// 다형적 변수와 오버라이딩 메서드, 그리고 추상 메서드
package ch14.f;

public class Test03 {

  public static void main(String[] args) {
    
   //Car c = new Car();
    
   Car c = new Sedan();
   
   c.run();
  
  }

}

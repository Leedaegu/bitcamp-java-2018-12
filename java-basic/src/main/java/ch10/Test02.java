//클래스 필드와 인스턴스 필드
package ch10;

class My2 {
  // 1)인스턴스 필드
  int a = 100;

  // 2)인스턴스 블록
  {
    System.out.println("인스턴스 블록 실행! => a=" + this.a);
  }
  {
    System.out.println("여러 개의 인스턴스 블록을 가질 수 있다.");
  }
  
  // 3)생성자
  My2() {
    System.out.println("생성자 호출: a=" + this.a);
  }

  // 4)인스턴스 메서드
  void m1() {
    System.out.println("인스턴스 메서드: m1()");
  } 
}
public class Test02 {

  public static void main(String[] args) {
   
    new My2();
    
  }
}

















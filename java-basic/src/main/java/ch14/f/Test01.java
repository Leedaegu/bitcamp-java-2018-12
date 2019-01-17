package ch14.f;

public class Test01 {

  public static void main(String[] args) {
    // 레퍼런스 변수 선언
    // => 어떤 타입의 레퍼런스가 있다면, 그 타입의 인스턴스 주소를 담을 수 있다는 것이다.
    // => 또한 그 타입의 서브 클래스의 인스턴스 주소도 담을 수 있다.
    A obj;
    obj = new A();
    obj.m1();
    
    obj = new B();
   // obj.m2(); // 컴파일 에러
                // 컴파일러는 레퍼런스의 타입으로만 사용할 수 있는 멤버인지 확인한다.
                // 실제 그 레퍼런스가 저장된 인스턴스가 어떤 타입인지는 따지지 않는다.
   
    obj.m1();
  }

}

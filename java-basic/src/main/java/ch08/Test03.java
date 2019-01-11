//클래스 로딩과 클래스 필드의 생성 ,method area의 관계
package ch08;

class My3 {
  //클래스 필드 = 스태틱 필드(변수)
  static int sa;
  //인스턴스 필드
  int ia;
}

public class Test03 {
  public static void main(String[] args) {

    My3.sa = 100;
    My3 obj1 = new My3();
    My3 obj2 = new My3();

    obj1.ia = 200;
    obj2.ia = 300;
    //클래스 이름으로는 인스턴스 필드에 접근할 수 없다.
    //My3.ia = 500; //컴파일 오류!

    obj1.sa = 500;
    //인스턴스 필드에 sa가있는지 찾아보고 없으면 obj1의 클래스에서 자동으로 찾는다.
    //그래서 컴파일 오류를 발생시키지는않지만,
    //가능한 이런식으로 사용하지 말라!
    //다른 개발자가 코드를읽을때 인스턴스 필드로 오해할수있다.
    //클래스 필드는 클래스 이름으로 사용하라!
    
    System.out.println(My3.sa);
  }
}

















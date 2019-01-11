//클래스 로딩과 클래스 필드의 생성 ,method area의 관계
package ch08;

class My2 {
  //클래스 필드
  static String manager = "관리자";
  static String member = "회원";
  static String guest = "손님";
  // new 명령을 실행할 때 힙 메모리에 생성되는 변수이다.  
  String name;
  int age;
  String userType;
}

public class Test02 {
  public static void main(String[] args) {
    System.out.println(My2.manager);
    System.out.println(My2.member);

  }
}

















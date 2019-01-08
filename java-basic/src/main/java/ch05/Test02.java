// 흐름제어문 -if ~ else
package ch05;

public class Test02 {
  public static void main(String[] args) {
    int age = 22;
    
    // 기본 형식
    if (age >= 20)
      System.out.println("성인입니다.");
    else
      System.out.println("미성년입니다.");
       
    // 여러 문장을 실행할 때 블럭으로 묶어야 한다.
    if (age >= 20) {
      System.out.println("-----------");
      System.out.println("성인입니다.");
    }
    else {
      System.out.println("-----------");
      System.out.println("미성년입니다.");
    }
    
    // 대부분의 자바개발자가 사용하는 K & R 스타일.
    if (age >= 20) {
      System.out.println("-----------");
      System.out.println("성인입니다.");
    } else {
      System.out.println("-----------");
      System.out.println("미성년입니다.");
    }
   
    //if 문만 작성할 수 있지만, else 문은 홀로 존재할 수 없다.
   // else 
   //   System.out.println();
    
    
    
    
  } 
}

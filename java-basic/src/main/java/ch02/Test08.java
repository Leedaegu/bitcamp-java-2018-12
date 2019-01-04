 //논리리터럴
package ch02;

public class Test08 {

  public static void main(String[] args) {     
    System.out.println(true);
    System.out.println(false);
    
    //System.out.println((boolean)1); //자바는 정수값을 true/false로 형변환할 수 없다.
    
    //작은 따옴표(single quote)의 리턴값은 2바이트 정수 값(UTF-16코드)이다.
    if ('가' == 0xac00) {  //연산의 결과는 true/false 이다.
      System.out.println("맞다!");
    } else {
      System.out.println("아니다!");
    }
    //컴파일 오류!
   // if(10 - 10) {//c에선 0은 false,그 외의 모든수는 true이다. 자바는아니다!
   //    System.out.println("참이다!");
   //  }
    
  } 
}


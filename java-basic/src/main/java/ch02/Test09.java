 //문자열 리터럴
package ch02;

public class Test09 {

  public static void main(String[] args) {     
   System.out.println("홍길동"); 
   System.out.println("Hello," + "world!"); 
   System.out.println("나이:" + 20); //정수값이 문자열로변경
   System.out.println(false + "<==재직자 여부"); //false가 문자열로변경
   System.out.println("성별:" + '여');
   System.out.println("키:" + 170.5f); //f는 4바이트부동소수점인지 8바이트 부동소수점인지 표현한것이기에 문자열로 변경되지않는다.
  } 
}


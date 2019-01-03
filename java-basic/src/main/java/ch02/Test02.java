package ch02;

public class Test02 {
  public static void main(String[] args) {     
    //20억을 4바이트 리터럴로 출력하라.
    System.out.println(2000000000);
    //20억을 8바이트 리터럴로 출력하라.
    System.out.println(2000000000L);
    System.out.println(2000000000l);
    //30억을 8바이트 리터럴로 출력하라.
    System.out.println(3000000000L);
    
    //30억을 4바이트 리터럴로 출력하라.
    //4바이트는 약21억까지 표현이 가능하므로 30억은 4바이트를 초과하여 컴파일불가능
    //System.out.println(3000000000); <-컴파일 오류
    
    
    
/*4바이트 정수 리터럴
100
  8바이트 정수 리터럴
100l
100L  
  
    
    
    */
  } 
}

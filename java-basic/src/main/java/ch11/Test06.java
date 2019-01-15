// String 클래스 사용법 - 형식 문자열 만들기
package ch11;

public class Test06{
  public static void main(String[] args) {

    String s1 = String.format("%s님의 나이는 %d살입니다.", "홍깅동", 20);
    System.out.println(s1);
    
    String s2 = String.valueOf(true);
    String s3 = String.valueOf(100);
    String s4 = String.valueOf(100l);
    String s5 = String.valueOf(3.14f);
    String s6 = String.valueOf(3.14);
    String s7 = String.valueOf('가');
    
    System.out.println(s2);
    System.out.println(s3);
    System.out.println(s4);
    System.out.println(s5);
    System.out.println(s6);
    System.out.println(s7);
    
 
  }
}

















// String 클래스 사용법 - 힙에 있는 스트링 인스턴스를 상수풀에도 만들기
package ch11;
public class Test04{
  public static void main(String[] args) {

    String s1 = new String("Hello");
    String s2 = new String("Hello");


    if (s1 == s2)
      System.out.println("s1 == s2");
    else
      System.out.println("s1 != s2");


    if (s1.equals(s2))
      System.out.println("s1과 s2의 문자열이 같다.");
    else
      System.out.println("s1과 s2의 문자열이 다르다.");

    String s3 = "hello";
    String s4 = "Hello";

    if (s3.equals(s4)) // 문자열 비교시 대소문자 구분함
      System.out.println("s3.equals(s4)");

    if (s3.equalsIgnoreCase(s4)) // 문자열 비교시 대소문자 구분안함
      System.out.println("s3.equals(s4)");

  }
}

















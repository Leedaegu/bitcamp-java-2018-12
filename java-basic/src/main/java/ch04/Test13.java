// 비트 연산자 : &, |, ^, ~
// => 용도 : 이미지 프로세싱 분야에서 사용됨
package ch04;

public class Test13 {
  public static void main(String[] args) {
 // & => 둘 다 1일 때만 결과는 1이다.
 // | => 둘 중 한 개라도 1이면 결과는 1이다.
    int a = 0xca;
    int b = 0x66;
    System.out.println(a & b);
    
    System.out.println(a | b);
  
    System.out.println(a ^ b);
    
    System.out.println(~a);
    
    int data = 0b1111_1001_0111_1111;
    System.out.println(Integer.toBinaryString(data & 0b0000_1111_1100_0000));
    
    int pixel = 0x003f4478;
    
  } 
}

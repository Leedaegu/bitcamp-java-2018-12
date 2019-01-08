// 논리 연산자: &, |
package ch04;

public class Test11 {
  public static void main(String[] args) {
    //피연산자가 boolean 타입일 때는 && ,|| 와 동일하게 수행한다.
    System.out.println(true & true);
    System.out.println(true & false);
    
    System.out.println(true | false);
    System.out.println(false | false);
    
    //피연삱나가 정수일 때는 비트 연산을 수행한다.
    int a = 0xca;
    int b = 0x66;
    System.out.println(a & b);
    
    System.out.println(a | b);
  } 
}

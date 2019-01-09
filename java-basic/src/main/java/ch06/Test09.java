// 메서드 - 로컬 변수의 생성과 소멸
package ch06;

public class Test09 {


  public static void main(String[] args) {
    int value = 100;
    value = m1(value);
    System.out.println(value);
    
    m1(value + 15);
    System.out.println(value);
    
    m1(value + 115);
    System.out.println(value);
  }
  static int m1(int value) {
    System.out.printf("m1(): %d\n",value);
    value = 200;
    return value;

  }
}
//위 코드를 보고 로컬 변수를 모두 찾아 그이름을 나열하라!
//답: main() - value, args
//     m1() - value\\

//
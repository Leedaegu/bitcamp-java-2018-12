// 메서드 - 정의하고 사용하는 방법
package ch06;

public class Test05 {

  public static void main(String[] args) {
    int result = 1; 
    result = plus(result, 3);
    result = plus(result, 4);
    result = plus(result, 5);
    System.out.println(result);

    result = plus(plus(plus(2, 3), 4), 5);
    System.out.println(result);
  
    System.out.printf("100 + 200 = %d\n", plus(100, 200));
  }
  
  static int plus(int a, int b) {
     return a + b;
  }
}


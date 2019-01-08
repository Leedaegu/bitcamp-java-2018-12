// &&, || vs &, |
package ch04;

public class Test12 {
  public static void main(String[] args) {
    // (괄호연산)
    int a = 5;
    int r = 10 / (a = 2);
    System.out.printf("%d, %d\n", a, r);
    
    // &&와 &의 차이점
    boolean b1 = true;
    boolean b2 = false && (b1 = false);
    System.out.printf("b1=%b ,b2=%b\n ", b1 ,b2);
    
    b1 = true;
    b2 = false & (b1 = false);
    System.out.printf("b1=%b ,b2=%b\n ", b1 ,b2);
    
    b1 = true;
    b2 = true || (b1 = false);
    System.out.printf("b1=%b ,b2=%b\n ", b1 ,b2);
    
    b1 = true;
    b2 = true | (b1 = false);
    System.out.printf("b1=%b ,b2=%b\n ", b1 ,b2);
    
  } 
}

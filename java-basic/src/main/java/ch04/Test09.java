// 후위 연산자 - a++, a--
package ch04;

public class Test09 {
  public static void main(String[] args) {
    int a = 5;
    int r = a++;
    System.out.printf("%d, %d\n" , a , r);
    
    a = 5;
    r = a++ + a++ * a++;
    System.out.printf("%d, %d\n" , a , r);  
  
    a = 5;
    a = a++;
    System.out.println(a);
    int x = 5;
    int y = 10;
    int z = ++x * y--;
    System.out.println(z);
  } 
}

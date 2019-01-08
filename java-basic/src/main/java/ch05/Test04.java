// 흐름제어문 -switch
package ch05;



public class Test04 {
  public static void main(String[] args) {
    byte b = 1;
    byte b2 = 2;
    byte b3 = 3;
    short s = 1;
    char c = 1;
    int i = 1;
    long l = 1;
    float f = 1;
    double d = 1;
    
    switch (b3) {
      case 1:
        System.out.println("11");
        System.out.println("1111");
        break;
      case 2:
        System.out.println("22");
        System.out.println("2222");
        break;
      case 'A':
        System.out.println("AAAA");
      default:
        System.out.println("??????");
    }
    
    
    
    
  } 
}

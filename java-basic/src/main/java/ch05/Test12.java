// 흐름제어문 - for 반복문 1
package ch05; 

public class Test12 {

  public static void main(String[] args) {
    for (int i = 1; i <= 10; i++)
      System.out.print(i + " ");
    System.out.println();
    //    i = 200; 컴파일 오류!! for안에 선언된 변수는 for문을나가면 사용할수없다.

    int i = 1;
    for (; i <= 10; i++)
      System.out.print(i + " ");
    System.out.println();

    i = 1;
    for (; i <= 10;) {
      System.out.print(i + " ");
      i++;
    }
    System.out.println();

    i = 1;
    for (;;) {
      if (i > 10)
        break;
      System.out.print(i + " ");
      i++;
    }
    System.out.println();


  } 
}


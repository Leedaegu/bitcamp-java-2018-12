//캡슐화(encapsulation)필요성
package ch12.a;

public class test02 {

  public static void main(String[] args) {
    
    Score s1 = new Score();
    s1.name = "홍길동";
    s1.kor = 100;
    s1.eng = 90;
    s1.math = 80;
    s1.compute();
    System.out.printf("총점=%d,평균=%.1f\n", s1.sum, s1.aver);


    Score s2 = new Score();
    s2.name = "홍길동";
    s2.kor = 100;
    s2.eng = 90;
    s2.math = 80;
    s2.compute();
    s2.aver = 95.5f;
    
    System.out.printf("총점=%d,평균=%.1f\n", s2.sum, s2.aver);
   
  }

}
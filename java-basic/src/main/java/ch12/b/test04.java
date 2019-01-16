//캡슐화(encapsulation)필요성
package ch12.b;

public class test04 {

  public static void main(String[] args) {

    Score2 s1 = new Score2();
    
    s1.setName("홍길동");
    // 국영수 점수를 직접 변경할 수 없다.
    //s1.kor = 100;
    //s1.eng = 90;
    //s1.math = 80;

    //오직 setter를 통해서만 점수를 설정할 수 있다.
    s1.setKor(100);
    s1.setEng(90);
    s1.setMath(80);

    //s1.compute();
   
    System.out.printf("총점=%d,평균=%.1f\n", s1.getSum(), s1.getAver());

    s1.setKor(70);

    System.out.printf("총점=%d,평균=%.1f\n", s1.getSum(), s1.getAver());

    s1.setEng(-200);
    System.out.printf("총점=%d,평균=%.1f\n", s1.getSum(), s1.getAver());

   
  }

}

// 클래스 ,레퍼런스 ,인스턴스
package ch07;
//클래스
public class Test04 {

  static class Score {
    String name; 
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
  }

  public static void main(String[] args) {
    //레퍼런스
    Score s1;
    //인스턴스
    s1 = new Score();
    Score s2 = new Score();
    //인스턴스 필드
    s1.name = "홍길동";
    s1.kor = 100;
    s1.eng = 100;
    s1.math = 100;

    s2.name = "유관순";
    s2.kor = 90;
    s2.eng = 90;
    s2.math = 90;

    Score a = s1;
    Score a1 = s2;

    a.sum = a.kor + a.eng + a.math;
    a.aver = a.sum / 3f;
    System.out.printf("%s: %d, %d, %d, %d, %.1f\n",
        a.name, a.kor, a.eng, a.math, a.sum, a.aver);

    a1.sum = a1.kor + a1.eng + a1.math;
    a1.aver = a1.sum / 3f;
    System.out.printf("%s: %d, %d, %d, %d, %.1f\n",
        a1.name, a1.kor, a1.eng, a1.math, a1.sum, a1.aver);
  }



}
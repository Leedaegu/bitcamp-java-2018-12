// 클래스 사용 후
package ch07;

public class Test03 {

  static class Score {
    String name; 
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
  }

  public static void main(String[] args) {

    Score s1 = new Score();
    Score s2 = new Score();

    s1.name = "홍길동";
    s1.kor = 100;
    s1.eng = 100;
    s1.math = 100;

    s2.name = "임꺽정";
    s2.kor = 90;
    s2.eng = 90;
    s2.math = 90;


    printScore(s1);
    printScore(s2);
  }

  static void printScore(Score a) {
    a.sum = a.kor + a.eng + a.math;
    a.aver = a.sum / 3f;
    System.out.printf("%s: %d, %d, %d, %d, %.1f\n",
        a.name, a.kor, a.eng, a.math, a.sum, a.aver);
  }

}
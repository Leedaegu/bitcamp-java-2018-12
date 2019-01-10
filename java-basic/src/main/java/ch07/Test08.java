// 인스턴스 배열?
package ch07;

public class Test08 {

  static class Score {
    String name; 
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
  }

  public static void main(String[] args) throws Exception {
    //낱개 변수선언
    int v1, v2 ,v3;

    //int 배열선언
    int[] values = new int[3];


    //낱개의 레퍼런스 선언   
    Score s1, s2, s3;
    //Score 변수 3개를 만드는 배열선언
    Score[] scores = new Score[3];

    //레퍼런스 배열을 기본으로 생성하면 모든 항목이 null로 초기화된다.
    //아직 레퍼런스 배열의 각 항목에 인스턴스 주소가 없는 상태이다.
    // System.out.println(scores[0].name);

    
    scores[0] = new Score();
    scores[1] = new Score();
    scores[2] = new Score();
    
    System.out.println(scores[0].name);
    System.out.println(scores[0].kor);

  }
}


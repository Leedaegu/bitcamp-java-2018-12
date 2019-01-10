// 가비지와 가비지 컬렉터, 그리고 레퍼런스 카운트
package ch07;
//클래스
public class Test06 {

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
    Score s1 = new Score();
    Score s2 = new Score();

    s2 = s1; //s2가 가리키던 원례의 인스턴스주소가 가비지가된다.
             //s1이 가리키던 인스턴스를 이제 s2도 가리킨다.
    
    s1 = new Score(); 
    
  }
}


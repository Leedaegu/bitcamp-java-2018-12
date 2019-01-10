// 로컬변수와 인스턴스필드의 초기
package ch07;

public class Test07 {

  static class Score {
    String name; 
    int kor;
    int eng;
    int math;
    int sum;
    float aver; 
  }

  public static void main(String[] args) throws Exception {
    
    //로컬변수는 자동으로 초기화 되지않는다.
    String name; 
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
    
    
    //초기화되지않은 로컬변수를 사용하려하면 컴파일오류!
    //System.out.println(name); //컴파일 오류!
    
    Score s = new Score();
    System.out.println(s.name);
    System.out.println(s.kor);
    System.out.println(s.aver);
    
  
  }
}


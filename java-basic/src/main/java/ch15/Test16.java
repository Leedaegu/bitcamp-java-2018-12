// Object 클래스 - clone() 사용법 1
package ch15;

// clone() 은 인스턴스를 복제할때 사용하는 메서드이다.

public class Test16 {

  static class Score implements Cloneable{
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;

    public Score() {}

    public Score(String name, int kor, int eng, int math) {
      this.name = name;
      this.kor = kor;
      this.eng = eng;
      this.math = math;
      this.sum = this.kor + this.eng + this.math;
      this.aver = this.sum / 3f;
    }

    @Override
    public String toString() {
      return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", sum="
          + sum + ", aver=" + aver + "]";
    }   

    @Override
    protected Score clone() throws CloneNotSupportedException {
      return (Score) super.clone();
    }
  }

  public static void main(String[] args) throws Exception {
    Score  s1 = new Score("홍길동", 100, 100, 100);

    Score s2 = s1.clone();
    s2.name = "임꺽정";
        
    System.out.println(s1);
    System.out.println(s2);
    
  }
}








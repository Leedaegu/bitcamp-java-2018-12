package ch12.b;

// 계산 결과에 영향을 미치는 필드에도 getter/setter를 적용한다.

public class Score2 {
  private String name;

  private int kor;
  private int eng;
  private int math;

  // 계산 결과를 조작하지 못하도록 접근을 제한하자!
  private int sum;
  private float aver;

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;

  }


  public int getKor() {
    return this.kor;
  }

  public void setKor(int kor) {
    if (kor >= 0 && kor <= 100) {
      this.kor = kor;
      this.compute();
    }
  }

  public int getEng() {
    return this.eng;
  }

  public void setEng(int eng) {
    if (eng >= 0 && eng <= 100) {
      this.eng = eng;
      this.compute();
    }
  }
  public int getMath() {
    return this.math;
  }

  public void setMath(int math) {
    if (math >= 0 && math <= 100) {
      this.math = math;
      this.compute();
    }
  }

  // 대신 결과 값을 꺼낼 수 있는 메서드(getter)를 제공해야 한다.
  public int getSum () {
    return this.sum;
  }

  public float getAver() {
    return this.aver;
  }

  // 점수를 변경할 때 마다 호출되기 때문에 임의로 호출될 필요가 없다.
  // 따라서 비공개로 만든다.
  // 초보 개발자의 많은 착각!
  // => 필드는 무조건 private, 메서드는 무조건 public 으로 해야 한다고 생각한다.
  // => 아니다! 착각이다 필드든 메서드든 공개할 것은 공개하고 공개하지 말아야 하는 것은 공개하지 말라.
  // => 기본이 비공개이고, 공개할 것만 공개하라!
  //    이렇게 하는 것이 클래스가 잘못 사용되는 상황을 방지할 수 있다.
  private void compute() {
    this.sum = this.kor + this.eng + this.math;
    this.aver = this.sum / 3f;
  }       
}                       
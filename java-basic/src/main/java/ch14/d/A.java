package ch14.d;

public class A {

  public void m1() {}


  // 리턴 타입이 일치해야 오버로딩으로 간다한다.
  // public int m1() {} // 컴파일 오류!
  // public int m1(int a) {} // 컴파일 오류!

  public void m1(int a) {} // OK!

  // public void m1(int b) {} // 컴파일 오류!

  // => 파라미터 타입이 달라야 한다.
  public void m1(float a) {} // OK!
  public void m1(byte a) {} // OK!
  public void m1(short a) {} // OK!
  public void m1(long a) {} // OK!

  // => 파라미터 개수가 달라야 한다.
  public void m1(float a, float b) {} // OK!
  public void m1(short a, String b) {} // OK!

  // => 접근 범위는 상관없다.
  void m1(float a, int b) {} // OK!
  private void m1(float a, int b, int c) {}
  protected void m1(float a, int b, int c, String d) {}


}

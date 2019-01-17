package ch13.f;

public class X {
  private int v1 = 100;

  public X(int value) {    
    //super(); //생략해도 자동으로 추가된다.
    
    this.v1 = value;
    System.out.println("X.X()");
  }

  public void m1() {
    System.out.printf("X.v1 = %d\n", this.v1);
  }
}

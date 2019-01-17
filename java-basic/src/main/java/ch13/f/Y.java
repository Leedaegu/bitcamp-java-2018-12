package ch13.f;


public class Y extends X {
  private int v2 = 200;

  public Y() {  
    super(500);
    System.out.println("Y.Y()");
  }

  public void m2() {
    System.out.printf("Y.v2 = %d", this.v2);

  }
}

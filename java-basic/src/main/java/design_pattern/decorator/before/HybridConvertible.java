package design_pattern.decorator.before;

public class HybridConvertible extends Hybrid {

  // Hybrid 를 상속 받았기 때문에 
  // Hybrid 기능은 그대로 사용한다.
  boolean openRoof;

  public void open(boolean open) {
    this.openRoof = open;
  }

  public void run2() {
    if(openRoof) {
      System.out.println("뚜껑 연다.");
    } else {
      System.out.println("뚜껑 닫는다");
    }
    this.run();
  }
}

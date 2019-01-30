package design_pattern.decorator.after;

public class SunRoof extends Decorator {

  boolean openSunRoof;

  public SunRoof(Car car) {
    super(car);
  }

  @Override
  public void run() {

    if(openSunRoof) {
      System.out.println("썬루프를 연채로 ");    
    } else {
      System.out.println("썬루프를 닫은채로 ");
    }
    this.car.run();
  }

  public void openSunRoof() {
    this.openSunRoof = true;
  }

  public void closeSunRoof() {
    this.openSunRoof = false;  
  }
  
}


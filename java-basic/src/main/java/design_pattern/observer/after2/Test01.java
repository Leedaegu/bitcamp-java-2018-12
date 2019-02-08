package design_pattern.observer.after2;

public class Test01 {

  public static void main(String[] args) {
    
    Car car = new Car();
    
    // Observer 디자인 패턴과 추상 클래스의 결합 
    
    car.addObserver(new SafeBeltCarObserver());
    car.addObserver(new EngineOilCarObserver());
    car.addObserver(new BreakOilCarObserver());
    car.addObserver(new LightOffCarObserver());
    car.addObserver(new SunRoofCloseCarObserver());
    
    car.start();
    car.run();
    car.stop();
    
    System.out.println("---------------------------------");

  }

}








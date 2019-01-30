package design_pattern.decorator.before;

public class Test01 {

  public static void main(String[] args) {
    
    // 전기차 트럭을 만들어 보자!
    // Hybrid를 상속 받고 트럭 기능을 덧붙인다.
    // => 트럭에는 Sedan 기능이 필요 없지만,
    //    상속은 중간에 특정 기능을 뺄 수 없다.
    //    무조건 상속 받을 수 밖에 없다.
    HybridTruck c1 = new HybridTruck();
    c1.dump();
    
    // 만약 Hybrid  이면서 Convertible 기능을 갖는 자동차를 만들고 싶다면?
    // => Hybrid나 Convertible 둘 중 한개를 상속 받아서 구현해야 한다.
    // => 하위 클래스는 다른 클래스의 기능을 중복해서 개발해야 한다.
    
    HybridConvertible c2 = new HybridConvertible();
    c2.open(true);
    c2.run2();
  }
}

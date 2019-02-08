package design_pattern.observer.before;

public class Car {
  public void start() {
    System.out.println("시동을 건다.");

    // 예) 1월 20일 - 자동차 시동을 걸 때 안전벨트 점검하는 기능을 추가
    System.out.println("안전벨트 착용 여부 검사");

    // 예) 2월 30일 - 자동차 시동을 걸 때 엔진오일 유무를 검사하는 기능을 추가
    System.out.println("엔진 오일 유무 검사");

    // 예) 3월 2일 - 자동차 시동을 걸 때 브레이크오일 유무를 검사하는 기능을 추가
    System.out.println("브레이크 오일 유무 검사");

  }

  public void run () {
    System.out.println("달린다!");
  }

  public void stop() {
    System.out.println("시동을 끈다.");

    // 예) 4월 15일 - 자동차 시동을 끌 때 전조등을 자동으로 끄는 기능을 추가
    System.out.println("전조등을 끈다.");

    // 예) 5월 5일 - 자동차 시동을 끌 때 썬루프를 자동으로 닫는 기능을 추가
    System.out.println("썬루프를 닫는다.");
  }

}

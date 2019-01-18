// 제네릭(generic) 적용후 - 클래스 전체에 응용하기
package ch16;

import java.io.File;
import java.util.Calendar;
import java.util.Date;

// 제네릭을 적용하지 않은 상자.
class Box1{
  Object value;

  public Box1 (Object value) {
    this.value = value;
  }

  public Object getValue() {
    return this.value;
  }
}

//public class Test04 {
//  public static void main(String[] args) {
//
//    // 제네릭이 정용되지 않은 Box1 클래스 이용하기
//    Box1 b1 = new Box1(100);
//    Box1 b2 = new Box1("Hello");
//    Box1 b3 = new Box1(new Date());
//
//    // Box1 객체에서 값 꺼내기
//    // => 값을 꺼낼때마다 형변환해야 한다.
//    int v1 = (int) b1.getValue();
//    String v2 = (String) b2.getValue();
//    Date v3 = (Date)b3.getValue();
//
//  }
//}

class Box2<T> {
  T value;  // T라는 타입의 인스턴스 주소를 저장할 필드

  public Box2 (T value) {  // T라는 타입의 객체를 받을 파라미터
    this.value = value;
  }

  public T getValue() {  // T라는 타입의 객체를 리턴
    return this.value;
  }
}

public class Test04 {
  public static void main(String[] args) {

    // 제네릭이 정용되지 않은 Box1 클래스 이용하기
    Box1 b1 = new Box1(100);
    Box1 b2 = new Box1("Hello");
    Box1 b3 = new Box1(new Date());

    // Box1 객체에서 값 꺼내기
    // => 값을 꺼낼때마다 형변환해야 한다.
    int v1 = (int) b1.getValue();
    String v2 = (String) b2.getValue();
    Date v3 = (Date)b3.getValue();

    Box2<String> x1 = new Box2<String>("홍길동");
    Box2<String> x2 = new Box2<>("임꺽정");

    Box2<String> x3;
    x3 = new Box2<>("유관순");

    // Box2<String> x4 = new Box2<>(new Date()); // 컴파일 오류!
    String y1 = x1.getValue();
    String y2 = x2.getValue();
    String y3 = x3.getValue();

    Box2<Date> x4 = new Box2<>(new Date());
    Date v4 = x4.getValue();



  }
}

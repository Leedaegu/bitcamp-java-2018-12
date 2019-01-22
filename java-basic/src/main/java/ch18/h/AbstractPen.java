// 추상 클래스 활용 - 서브 클래스를 위해 미리 인터페이스의 일부 메서드를 구현하는 역할
package ch18.h;

// 서브 크래스를 위해 인터페이스의 일부 메서드를 구현하는 용도로 추상 클래스를 많이 사용한다.
// 추상 클래스의 특성 상 필드와 구현 메서드를 가질 수 있어서 이런 용도로 많이 사용한다.
// => 인터페이스를 완전하게 구현하지 않았고,
//    직접 사용할 일도 업기 때문에 더더욱 추상 클래스로 선언해야 한다.
// => 그리고 이런 클래스의 이름이 보통 abstract로 시작한다.
public abstract class AbstractPen implements Pen{

  boolean ues;
  
  // 서브 클래스에서 동일하게 구현할 메서드라면 여기 수퍼 클래스에서 미리 구현하여 상속해준다.
  @Override
  public void on() {
this.ues = true;    
  }

  @Override
  public void off() {
this.ues = false;    
  }

  // weite()는 어차피 서브 클래스에서 자신의 특성에 맞게 구현할 메서드이기때문에 구현하지않는다.

}

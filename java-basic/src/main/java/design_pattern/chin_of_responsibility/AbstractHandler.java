package design_pattern.chin_of_responsibility;

public abstract class AbstractHandler implements Handler {

  // 다음 핸들러의 주소
  Handler next;

  public AbstractHandler() {

  }

  public AbstractHandler(Handler next) {
    this.next = next;
  }

  public Handler getNext() {
    return next;
  }

  public void setNext(Handler next) {
    this.next = next;
  }

}

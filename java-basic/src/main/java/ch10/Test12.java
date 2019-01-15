// 기본 생성자(default constructor) 2
package ch10;

class Monitor10 {

  int bright; 
  int contrast = 50;
  int widthRes;
  int heightRes = 1080;

  Monitor10() {

    this(50, 50, 2560 ,1200);
    System.out.println("Monitor()");
  }

  Monitor10(int bright, int contrast) {
    this(bright, contrast, 0, 0);
    System.out.println("Monitor(int, int)");
  }

  Monitor10(int bright, int contrast, int widthRes, int hightRes) {
    this.bright = bright;
    this.contrast = contrast;
    this.widthRes = widthRes;
    this.heightRes = hightRes;
    System.out.println("Monitor(int, int, int, int)");
  }

  public void on() {
    System.out.println("화면을 출력한다.");

  }
}

public class Test12 {
  public static void main(String[] args) {
    // 기본 생성자가없는경우 다음과 같이 기본 생성자를 지정할 수 없다.
    // 컴파일 오류
    //new Monitor8();

    new Monitor10();
    System.out.println("---------------------------");
    new Monitor10(50, 50);
    System.out.println("---------------------------");
    new Monitor10(50, 50, 2560, 1200);

    Monitor10 obj1 = new Monitor10();
  }
}

















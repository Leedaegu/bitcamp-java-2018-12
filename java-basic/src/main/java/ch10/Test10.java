// 기본 생성자(default constructor) 2
package ch10;

class Monitor8 {

  int bright; 
  int contrast = 50;
  int widthRes;
  int heightRes = 1080;

  Monitor8(int bright, int contrast) {
    this.bright = bright;
    this.contrast = contrast;
  }
  
 public void on() {
   System.out.println("화면을 출력한다.");
 }
}

public class Test10 {
  public static void main(String[] args) {
    // 기본 생성자가없는경우 다음과 같이 기본 생성자를 지정할 수 없다.
    // 컴파일 오류
    //new Monitor8();
        
     new Monitor8(50 ,50);
     


  }
}

















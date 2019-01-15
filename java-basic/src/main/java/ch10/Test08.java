// 인스턴스 필드의 초기화 - 필드 초기화 절차.
package ch10;

class Monitor6 {

  int bright; 
  int contrast = 50;
  int widthRes;
  int heightRes = 1080;


  Monitor6() {
    this.bright = 50;
    this.contrast = 50;
    this.widthRes = 2560;
    this.heightRes = 1200;
  }
  
  
  
  
 public void on() {
   System.out.println("화면을 출력한다.");
 }
}

public class Test08 {
  public static void main(String[] args) {
    // 모니터 인스턴스 생성
        
    new Monitor6();
    
    //new Monitor6(100);



  }
}

















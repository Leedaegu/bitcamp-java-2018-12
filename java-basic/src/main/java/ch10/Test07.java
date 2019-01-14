// 인스턴스 필드의 초기화 - 필드 초기화 절차.
package ch10;

class Monitor5 {

  int bright; 
  int contrast = 50;
  int widthRes;
  int heightRes = 1080;

  { 
    this.bright = 50;
    this.contrast = 60;
    this.widthRes = 1920;
  }
  Monitor5() {
    this.contrast = 70;
    this.widthRes = 2560;
    this.heightRes = 1200;
  }

  void display() {
    System.out.println("-----------------------------------------------");
    System.out.printf("밝기(%d)\n", this.bright);
    System.out.printf("명암(%d)\n", this.contrast);
    System.out.printf("해상도(%d x %d)\n", this.widthRes, this.heightRes);
    System.out.println("-----------------------------------------------");
  }
}

public class Test07 {
  public static void main(String[] args) {
    // 모니터 인스턴스 생성
    Monitor5 m1 = new Monitor5();
    
    
    m1.display();


  }
}

















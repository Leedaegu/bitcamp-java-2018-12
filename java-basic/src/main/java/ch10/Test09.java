// 기본 생성자(default constructor)
package ch10;

class Monitor7 {

  int bright; 
  int contrast = 50;
  int widthRes;
  int heightRes = 1080;

  // 클래스에 기본생성자가없으면 컴파일러가 자동으로 기본 생성자를 추가한다.
  // public Monitor7() {} //공개된 기본 생성자 추가
    
 public void on() {
   System.out.println("화면을 출력한다.");
 }
}

public class Test09 {
  public static void main(String[] args) {
    // new Monitor7; // 컴파일 오류
    new Monitor7();
        
     
    


  }
}

















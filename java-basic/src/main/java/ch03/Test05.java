// 레퍼런스 
package ch03;

public class Test05 {
  public static void main(String[] args) {
    java.util.Date d1 = new java.util.Date(); //java.util패키지에있는 Data타입
    java.util.Date d2 = d1;
    
    System.out.printf("%d, %d\n", d1.getDate(), d2.getDate());  //deprecated 앞으로 사라질 메서드 되도록 사용하지말것
 
    
    d1.setDate(22);
    System.out.printf("%d, %d\n", d1.getDate(), d2.getDate());
    
    //레퍼런스변수 == 값이 저장된 주소를 저장. ex)카드 ,전화번호
    
  } 
}

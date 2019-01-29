// 애플리케이션 예외의 종류 : RuntimeException 계열의 예외 처리 2
package ch21.c;

import java.util.ArrayList;

public class Test06 {

  public static void main(String[] args) { 
 
    ArrayList<String> list = new ArrayList<>();
    
    list.add("홍길동");
    list.add("임꺽정");
    list.add("유관순");
    
    // get() 메서드
    // => 목록에서 인덱스 지정한 위치의 값을 꺼내준다.
    try {
    System.out.println(list.get(0));
    System.out.println(list.get(1));
    System.out.println(list.get(2));
    System.out.println(list.get(3)); // 예외가 발생하면 즉시 실행을 중지하고 호출자에게 보고한다.
    
    } catch (RuntimeException e) {
      // 여기서 예외를 처리했기 때문에 main() 호출자에게 따로 보고하지 않는다.
      System.out.println("실행중 오류 발생");
    }
    
    System.out.println("종료!");

    
  }

}

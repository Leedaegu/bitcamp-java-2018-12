// 제네릭(generic) - 타입 파라미터 : 파라미터 값으로 타입을 받는 것.
package ch16;

import java.util.Calendar;
import java.util.Date;

public class Test02 {
  public static void main(String[] args) {

    String obj1 = echo(new String("Hello"));
    Date obj2 = echo(new Date());
    Calendar obj3 = echo(Calendar.getInstance());
    
        
    
  }

  public static String echo(String obj) {
    return obj;
  }
  
  public static Date echo(Date obj) {
    return obj;
  }
  
  public static Calendar echo(Calendar obj) {
    return obj;
  }
}

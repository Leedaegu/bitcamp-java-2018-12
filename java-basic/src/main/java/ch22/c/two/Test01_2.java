// 버퍼 사용 - 사용 후
// 
package ch22.c.two;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test01_2 {
  public static void main(String[] args) {
    
    try {
      FileInputStream in = new FileInputStream("a.jpg");
      System.out.println("데이터 읽는 중...");
      
      long start = System.currentTimeMillis();
      int count =0 ;
      byte[] buf = new byte[69901];
      int len = 0;
      while ((len = in.read(buf)) != -1) {
        count++;
      }
      FileOutputStream out = new FileOutputStream("a4.jpg");
      out.write(buf, 0, 40000);
      System.out.println(count);
      long end = System.currentTimeMillis();
      System.out.println(end - start);
      
      in.close();
      
    } catch (Exception e) {
      e.printStackTrace();
    }
    
    System.out.println("출력 완료!");
  }
}








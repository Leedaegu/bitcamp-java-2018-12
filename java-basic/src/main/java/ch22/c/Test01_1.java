// 버퍼 사용 - 사용 전
package ch22.c;

import java.io.FileInputStream;

public class Test01_1 {
  public static void main(String[] args) {
    
    try {
      FileInputStream in = new FileInputStream("abc.txt");
      
      System.out.println("데이터 읽는 중...");
      
      long start = System.currentTimeMillis();
      
      int b;
      /*
      while (true) {
        b = in.read();
        if (b == -1) // 파일의 끝에 도달하면 -1을 리턴한다.
          break;
        System.out.print(Integer.toHexString(b) + " "); // 앞에 0은 안읽어서 2로출력.
      }
       */ 
      while ((b = in.read()) != -1) {
        //
      }
      
      long end = System.currentTimeMillis();
      System.out.println(end - start);
      
      in.close();
      
    } catch (Exception e) {
      e.printStackTrace();
    }
    
    System.out.println("출력 완료!");
  }
}





// 바이너리 데이터 입출력 - fileinputStream 배열의 특정 영역에 저장하기
package ch22.b;

import java.io.FileInputStream;

public class Test03_2 {

  public static void main(String[] args) {

    // 파일의 바이너리 데이터를 읽어 배열에 저장한다.
    try {      
      FileInputStream in = new FileInputStream("data.bin");

      byte[] buf = new byte[1024];

      int count = in.read(buf, 5, 6);

      System.out.println(count);
      for (int i = 0; i < 10; i++) {
        System.out.print(Integer.toHexString(buf[i]) + " "); // 앞에 0은 안읽어서 2로출력.

      }
      System.out.println();

      in.close();

    } catch (Exception e) {
      e.printStackTrace();
    }

    System.out.println("출력완료!");
  }
}

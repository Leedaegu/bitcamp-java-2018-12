// 문자 데이터 읽기
package ch22.d;

import java.io.FileReader;

public class Test02_2 {

  public static void main(String[] args) {

    // FileReader 
    //  문자 단위로 데이터를 읽는 일을 한다.

    try (FileReader in = new FileReader("data.txt")){

      char[] cbuf = new char[1024]; // byte가아니라 1024문자를 저장하는거다
      int len = in.read(cbuf);

      System.out.println(len);
      for (int i = 0; i < len; i++) {
        System.out.print(cbuf[i] + ",");
      }
      System.out.println();

    } catch (Exception e) {
      e.printStackTrace();
    }

    System.out.println("읽기 완료.");

  }
}

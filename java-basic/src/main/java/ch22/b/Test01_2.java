// 바이너리 데이터 입출력 - fileinputStream 클래스 사용법
package ch22.b;

import java.io.FileInputStream;

public class Test01_2 {

  public static void main(String[] args) {

    // 파일의 바이너리 데이터 읽기
    // => FileInputStream 클래스를 사용한다.
    try {
      // 1) 데이터 읽기를 담당할 객체를 생성한다.
      FileInputStream in = new FileInputStream("data.bin");

      // 2) 데이터를 읽는다.
      // => 읽은 데이터를 저장할 변수를 선언한다.
      // => 1바이트 값을 저장할 변수는 int형으로 선언한다. byte형이 아니다!
      // => 이유 0 ~ 255 까지의 값을 읽기 때문이다.
      //   byte는 -128 ~ 127까지의 값만 저장한다.
      // => 여러 바이트를 읽을 때는 바이트 배열을 사용한다.
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
        System.out.print(Integer.toHexString(b) + " "); // 앞에 0은 안읽어서 2로출력.

      }
      System.out.println();

      in.close();
    } catch (Exception e) {
      e.printStackTrace();
    }

    System.out.println("출력완료!");
  }
}

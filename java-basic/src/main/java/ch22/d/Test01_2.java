// 문자 데이터 읽기
package ch22.d;

import java.io.FileReader;

public class Test01_2 {

  public static void main(String[] args) {
    
    // FileReader 
    //  문자 단위로 데이터를 읽는 일을 한다.
    
    try (FileReader in = new FileReader("data.txt")){
      System.out.println(Integer.toHexString(in.read())); // read() 가 리턴하는것은 UTF-16으로 바꾼 문자 코드값 이다.
      System.out.println(Integer.toHexString(in.read()));
      System.out.println(Integer.toHexString(in.read()));
      System.out.println(Integer.toHexString(in.read()));
      System.out.println(Integer.toHexString(in.read()));
      System.out.println(Integer.toHexString(in.read()));
   
      // JVM을 실행할때 다음 옵션을 지정하지 않으면
      // "-Dfile.encoding=문자표" 
       // JVM은 OS의 기본 문자표라고 가정하고 파일을 읽는다.
      
    } catch (Exception e) {
      e.printStackTrace();
    }
    
    System.out.println("읽기 완료.");
    
  }
}

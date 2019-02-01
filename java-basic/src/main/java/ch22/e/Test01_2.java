// 인스턴스 읽기
package ch22.e;

import java.io.FileInputStream;
import ch22.c.BufferedInputStream;
import ch22.c.DataInputStream;

public class Test01_2 {

  public static void main(String[] args) {

    // score.data 파일에서 세 학생의 데이터를 읽어 Score 인스턴스로 생성하라.
    // => java.io.BufferedInputStream 클래스를 사용하라.
    // => java.io.DataInputStream 클래스를 사용하라.
    //
    // 그리고 세 학생의 정보를 다음과 같은 형식으로 출력하라.
    // =>   홍길동, 100, 100, 100, 300, 100 
    // 

    try (FileInputStream in = new FileInputStream("Score.data");
        BufferedInputStream in1 = new BufferedInputStream(in);
        DataInputStream in2 = new DataInputStream(in1)) {
      
      Score s1 = new Score(in2.readUTF(), in2.readInt(),in2.readInt(), in2.readInt());
      Score s2 = null;
      Score s3 = null;
      s1.setName(in2.readUTF());
      s1.setKor(in2.readInt());
      s1.setEng(in2.readInt());
      s1.setMath(in2.readInt());    
 
      
//      Score s1 = new Score(null, 0, 0, 0);
//      Score s2 = null;
//      Score s3 = null;
//      s1.setName(in2.readUTF());
//      s1.setKor(in2.readInt());
//      s1.setEng(in2.readInt());
//      s1.setMath(in2.readInt());    

      System.out.println(s1);

    }catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println("읽기 완료!");

  }
}

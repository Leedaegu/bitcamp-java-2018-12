// 정리
package ch22.c;

public class Test05 {
  public static void main(String[] args) {

    // IO Stream 클래스
    // 1) Data sink stream class
    //     => 파일이나 메모리에서 직접 데이터를 읽고 쓰는 클래스
    //     => 파일: 
    //      FileInputStream/FileOutputStream,
    //      FileReader/FileWriter 
    //     => 메모리:
    //        ByteArrayInputStream/ByteArrayOutputStream
    //        CharArrayReader/CharArratWriter
    //        StringReader/StringWriter
    //     => 프로세스: 다른 프로그램과 연결되어 데이터를 읽고 쓴다.
    //        PipedInputStream/PipedOutputStream
    //        PipedReader/PipedWriter
    
    // 2) Data processing stream class
    //    => 데이터를 읽고 쓸 때 중간에서 데이터를 가공하는 클래스
    //    => 데코레이터 역할을 수행한다.
    //   => FilterInputStream/FilterOutputStream 의 서브 클래스 이다.
    //   => FilterReader/FilterWriter 의 서브 클래스 이다.
    //   => Data sink stream class를 제외한 모든 클래스
    //    => 예:
  
  }
}









// 생성자 활용 - String 클래스의 생성자 활
package ch10;

import java.io.UnsupportedEncodingException;

public class Test14 {

  public static void main(String[] args) throws Exception {
    String s1 = new String();

    System.out.println(s1); //에러가아니다! 빈문자열 출력

    String s2 = new String("Hello");

    char[] chars = {'H', 'e', 'l', 'l', 'o'};
    String s3 = new String(chars);

    byte[] bytes = {(byte)0xb0, (byte)0xa1, (byte)0xb0, (byte)0xa2,
        0x30, 0x31, 0x32 ,0x41, 0x42, 0x43};
    String s4 = new String(bytes);
    // 한글이 깨진다. 이유?
    // => String 생성자는 파라미터로 받은 바이트 배열에 ISO-8859-1 문자 코드가 들어 있다고 간주한다.
    //     즉 0xb0 0xa1 값이 한글 '가'가 아니라 0xb1 0xa1각각을 영어라 간주하고
    //    ISO-8859-1에 정의된 문자표에 따라 화면에 출력한다.
    //    0xb0에 해당하는 문자가 출력되는 것이다.
    // =>  제대로 한글 을 처리하려면?

    String s5 = new String(bytes, "euc-kr");
    
    byte[] bytes2 = {(byte)0xac, (byte)0x00, (byte)0xac, (byte)0x01, 
        0x00, 0x61, 0x00, 0x62, 0x00, 0x63};
    
    String s6 = new String(bytes2, "utf-16");
    
    byte[] bytes3 = {(byte)0xea, (byte)0xb0, (byte)0x80, 
        (byte)0xea, (byte)0xb0, (byte)0x81, 
        0x61, 0x62, 0x63};
    
    String s7 = new String(bytes3, "utf-8");
    
    System.out.println(s2);
    System.out.println(s3);
    System.out.println(s4);
    System.out.println(s5);
    System.out.println(s6);
    System.out.println(s7);


  }
}

















package ch22.c.two;

import java.io.IOException;
import java.io.InputStream;

public class BufferedInputStream extends InputStream { //InputStream의 read는 추상메서드이기때문에 오타방지가능
  
  InputStream in;
  byte[] buf = new byte[1024];
  int size = 0;
  int cursor = 0;
  
  public BufferedInputStream(InputStream in) {
    this.in = in;
  }
  
  @Override
  public int read() throws IOException {
    if (cursor >= size) { // 커서가 사이즈보다 같거나 클떄 (다읽었을때) 다시읽는다.
      size = in.read(buf);
      if (size == -1)
        return -1;
      cursor = 0;
    }
   
    // 바이트의 값을 온전히 4바이트 인트 값으로 변환하기 위해
    // 0x00000000ff 값을 & 비트 연산한다.
    // =? 0xff 상수 값은 0x00000000ff 를 의미한다.
    return buf[cursor++] & 0xff; 
  }
}

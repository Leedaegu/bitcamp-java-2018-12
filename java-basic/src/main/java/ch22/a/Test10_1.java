// java.io.File클래스 : 필터 사용하기
package ch22.a;

import java.io.File;
import java.io.FilenameFilter;

public class Test10_1 {

  // static nested class(스태틱 중첩 클래스)
  static class TextFileFilter implements FilenameFilter{
    
    @Override
    public boolean accept(File dir, String name) {
      if (name.endsWith("txt"))
        return true;
      else
        return false;
    }    
  }
  
  public static void main(String[] args) throws Exception {
    
    // 파일은 디렉토리와 파일을 통칭하는 용어다.
    File file = new File(".");

    // 하위 파일이나 디렉토리의 상세정보 알아내기
    String[] names = file.list(new TextFileFilter());

    for(String name : names) {
      System.out.println(name);
    }

  }
}  
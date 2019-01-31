// java.io.File클래스 : 필터 사용하기 3
package ch22.a;

import java.io.File;
import java.io.FilenameFilter;

public class Test10_3 {

  public static void main(String[] args) throws Exception {

    File file = new File(".");

    // FilenameFilter 라는 인터페이스를 구현한 익명 이너클래스 (anonymous class)
    String[] names = file.list(new FilenameFilter() {
      @Override
      public boolean accept(File dir, String name) {
        if (name.endsWith("txt"))
          return true;
        else
          return false;
      }    
    });

    for(String name : names) {
      System.out.println(name);
    }

  }
}  

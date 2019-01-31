// java.io.File클래스 : 연습 과제 - bin 폴더를 삭제하라!
package ch22.a;

import java.io.File;

public class Test13 {  

  public static void main(String[] args) throws Exception {

    // bin의 하위 폴더와 파일을 모두삭제해야만 bin폴더를 삭제할 수 있다.
    File file = new File("bin");

    delete(file);
  }

  static void delete(File dir) {
    File[] files = dir.listFiles();
    for(File file : files) {
      if (file.isFile()) { 
        file.delete();
      } else {
        delete(file);
      }
    }
    dir.delete();
  }
}


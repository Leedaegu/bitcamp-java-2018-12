// java.io.File클래스 : FileFilter 사용하기
package ch22.a;

import java.io.File;
import java.io.FileFilter;

public class Test11_1 {

  // static nested class
  static class TextFileFilter implements FileFilter{
    @Override
    public boolean accept(File pathname) {
      if (pathname.isFile() && pathname.getName().endsWith(".txt"))
        return true;
      else
        return false;
    }
  }
  
  public static void main(String[] args) throws Exception {

    // 파일은 디렉토리와 파일을 통칭하는 용어다.
    File file = new File(".");

    File[] files = file.listFiles(new TextFileFilter());
    
    for(File f : files) {
      System.out.printf("%s %12d %s\n",
          f.isDirectory() ? "d" : "-", // d면 디렉토리 ,-면 파일
              f.length(),              // 파일 사이즈
              f.getName());            // 파일 이름
    }

  }
}  

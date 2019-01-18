// 제네릭(generic)과 배
package ch16;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test05 {

  public static void main(String[] args) {

    String[] strs = create2(new String[] {});
    System.out.println(strs.length);

    // 내부에서 생성할 배열 크기 보다 더 큰 배열을 파라미터로 넘긴다면?
    String[] temp = new String[100];
    String[] strs2 = create2(temp);
    System.out.println(strs2.length);
    System.out.println(temp == strs2);
    
    String[] strs3 = create3(String.class);
    System.out.println(strs3.length);
  }

  static <T> T[] create1() {
    // 제네릭의 타입 파라미터로 레퍼런스 배열을 생성할 수 없다.
    // T[] arr = new T[10]; // 컴파일 오류!
    return null;
  }

  static <T> T[] create2(T[] arr) {

    return Arrays.copyOf(arr, 10);
  }

  @SuppressWarnings("unchecked")
  static <T> T[] create3(Class<?> type) {
    return (T[]) Array.newInstance(type, 10);
  }
  
  @SuppressWarnings("unchecked")
  static <T> T[] create4(T[] arr) {

    return (T[]) Array.newInstance(arr.getClass(), 10);
  }
  
}

// 메서드 - 가변 파라미터의 단점
package ch06;

public class Test08 {

  public static void main(String[] args) {
    compute("홍길동", 100, 100, 90);
    compute("임꺽정");
    compute("유관순", 100, 100, 100, 100);

    System.out.println("-------------------------");

    compute3(new int[] {100, 100, 90}, "홍길동");
    compute3(new int[] {}, "임꺽정");
    compute3(new int[] {100, 100, 100, 100}, "유관순");

    System.out.println("-------------------------");

    compute4(new int[] {100, 100, 90}, new String[] {"홍길동", "임꺽정", "유관순"});

  }

  //static int plus1(int... value, String name) { //컴파일 에러!
  static void compute(String name, int... value) { 
    int sum = 0;
    for (int i = 0; i < value.length; i++) {
      sum += value[i];
    }
    System.out.printf("%s님의 총점은 %d입니다.\n", name, sum);
  }

  /*
  static int plus2(int ...value, String ... name) { //컴파일 오류!
    int sum = 0;
    for (int i = 0; i < value.length; i++) {
      sum += value[i];
    }
    return sum;
  } */

  static void compute3(int[] value, String name) { 
    int sum = 0;
    for (int i = 0; i < value.length; i++) {
      sum += value[i];
    }
    System.out.printf("%s님의 총점은 %d입니다.\n", name, sum);
  }

  static void compute4(int[] value, String[] name) { 
    for (int i = 0; i < value.length; i++) {
      System.out.printf("%s님의 총점은 %d입니다.\n", name[i], value[i]);
    }

  }

}

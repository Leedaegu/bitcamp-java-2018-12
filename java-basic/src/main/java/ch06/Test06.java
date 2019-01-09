// 메서드 - 가변 파라미터
package ch06;

public class Test06 {

  public static void main(String[] args) {

    int result = plus();
    System.out.println(result);

    result = plus(2);
    System.out.println(result);

    result = plus(2,3);
    System.out.println(result);

    result = plus(2,3,4);
    System.out.println(result);

    int[] arr1 = new int[3];
    arr1[0] = 10;
    arr1[1] = 20;
    arr1[2] = 30;
    result = plus(arr1);
    System.out.println(result);

    int[] arr2 = new int[] {10, 20, 30};
    result = plus(arr2);
    System.out.println(result);
    

    int[] arr3 = {10, 20, 30, 40};
    result = plus(arr3);
    System.out.println(result);
    
    
    result = plus(new int[] {10, 20, 30});
    System.out.println(result);


  }

  static int plus(int... value) {
    int sum = 0; //메서드안에 선언된 변수를 "로컬변수(local variable)"라 한다.
    // 파라미터도 로컬변수이다.
    for (int i = 0; i < value.length; i++) {
      sum += value[i];
    }
    return sum;
  }
}


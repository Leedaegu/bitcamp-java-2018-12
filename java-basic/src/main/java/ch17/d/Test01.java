// 일반 메서드의 한계 - 서브 클래스에게 구현을 강요할 수 없다.
package ch17.d;

public class Test01 {
  
  public static void main(String[] args) {

    int[] values = {23, 7, 12, 15, 9, 2, 22, 8, 11, 25, 13, 5};
    int[] values2 = {23, 7, 12, 15, 9, 2, 22, 8, 11, 25, 13, 5};
    int[] values3 = {23, 7, 12, 15, 9, 2, 22, 8, 11, 25, 13, 5};

    // 두 개의 정렬 객체가 서로 같은 타입이 아니기 때문에
    // 정렬을 수행하고 출력할 메서드를 따로 따로 만들어야 한다.

    display(new BubbleSort(), values);
    display(new QuickSort(), values2);

    // Sorter는 추상 클래스이기 때문에 인스턴스를 생성할 수 없다.
    // => 이렇게 서브 클래스에게 상속해주는 역할만 하는 클래스의 경우
    //    추상 클래스로 선언하여 인스턴스를 만들지 못하게 하라!
    
    // Sorter를 상속 받은 것까지는 잘했다.
    // => 그런데 사용하는 쪽에서는 Sorter의 sort() 메서드를 호출하는데,
    //    MergeSort 클래스는 sort() 메서드를 오버라이딩 하지 않았다.
    // => 개발자가 sort()를 오버라이딩 하는 것을 놓친 것이다.
    // => 이런 실수를 방지하고자 등장한 문법이 "추상 메서드" 이다.
    //    서브 클래스에게 구현을 강제할 필요가 있을 때 추상 메서드로 선언하라!
    //    이것은 e 패키지에서.
    display(new MergeSort(), values3); 
  }

  static void display(Sorter sorter, int[] values) {
    sorter.sort(values);

    for(int value : values) {
      System.out.print(value + ",");
    }
    System.out.println();
  }

}

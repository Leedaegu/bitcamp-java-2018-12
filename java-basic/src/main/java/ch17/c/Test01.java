package ch17.c;

import ch17.c.Sorter;

public class Test01 {
  public static void main(String[] args) {

    int[] values = {23, 7, 12, 15, 9, 2, 22, 8, 11, 25, 13, 5};
    int[] values2 = {23, 7, 12, 15, 9, 2, 22, 8, 11, 25, 13, 5};
    int[] values3 = {23, 7, 12, 15, 9, 2, 22, 8, 11, 25, 13, 5};
    
    // 두 개의 정렬 객체가 서로 같은 타입이 아니기 때문에
    // 정렬을 수행하고 출력할 메서드를 따로 따로 만들어야 한다.
    
    display(new BubbleSort(), values);
    display(new QuickSort(), values2);

    display(new Sorter(), values3);
  }

  static void display(Sorter sorter, int[] values) {
    sorter.sort(values);

    for(int value : values) {
      System.out.print(value + ",");
    }
    System.out.println();
  }

 }

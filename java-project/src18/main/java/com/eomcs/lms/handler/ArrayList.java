package com.eomcs.lms.handler;

import java.util.Arrays;

public class ArrayList<E> {

  static final int LENGTH = 10;
  Object[] list;
  int size = 0;

  public ArrayList() {
    list = new Object[LENGTH];
  }

  public ArrayList(int initialCapacity) {
    if (initialCapacity > LENGTH)
      list = new Object [initialCapacity];
    else
      list = new Object[LENGTH];
  }

  @SuppressWarnings("unchecked")
  public E[] toArray(E[] sampleArr) {
    return (E[]) Arrays.copyOf(list, size, sampleArr.getClass());
    
//    E[] arr = Arrays.copyOf(sampleArr, size);
//    for (int i = 0; i < size; i++) {
//      arr[i] = (E) list[i];
//    }
//    return arr;
  }



  public void add(E obj) {
    if(size == list.length) {
      list = Arrays.copyOf(list, list.length + (list.length >> 1));

      System.out.printf("배열  증가 함: %d\n", list.length);
    }
    list[size++] = obj;

  }
}

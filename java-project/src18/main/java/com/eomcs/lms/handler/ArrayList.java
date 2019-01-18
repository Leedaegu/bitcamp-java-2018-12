package com.eomcs.lms.handler;

import java.util.Arrays;

public class ArrayList<E> {
  static final int LENGTH = 10;
  E[] list;
  int size = 0;

  public ArrayList() {
    list = (E[]) new Object[LENGTH];
  }

  public ArrayList(int a) {
    if (a > LENGTH)
      list = (E[]) new Object[a];
    else
      list = (E[]) new Object[LENGTH];
  }

  public E[] toArray() {
    return Arrays.copyOf(list, size);
  }



  public void add(E obj) {
    if(size == list.length) {
      list = Arrays.copyOf(list, list.length + (list.length >> 1));

      System.out.printf("배열  증가 함: %d\n", list.length);
    }
    list[size++] = obj;

  }
}

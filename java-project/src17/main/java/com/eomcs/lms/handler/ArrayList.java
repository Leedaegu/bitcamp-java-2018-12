package com.eomcs.lms.handler;

import java.util.Arrays;

public class ArrayList {
  static final int LENGTH = 10;
  Object[] list;
  int size = 0;

  public ArrayList() {
    list = new Object[LENGTH];
  }

  public ArrayList(int a) {
    if (a > LENGTH)
      list = new Object[a];
    else
      list = new Object[LENGTH];
  }

  public Object[] toArray() {
    return Arrays.copyOf(list, size);
  }



  public void add(Object obj) {
    if(size == list.length) {
      list = Arrays.copyOf(list, list.length + (list.length >> 1));

      System.out.printf("배열  증가 함: %d\n", list.length);
    }
    list[size++] = obj;

  }
}

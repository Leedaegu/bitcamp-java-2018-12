package com.eomcs.lms.handler;

public class ArrayList {
  static final int LENGTH = 10;   
  Object[] arr;
  int size = 0;

  public ArrayList() {
    this(0);
  }

  public ArrayList(int index) {
    if (index > LENGTH)
      arr = new Object[index];
    else
      arr = new Object[LENGTH];
  }

  public Object[] toArray() {
    Object[] list = new Object[size];
    for (int i = 0; i < size; i++) {
      list[i] = this.arr[i];
    }
    return list;
  }


  public void add(Object value) {
    if(size == arr.length) {
      int oldSize = arr.length;
      int newSize = oldSize + (oldSize >> 1);
      Object[] temp = new Object[newSize];
      for (int i = 0; i < arr.length; i++) {
        temp[i] = this.arr[i];
      }
      arr = temp;

    }
  }
}
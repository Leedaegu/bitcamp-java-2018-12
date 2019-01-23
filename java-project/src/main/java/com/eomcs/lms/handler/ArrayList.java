package com.eomcs.lms.handler;

public class ArrayList<E> {
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

  public E[] toArray(E[] a) {
    Object[] list = new Object[size];
    for (int i = 0; i < size; i++) {
          list[i] = arr[i];
    }
     a = (E[])list ;
    return  a;
  }


  public void add(E value) {
    if(size == arr.length) {
      int oldSize = arr.length;
      int newSize = oldSize + (oldSize >> 1);
      Object[] temp = new Object[newSize];
      for (int i = 0; i < arr.length; i++) {
        temp[i] = this.arr[i];
      }
      arr = temp;
    } 
    arr[size++] = value;
  }
}
package algorithm.data_structure.test;

import java.util.Arrays;

public class ArrayList {

  static final int DEFAULT_SIZE = 5;
  Object[] arr;
  int size = 0;

  public ArrayList() {
    this(0);
  }

  public ArrayList(int capacity) {
    if (capacity > DEFAULT_SIZE) 
      arr = new Object[capacity];
    else 
      arr = new Object[DEFAULT_SIZE];
  } 

  public Object[] toArray() {
    Object[] obj = new Object[this.size];
    for (int i = 0; i < this.size; i++) {
      obj[i] = this.arr[i];
    }
    return obj;
  }

  public void add(Object value) {
    //    if(this.size == arr.length);    
    //    int oldSize = arr.length;
    //    int newSize = oldSize + (oldSize >> 1);
    //    Arrays.copyOf(arr, newSize);
    //    arr[size++] = value;
    if(this.size == arr.length);    
    sizePlus();
    arr[size++] = value;
  }


  public int insert(int index, Object value) {
    if (index < 0 || index >= size)
      return -1;

    if(this.size == arr.length);    
    sizePlus();

    for (int i = size -1; i >= index; i--) {
      arr[i+1] = arr[i];
    }

    arr[index] = value;
    size++;

    return 0;
  }

  public Object get(int index) {
    if (index < 0 || index >= size)
      return null;

    return arr[index];
  }

  public Object set(int index, Object value) {
    if (index < 0 || index >= size)
      return null;

    Object old = this.arr[index];
    this.arr[index] = value;
    return old;
  }

  public Object remove(int index) {
    if (index < 0 || index >= size)
      return null;

    Object old = arr[index];

    for (int i = index; i < size; i++) {
      arr[i] = arr[i + 1];

    }
    size--;
    return old;
  }


  public int size() {
    return this.size;
  }

  private void sizePlus() {
    int oldSize = arr.length;
    int newSize = oldSize + (oldSize >> 1);
    Arrays.copyOf(arr, newSize);
    Object[] temp = new Object[newSize];
    for (int i = 0; i < arr.length; i++) {
      temp[i] = this.arr[i];
    }
    arr = temp;
  }

}








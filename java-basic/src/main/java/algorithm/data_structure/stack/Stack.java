package algorithm.data_structure.stack;

public class Stack {

  public static final int DEFAULT_SIZE = 5;

  Object[] list;
  int size = 0;

  public Stack() {
    list = new Object[DEFAULT_SIZE];
  }

  public void push(Object value) {
    if (size == list.length) {
      int oldSize = list.length;
      int newSize = oldSize + (oldSize >> 1);
      Object[] temp = new Object[newSize];
      for(int i = 0; i < list.length; i++) {
        temp[i] = list[i];
      }
      list = temp;
    }    
    list[size++] = value;
    // 맨 마지막에 추가한다.
    // 배열의 크기가 작다면 확장해야 한다.
  }


  public Object pop() {
    if (size == 0)
      return null;
    return list[--size];
//    Object[] obj = (Object[]) list[size - 1];
//    list[size - 1] = null;    
//    size--;
//    return obj;
    // 맨 마지막 값을 꺼내 리턴한다.
    // 꺼낸 값을 배열에서 제거되어야 한다.

  }

  public boolean empty() {
    return size == 0;
  }

  public int size() {
    return this.size;
  }
}

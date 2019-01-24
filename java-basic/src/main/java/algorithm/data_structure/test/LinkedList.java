package algorithm.data_structure.test;

public class LinkedList {
  protected Node head;
  protected Node tail;
  protected int size;

  public LinkedList() {
    head = new Node();
    tail = head;
    size = 0;
  }


  public int size() {
    return size;
  }

  public void add(Object value) {   
    tail.value = value;

    Node node = new Node();

    Node cursor = head;


    cursor.value = value;
  }

  public Object get(int index) {
    return null;
  }

  public Object set(int index, Object value) {
    return null;
  }

  public Object[] toArray() {
    return null;
  }


  public int insert(int index, Object value) {
    return -1;
  }    

  public Object remove(int index) {
    return null;
  }

}
















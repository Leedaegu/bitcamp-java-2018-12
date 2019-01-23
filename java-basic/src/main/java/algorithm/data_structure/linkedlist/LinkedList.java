package algorithm.data_structure.linkedlist;

public class LinkedList {
  protected Node head;
  protected Node tail;
  protected int size;

  public LinkedList() {
    head = new Node();
    tail = head;
    size = 0;
  }

  public void add(Object value) {
    tail.value = value;

    Node node = new Node();

    tail.next = node;

    node.prev = tail;

    tail = node;

    size++;
  }

  public int size() {
    return size;
  }

  public Object get(int index) {
    if (index < 0 || index >= size)
      return null;

    Node cursor = head;

    for(int i = 1; i <= index; i++) {
      cursor = cursor.next;
    }
    return cursor.value;
  }

  public Object[] toArray() {
    Object[] arr = new Object[size()];

    Node cursor = head;

    int i = 0;
    while (cursor != tail) {
      arr[i++] = cursor.value;
      cursor = cursor.next;
    }
    return arr;
  }

  public Object set(int index, Object value) {
    if (index < 0 || index >= size)
      return null;

    Node cursor = head;

    // 교체할 값이 들어있는 노드로 이동한다.
    for (int i =1; i <= index; i++) {
      cursor = cursor.next;
    }

    // 변경 전에 이전 값을 보관한다.
    Object old = cursor.value;

    cursor.value = value;

    // 이전 값을 리턴한다. 쓰든 안쓰든 호출하는 사람이 알아서 할일이다.
    // 다만 변경전 값을 활용할 경우를 대비해 리턴하는 것이다.
    return old;

  }

  public int insert(int index, Object value) {
    if (index < 0 || index >= size)
      return -1;
    Node node = new Node(value);

    Node cursor = head;

    for (int i = 1; i <= index; i++) {
      cursor = cursor.next;
    }
    node.next = cursor;    

    node.prev = cursor.prev;

    cursor.prev = node;

    if(node.prev != null) {

      // 노드의 prev방에있는 노드의 next방 = node
      node.prev.next = node;
    } else {
      head = node;
    }

    size++;

    return 0;

  }
  public Object remove(int index) {
    if (index < 0 || index >= size)
      return null;

    Node cursor = head;
    for (int i = 1; i <= index; i++) {
      cursor = cursor.next;
    }

    if (cursor.prev != null) {
      cursor.prev.next = cursor.next;
    } else {
      head = cursor.next;
    }

    cursor.next.prev = cursor.prev;

    Object old = cursor.value;
    cursor.value = null;
    cursor.prev = null;
    cursor.next = null;

    size--;

    return old;
  }
}



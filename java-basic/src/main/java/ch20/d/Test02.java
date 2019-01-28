// Map클래스 사용법 - put(), get()
package ch20.d;

import java.util.HashMap;
import java.util.Hashtable;


public class Test02 {

  public static void main(String[] args) {
    class Student {
      String name;
      int age;

      public Student(String name, int age) {
        this.name = name;
        this.age = age;       
      }

      @Override
      public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
      }        
    }

    // java.util.map 구현체
    // => HashMap, HashTable 이 있다.
    // => key를 가지고 value를 저장하고 꺼낸다.
    HashMap<String, Student> map = new HashMap<>();
    Hashtable<String, Student> table = new Hashtable<>();

    // HashMap과 Hashtable은 기본 사용법이 같다.
    map.put("aaa", new Student("홍길동", 20));
    table.put("aaa", new Student("홍길동", 20));

    System.out.println(map.get("aaa"));
    System.out.println(table.get("aaa"));

    map.put(null, new Student("임꺽정", 30));
    System.out.println(map.get(null));
    System.out.println("---------------------------");

    // 해시 테이블은 key로 null을 사용할수 없다 실행오류(Runtime오류!) NullPointerException
    //    table.put(null, new Student("임꺽정", 30));
    //    System.out.println(table.get(null));

    map.put("ccc", null);
    System.out.println(map.get("ccc"));

    // 해시 테이블은 value로 null을 사용할수 없다 실행오류(Runtime오류!) NullPointerException
    //    table.put("ccc", null);
    //    System.out.println(table.get("ccc"));
  }
}

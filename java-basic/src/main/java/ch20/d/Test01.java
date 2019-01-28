
//Map클래스 사용법 - put(), get()
package ch20.d;

import java.util.HashMap;

public class Test01 {

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

    // 맵에 값 저장하기
    // key 객체에 대해 hashCode()를 호출하여 정수 값을 얻는다.
    // 이 해시값을 가지고 저장할 위치를 결정한다.
    //
    map.put("aaa", new Student("홍길동", 20));
    // 1)"aaa" String객체에 대해 hashCode()를 호출하여 해시값을 얻는다.
    // 2) 그 해시 값을 사용하여 저장할 위치를 얻는다.
    // 3) 해당 위치에 Student 객체(의 주소)를 저장한다.
    map.put("bbb", new Student("임꺽정", 30));
    map.put("ccc", new Student("유관순", 17));
    map.put("ccc", new Student("안중근", 25));


    // 맵에서 값 꺼내기
    // => 저장할때 사용한 키를 가지고 꺼낸다.
    System.out.println(map.get("bbb"));

    String key1= "bbb";
    String key2 = new String("bbb");
    System.out.println(key1 == key2);
    System.out.println(key1.hashCode() == key2.hashCode());
    System.out.println(key1.equals(key2));

    System.out.println(map.get(key2));
    System.out.println(map.get("ccc"));
  }
}
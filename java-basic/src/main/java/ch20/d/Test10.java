// 커스텀 key 사용
package ch20.d;

import java.util.HashMap;


public class Test10 {

  public static void main(String[] args) {
    class key {
      int major;
      int minor;

      public key(int major, int minor) {
        this.major = major;
        this.minor = minor;       
      }

      @Override
      public String toString() {
        return "key [major=" + major + ", minor=" + minor + "]";
      }      
    }
    
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
    
    key k1 = new key(100, 1);
    key k2 = new key(100, 2);
    key k3 = new key(100, 3);
    
    HashMap<key, Student> table = new HashMap<>();
    table.put(k1, new Student("홍길동", 20));
    table.put(k2, new Student("임꺽정", 30));
    table.put(k3, new Student("윤봉길", 20));

    System.out.println(table.get(k1));
    System.out.println(table.get(k2));
    System.out.println(table.get(k3));
    
    key k4 = new key(100, 2);    
    System.out.println(table.get(k4));

    System.out.println(k2 == k4);
    System.out.println(k2.hashCode() == k4.hashCode());
    System.out.println(k2.equals(k4));
    
    // 저장할 때,
    // => key 객체의 hashCode() 리턴 값으로 위치를 계산하여 저장한다.
    //
    // 값을 꺼낼 때,
    // => key 객체의 hashCode() 리턴 값으로 위치를 계산한다.
    // => key 객체의 equals() 리턴 값으로 같은 key 인지 계산한다.
    //
    // 결론,
    // => k2와 k4는 비록 인스턴스가 다르더라도 필드의 값은 같다.
    // => 그러나 hashCode()가 다르기 때문에 위치 계산 결과가 달라진다.
    // => 또한 equals()의 리턴 값이 false 이기 때문에 다른 키로 인식한다.
    // => 그래서 k2로 저장한 값을 k4로 꺼낼수 없다.
    // 해결책?
    // => 인스턴스가 다르더라도 인스턴스 필드의 값이 같을때는 
    // hashCode()
  }
}

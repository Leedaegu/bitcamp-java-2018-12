// 커스텀 key 사용
package ch20.d;

import java.util.Enumeration;
import java.util.HashMap;


public class Test11 {

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

      @Override
      public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
      }

      @Override
      public boolean equals(Object obj) {
        if (this == obj)
          return true;
        if (obj == null)
          return false;
        if (getClass() != obj.getClass())
          return false;
        Student other = (Student) obj;
        if (age != other.age)
          return false;
        if (name == null) {
          if (other.name != null)
            return false;
        } else if (!name.equals(other.name))
          return false;
        return true;
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
    
    
  }
}

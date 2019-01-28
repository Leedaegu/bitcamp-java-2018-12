// HashMap에서 value 목록 꺼내기
package ch20.d;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;


public class Test09 {

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

    Hashtable<String, Student> table = new Hashtable<>();

    table.put("aaa", new Student("홍길동", 20));
    table.put("bbb", new Student("임꺽정", 30));

    Student s = new Student("안중근", 25);
    table.put("bbb", s);
    table.put("ccc", s);

    Enumeration<Student> values = table.elements();
    while (values.hasMoreElements()) {
      System.out.println(values.nextElement());
    }

  }
}
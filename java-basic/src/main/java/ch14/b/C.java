// super 키위드
package ch14.b;

public class C extends A {



  @Override public void m1(int a) {

    super.m1(a);
  } 

  public void m4() {

    //this.m1 == 이클래스의 m1
    this.m1(100);


    this.m2("okok", 200);
    super.m2("okok", 200);
  }

  public static void main(String[] args) {

    C obj = new C();
    obj.m4();      
  }
}

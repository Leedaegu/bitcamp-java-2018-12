
//예외 던지기 - Exception 예외 던지기
package ch21.d;

public class Test04 {

public static void main(String[] args) throws Exception {
 // main()에서 조차 예외를 처리하지 않는다면 JVM에게 보고해야 한다.
 // 물론 JVM은 예외를 보고받자 마자 즉시 예외 정보를 상세하게 출력한 다음에 종료할 것이다.
 m3();
 System.out.println("종료!");
}

static void m3() throws Exception {
 m2();
}

static void m2() throws Exception {
 m1();
}

static void m1() throws Exception {
 //Exception 예외를 발생시키는 메서드는
 // 반드시 메서드 선언부에 어떤 예외를 던지는지 선언(보고)해야 한다.
 throw new Exception("m1()에서 발생한 예외");
}

}













// 연산의 결과는 피연산자의 데이터 다입과 같다.
package ch04;

public class Test03 {
  public static void main(String[] args) {
   // int 와 int의 연산결과는 int이다.
    float r = 5 / 2;  //r변수에 값을 저장하기 전에 이미 결과는 2 이다.
   System.out.println(r); //2출력
   
   // 해결책
   // => 두 개의 정수 값을 제대로 float으로 계산하고 싶다면 형변환 하라.
   // => 형변환? 다른 타입의 메모리를 임시로 만들어 값을 넣는 방법
   //    주의! 형변환 이라고 해서 원래 변수나 값의 타입을 다른 타입으로 변경하는 것이 아니다.
   // => 형변환 문법
   //      (새로만들 메모리의 타입) 값
  
   float r2 = (float)5 / (float)2;
   // float 타입의 임시메모리가 생성된후 정수5가 저장된다.
   // float 타입의 임시메모리가 생성된후 정수2가 저장된다.
   // 임시 생성된 두개의 float 메모리 값을 계산한다.
   // 당연히 그 결과는 float 타입이다.
   System.out.println(r2); //2.5출력
   
   //타입이 다른 경우 연산을 수행할 수 없다.
   // => 반드시 계산을 수행하는 피연산자의 타입이 같아야 한다.
   //    다르다면 내부적으로 두 피연산자의 값을 같은 타입으로 만든 후에 계산을 수행한다.
   //    즉 개발자가 지시하지 않아도 내부적으로 같은 타입으로 만드는것을
   //    '암시적 형변환(
   float r3 = 5 / (float)2;
   System.out.println(r3);
   
    byte b1 = 20;
    byte b2 = 30;
    //byte b3 = b1 + b2; // 암시적 형변환에 의해 b1,b2의 값은 int의 임시메모리에 저장.
                            // 그런후 계산된다. int 와 int 의 계산결괴는 당연히 int이다.
                            // 그래서 컴파일 오류인 것이다.
    int x1 = b1 + b2;
    
    short s1 = 20;
    short s2 = 30;
    //short s3 = s1 + s2; //위오 같다. 계산하기 전에 int임시 메모리에 값이 저장된다.
    int x2 = s1 + s2;
    
    char c1 = 20;
    char c2 = 30;
   // char c3 = c1 + c2;   //컴파일 오류!
    int x3 = c1 + c2;
    
    int i1 = 100;
    float f1 = 200.5f;
    //int i2 = i1 + f1;  //컴파일 오류!
    float f2 = i1 + f1;
    
    // 주의!
    float f3 = 9876.543f;
    float f4 = 12.34567f;
    double d1 = f3 + f4; 
    System.out.println(d1);
    
    double d2 = (double)f3 + (double)f4;
    //그런데 출력 결과를 보면 예상 결과와 다르게 나온다.
    // 이유? folat 을 double로 형변환할떄 오차가 이미 생긴다.
    // 부동소수점을 다룰때 생기는 오차이다. 개발자가 제어할 수 없다.
    System.out.println(d2);
    
    //해결책?
    // => 부동소수점의 경우 계산 결과가 float의 자릿수를 넘어갈 것 같으면
    //    아예 처음부터 double에 저장해 놓고 계산하라.
    double d7 = 9876.543;
    double d8 = 12.34567;
    double d9 =  d7 + d8;
    System.out.println(d9);
    
    
    
    
    
    
  } 
}

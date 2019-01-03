 //문자 리터럴
package ch02;

public class Test07 {

  public static void main(String[] args) {     
   //'가' 문자를 출력하라
    System.out.println(0xac00); //UTF-16 코드 값을 지정한다.
    //해당숫자가 UTF-16의 문자 코드임을 알려주지 않으면 PRINTLN()은 
    //그냥 일반 숫자인 줄 알고 10진수로 출력한다
    
    //해결책?
    // =>숫자 앞에 (char)를 붙여 이숫자가 평범한 숫자가 아니라
    //       문자의 UTF-16 코드 값임을 알려줘라.
    //=>UTF-16은 2바이트 크기를 갖는다.
    //=>코드의 값은 0 ~ 65535 이다.
    //=>음수가 없다.
    System.out.println((char)0xac00);
    
    //문자의 코드를 알지 못한다면 작은 따옴표(' ')를 이용할 수 있다.
    //'가'?
    //한글 '가'의 UTF-16값을 리턴한다.
    //또한 이 값이 문자의 코드 값임을 알려준다.
    System.out.println('가');
    
    System.out.println('가' + 2);
    System.out.println((char)('가' + 2));

     // 작은 따옴표 안에 직접 유니코드(UTF-16)를 표기할 수 있다.
    System.out.println('\uac00');
    
    //작은 따옴표 안에 직접 유니코드를 지정하는 경우?
    //=>특수 문자를 출력하고 싶을 때
    //=>코드에 해당하는 문자를 콘솔 창에 출력할 때는
    //  콘솔 창에서 사용하는 폰트에서 해당 문자를 찾는다.
    //=>즉 사용하는 폰트가 무엇이냐에 따라 출력하는 문자의 모양이 다를 수 있다.
    System.out.println('\u32d4');
    
  } 
}


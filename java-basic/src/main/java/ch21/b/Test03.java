// 예외 처리하기 - 여러 개의 예외를 한 catch 블록에서 처리할 수 있다.
package ch21.b;

import java.util.HashMap;
import java.util.Scanner;

public class Test03 {

  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    HashMap<String,Command> commandMap = new HashMap<>();
    commandMap.put("plus", new PlusCommand(keyboard));
    commandMap.put("divide", new DivideCommand(keyboard));

    while(true) {
      System.out.print("명령> ");
      String input = keyboard.nextLine();

      if (input.equals("quit"))
        break;

      // 예외 처리 문법을 적용하면, 예외가 발생하더라도 JVM을 멈추지 않는다.
      try {
        Command command = commandMap.get(input);
        command.excute();

        //  여러 개의 예외를 한 catch 블록에서 받고 싶다면.
        //  공통 수퍼 클래스의 파라미터를 선언하라.
        // NullPointerException, NumberFormatException, ArithmeticException
        //  이들 클래스의 공통 부모는 RuntimeException 이다.
        //
        // 테스트 하는 방법
        // 1) 없는 명령어 입력
        // => 예) minus
        // => NullPointerException
        // 2) 숫자 대신 문자열 입력
        // => 예) 값1? ok
        // => NumberFormatException
        // 3) 0으로 나누기
        // => 예) 값2? 0
        // => ArithmeticException
        //
      } catch (RuntimeException e) { // 공통 부모이기 때문에 가능. OK!
     // } catch (Exception e) { // 공통 조상 클래스이다. OK!
     // } catch (Throwable e) { // 공통 조상 클래스이다. OK!
     // } catch (Object e) { // catch의 파라미터는 오직 Throwable 계열만 허락한다.
        
        System.out.println("명령어 처리 중 오류 발생!\n");
        System.out.println(e.toString());        
      }
    }
    
    System.out.println("실행 완료!");

    keyboard.close();

  }
}





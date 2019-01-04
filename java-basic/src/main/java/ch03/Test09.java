// 키보드로 입력한 값을 받기. 4 - int와 문자열을 섞어읽기
package ch03;

public class Test09 {
  public static void main(String[] args) {
    java.util.Scanner keyboard = new java.util.Scanner(System.in);
   
    System.out.print("나이? ");
    int age = keyboard.nextInt();
    // nextInt()는 한개의 토큰을 읽은 후에 줄 바꿈 코드는 읽기 전의 상태로 놔둔다. 
    // 따라서 다음에 nextLine()을 호출하면 의도치 않게 빈 문자열을 가진 한 줄을
    // 읽는 상황이 된다.
    //nextInt () 다음에 nextLine()을 호출할 떄 이런상황이 발생한다.
    // 해결방법? nextInt() 를 호출한 후 남아았는 엔터 코드를 읽어서 제거하라.
    keyboard.nextLine(); //남아 있는 빈 문자열의 한 줄(LF코드)을 읽어서 변수에 저장하지않으므로 버린다.
    
    System.out.print("이름? ");
    String name = keyboard.nextLine();
                                 
    System.out.printf("%d(%s)\n", age, name);
    
    
  } 
}

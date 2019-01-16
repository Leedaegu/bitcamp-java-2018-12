// 기능 확장하기 - Score 클래스를 상속 받아 기능 추가하기
package ch13.b;

public class Test03 {

  public static void main(String[] args) {

    //Score2를 이용하여 수퍼 클래스의 기능을 호출할수 있다.
    Score3 s = new Score3();
    s.setName("홍길동");
    s.setKor(100);
    s.setEng(100);
    s.setMath(100);
    s.setMusic(100);
    s.setArt(100);

    System.out.printf("%s: %d(%.1f)\n", s.getName(), s.getSum(), s.getAver());


  }

}

package bitcamp.lms;

public class App {
  
    public static void main(String[] args) {
        System.out.println("번호: " + 1);
        System.out.print("수업명:");//ln이 줄바꿈인데 print는 줄바꿈없이실행
        System.out.println(" 자바 프로젝트 실습");//println은 출력후 줄바꿈실행
        System.out.print("수업명:");
        System.out.print(" 자바 프로젝트 실습\n");//문자열속에
        System.out.println( "수업명: 자바 프로젝트 실습");
        System.out.println("설명: " + "자바 프로젝트를 통한 자바 언어 활용법 익히기");
        System.out.println("시작일: " + " 2019-01-02");
        System.out.println("종료일: 2019-05-28");
        System.out.println("총수업시간: 1000시간");
        System.out.println(); //아규먼트 (5)처럼 당연히존재하는값 이없으면 줄바꿈실행
        System.out.println("일수업시간: 8시간");
       
    }
}

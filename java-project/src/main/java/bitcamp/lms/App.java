package bitcamp.lms;

public class App {
  
    public static void main(String[] args) {
      java.util.Scanner keyboard = new java.util.Scanner(System.in);
        
        System.out.print("번호? ");
        int number = keyboard.nextInt(); 
        
        keyboard.nextLine();
        
        System.out.print("수업명? ");
        String classname = keyboard.nextLine();
        
        System.out.print("수업내용? ");
        String classcontents = keyboard.nextLine();
        
        System.out.print("시작일? ");
        String startd = keyboard.nextLine();
        
        System.out.print("종료일? " );
        String finishd = keyboard.nextLine();
        
        System.out.print("총수업시간? ");
        int totalt = keyboard.nextInt();
        
        System.out.print("일수업시간? ");
        int totalh = keyboard.nextInt();
         /*  
        System.out.println();
        System.out.printf("번호: %d\n", number); 
        System.out.printf("수업명: %s\n", classname);
        System.out.printf("수업내용: %s\n", classcontents);
        System.out.printf("기간: %s ~ %s\n", startd, finishd);
        System.out.printf("총수업시간: %d 시간\n", totalt);
        System.out.printf("일수업시간: %d 시간", totalh);
         */
        System.out.println(" ");
        System.out.printf("번호: %d\n수업명: %s\n수업내용: %s\n기간: %s ~ %s\n총수업시간: %d시간\n일수업시간: %d시간", 
            number ,classname ,classcontents ,startd ,finishd ,totalt ,totalh );
    }
}

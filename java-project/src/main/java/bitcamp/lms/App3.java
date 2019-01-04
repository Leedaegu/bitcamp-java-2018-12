package bitcamp.lms;

public class App3 {
  
    public static void main(String[] args) {
      java.util.Scanner keyboard = new java.util.Scanner(System.in);
      
        System.out.print("번호? ");
        int number = keyboard.nextInt();
        keyboard.nextLine();
        
        System.out.print("내용? ");
        String contents = keyboard.nextLine();
        
        System.out.println();
        System.out.printf("번호: %d\n", number);
        System.out.printf("내용: %s\n", contents);
        System.out.println("작성일: 2019-01-01");
        System.out.println("조회수: 0");
 
    }
}

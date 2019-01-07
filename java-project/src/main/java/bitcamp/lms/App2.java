package bitcamp.lms;

public class App2 {
  
    public static void main(String[] args) {
      java.util.Scanner keyboard = new java.util.Scanner(System.in);
      java.util.Date today = new java.util.Date();
      
        System.out.print("번호? ");
        int number = keyboard.nextInt();
        keyboard.nextLine();
        
        System.out.print("이름? ");
        String name = keyboard.nextLine();
        
        System.out.print("이메일? ");
        String email = keyboard.nextLine();
        
        System.out.print("암호? ");
        int code = keyboard.nextInt();
        keyboard.nextLine();
        
        System.out.print("사진? ");
        String picture = keyboard.nextLine();
        
        System.out.print("전화? ");
        String tell = keyboard.nextLine();
        
        
        
        System.out.println();
        System.out.printf("번호: %d\n", number);
        System.out.printf("이름: %s\n", name);
        System.out.printf("이메일: %s\n", email);
        System.out.printf("암호: %d\n", code);
        System.out.printf("사진: %s\n", picture);
        System.out.printf("전화: %s\n", tell);
        System.out.println("가입일: 2019-01-01");
        System.out.printf("%1$tY-%1$tm-%1$td-%1$ta-%1$tH-%1$tM-%1$tS", today);
        
        
        
    }
}

package ch21.b;

import java.util.Scanner;

public class PlusCommand implements Command{

  Scanner keyboard;
 
 public PlusCommand(Scanner keyboard) {
   this.keyboard = keyboard;
 }
 
  @Override
  public void excute() {
    System.out.print("값1? ");s
    int a = Integer.parseInt(keyboard.nextLine());
    
    System.out.print("값2? ");
    int b = Integer.parseInt(keyboard.nextLine());
        
    System.out.printf("%d + %d = %d\n", a, b, (a + b));
  }

}

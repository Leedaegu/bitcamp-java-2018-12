package design_pattern.Command.after;

public class HelloCommand implements Command{

  @Override
  public void excute() {
    System.out.println("안녕하세요!");    
  }

}

package design_pattern.Command.after;

public class BoardAddCommand implements Command{

  @Override
  public void excute() {
    System.out.println("게시물 입력 처리!");
  }

}

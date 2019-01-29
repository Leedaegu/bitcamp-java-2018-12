package design_pattern.Command.after;

public class BoardUpdateCommand implements Command{

  @Override
  public void excute() {
    System.out.println("게시물 변경 처리!");
  }

}

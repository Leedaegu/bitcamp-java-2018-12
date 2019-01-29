package design_pattern.Command.after;

public class BoardDeleteCommand implements Command{

  @Override
  public void excute() {
    System.out.println("게시물 삭제 처리!");
  }

}

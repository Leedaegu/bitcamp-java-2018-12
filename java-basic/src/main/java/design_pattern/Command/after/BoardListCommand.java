package design_pattern.Command.after;

public class BoardListCommand implements Command{

  @Override
  public void excute() {
    System.out.println("게시물 목록조회 처리!");
  }

}

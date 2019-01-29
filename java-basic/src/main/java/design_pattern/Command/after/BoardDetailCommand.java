package design_pattern.Command.after;

public class BoardDetailCommand implements Command{

  @Override
  public void excute() {
    System.out.println("게시물 상세조회 처리!");
  }

}

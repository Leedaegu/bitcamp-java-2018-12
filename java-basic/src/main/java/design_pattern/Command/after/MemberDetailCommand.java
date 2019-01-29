package design_pattern.Command.after;

public class MemberDetailCommand implements Command{

  @Override
  public void excute() {
    System.out.println("회원 상세조회 처리!");
  }

}

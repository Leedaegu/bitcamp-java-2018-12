package design_pattern.Command.after;

public class MemberListCommand implements Command{

  @Override
  public void excute() {
    System.out.println("회원 목록조회 처리!");
  }

}

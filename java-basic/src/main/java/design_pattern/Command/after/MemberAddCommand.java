package design_pattern.Command.after;

public class MemberAddCommand implements Command{

  @Override
  public void excute() {
    System.out.println("회원 입력 처리!");
  }

}

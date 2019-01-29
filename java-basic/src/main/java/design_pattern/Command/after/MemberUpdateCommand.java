package design_pattern.Command.after;

public class MemberUpdateCommand implements Command{

  @Override
  public void excute() {
    System.out.println("회원 변경 처리!");
  }

}

package design_pattern.Command.after;

public class MemberDeleteCommand implements Command{

  @Override
  public void excute() {
    System.out.println("회원 삭제 처리!");
  }

}

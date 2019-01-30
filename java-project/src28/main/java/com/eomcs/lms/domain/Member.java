package com.eomcs.lms.domain;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;

public class Member implements Cloneable {
  private int no;
  private String name;
  private String email;
  private String password;
  private String photo;
  private String tel;
  private Date registeredDate;
  
  @Override
  public Member clone() throws CloneNotSupportedException {
    return (Member) super.clone();
  }
  
  public int getNo() {
    return no;
  }
  public void setNo(int no) {
    this.no = no;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }
  public String getPhoto() {
    return photo;
  }
  public void setPhoto(String photo) {
    this.photo = photo;
  }
  public String getTel() {
    return tel;
  }
  public void setTel(String tel) {
    this.tel = tel;
  }
  public Date getRegisteredDate() {
    return registeredDate;
  }
  public void setRegisteredDate(Date registeredDate) {
    this.registeredDate = registeredDate;
  }
  
  // 인스턴스 필드를 사용하지않는 메서드는 스태틱으로 선언하라.
  public static Member valueOf(String csv) { // 파라미터 csv 는 "번호,제목,내용,시작일,종료일,총강의시간,일강의시간" 형식으로된 문자열이다.
    String[] values = csv.split(",");

    Member member = new Member();
    member.setNo(Integer.parseInt(values[0]));
    member.setName(values[1]);
    member.setEmail(values[2]);
    member.setPassword(values[3]);
    member.setPhoto(values[4]);
    member.setTel(values[5]);
    member.setRegisteredDate(Date.valueOf(values[6]));

    return member;
  }

  public static void outWrite(ArrayList<Member> memberList)  {
    try (FileWriter out = new FileWriter("member.csv");){
      for(Member member : memberList) {
        out.write(String.format("%d,%s,%s,%s,%s,%s,%s\n", // 여기에 공백이있으면 저장할때는 상관없지만 출력시에 공백을 읽어서 날짜데이터가 아니기때문에 오류가난다!
            member.getNo(),
            member.getName(),
            member.getEmail(),
            member.getPassword(),
            member.getPhoto(),
            member.getTel(),
            member.getRegisteredDate()));
      }
    } catch (IOException e) {
      e.printStackTrace();

    }
  }  
}

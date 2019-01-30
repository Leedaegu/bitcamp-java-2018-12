package com.eomcs.lms.domain;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;

public class Board implements Cloneable {
  private int no;
  private String contents;
  private Date createdDate;
  private int viewCount;

  @Override
  public Board clone() throws CloneNotSupportedException {
    return (Board) super.clone();
  }

  public int getNo() {
    return no;
  }
  public void setNo(int no) {
    this.no = no;
  }
  public String getContents() {
    return contents;
  }
  public void setContents(String contents) {
    this.contents = contents;
  }
  public Date getCreatedDate() {
    return createdDate;
  }
  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }
  public int getViewCount() {
    return viewCount;
  }
  public void setViewCount(int viewCount) {
    this.viewCount = viewCount;
  }

  //인스턴스 필드를 사용하지않는 메서드는 스태틱으로 선언하라.
  public static Board valueOf(String csv) { // 파라미터 csv 는 "번호,제목,내용,시작일,종료일,총강의시간,일강의시간" 형식으로된 문자열이다.
    String[] values = csv.split(",");

    Board board = new Board();
    board.setNo(Integer.parseInt(values[0]));
    board.setContents(values[1]);
    board.setCreatedDate(Date.valueOf(values[2]));
    board.setViewCount(Integer.parseInt(values[3]));

    return board;
  }

  public static void outWrite(ArrayList<Board> boardList)  {
    try (FileWriter out = new FileWriter("board.csv");){
      for(Board board : boardList) {
        out.write(String.format("%d,%s,%s,%d\n", // 여기에 공백이있으면 저장할때는 상관없지만 출력시에 공백을 읽어서 날짜데이터가 아니기때문에 오류가난다!
            board.getNo(),
            board.getContents(),
            board.getCreatedDate(),
            board.getViewCount()));

      }
    } catch (IOException e) {
      e.printStackTrace();

    }
  }
}

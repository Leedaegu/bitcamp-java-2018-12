package com.eomcs.lms.domain;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;

public class Lesson implements Cloneable {
  private int no;
  private String title;
  private String contents;
  private Date startDate;
  private Date endDate;
  private int totalHours;
  private int dayHours;

  @Override
  public Lesson clone() throws CloneNotSupportedException {
    return (Lesson) super.clone();
  }

  public int getNo() {
    return no;
  }
  public void setNo(int no) {
    this.no = no;
  }
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public String getContents() {
    return contents;
  }
  public void setContents(String contents) {
    this.contents = contents;
  }
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }
  public Date getEndDate() {
    return endDate;
  }
  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }
  public int getTotalHours() {
    return totalHours;
  }
  public void setTotalHours(int totalHours) {
    this.totalHours = totalHours;
  }
  public int getDayHours() {
    return dayHours;
  }
  public void setDayHours(int dayHours) {
    this.dayHours = dayHours;
  }

  // 인스턴스 필드를 사용하지않는 메서드는 스태틱으로 선언하라.
  public static Lesson valueOf(String csv) { // 파라미터 csv 는 "번호,제목,내용,시작일,종료일,총강의시간,일강의시간" 형식으로된 문자열이다.
    String[] values = csv.split(",");

    Lesson lesson = new Lesson();
    lesson.setNo(Integer.parseInt(values[0]));
    lesson.setTitle(values[1]);
    lesson.setContents(values[2]);
    lesson.setStartDate(Date.valueOf(values[3]));
    lesson.setEndDate(Date.valueOf(values[4]));
    lesson.setTotalHours(Integer.parseInt(values[5]));
    lesson.setDayHours(Integer.parseInt(values[6]));

    return lesson;
  }
 
}



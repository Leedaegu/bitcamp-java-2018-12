package ch26.h;

public class AttachFile {
  private int no;
  private String filePath;
  private int boardNo;
    
  @Override
  public String toString() {
    return "AttachFile [no=" + no + ", filePate=" + filePath + ", boardNo=" + boardNo + "]";
  }
  
  public int getNo() {
    return no;
  }
  public void setNo(int no) {
    this.no = no;
  }
  public String getFilePate() {
    return filePath;
  }
  public void setFilePate(String filePate) {
    this.filePath = filePate;
  }
  public int getBoardNo() {
    return boardNo;
  }
  public void setBoardNo(int boardNo) {
    this.boardNo = boardNo;
  }
  
  
  
}

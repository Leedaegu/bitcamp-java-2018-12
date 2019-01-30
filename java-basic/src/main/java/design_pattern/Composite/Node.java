package design_pattern.Composite;

public abstract class Node {
  protected String title;
  
  public String getTitle() {
    return this.title;
  }
  
  public abstract void getFileInfo();
  
}

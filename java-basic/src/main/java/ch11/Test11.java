  // Wrapper 클래스와 오토박싱(auto-boxing)/오토언박싱(auto-unboxing)
package ch11;


public class Test11{
   
  public static void main(String[] args) {
  
    Integer obj1 = new Integer(100);
    Integer obj2 = new Integer(100);
    
    if (obj1 == obj2)
      System.out.println("ojb1 == obj2");
    else
      System.out.println("ojb1 != obj2");
    
    if (obj1.equals(obj2))
      System.out.println("obj1.equals(obj2)");
    else
      System.out.println("!obj1.equals(obj2)");
  
    Integer obj3 = Integer.valueOf(100);
    Integer obj4 = Integer.valueOf(100);
    
    

    if (obj3 == obj4)
      System.out.println("ojb3 == obj4");
    else
      System.out.println("ojb3 != obj4");
    
    
    
  
  }
  
  
  
}

















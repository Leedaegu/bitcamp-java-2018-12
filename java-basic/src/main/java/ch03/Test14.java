//배열 - 인스턴스와 레퍼런스
package ch03;

public class Test14 {
  public static void main(String[] args) {
  
  
    int[] arr1 = new int[] { 101, 102, 103, 104, 105}; 
    int[] arr2 = { 81, 82, 83, 84, 85};
    //int[] arr2 = null
    arr2 = arr1;
    
    System.out.printf("%d, %d\n", arr1[1], arr2[1]);

    arr1[1] = 500;
    
    System.out.printf("%d, %d\n", arr1[1], arr2[1]);

    //System.gc();
    
    
  } 
}

//배열 - 선언하는 방법과 사용하는 방법
package ch03;

public class Test11 {
  public static void main(String[] args) {
  //배열 문법을 사용하지 않고 같은 종류의 값을 여러개 저장하는 방법
    int a1, a2, a3, a4, a5;
    a1 = 100;
    a2 = 90;
    a3 = 80;
    a4 = 70;
    a5 = 60;
    
    //배열 문법을 사용하여 같은 종류의 메모리를 여러 개 만드는방법
    //#c언어 스타일
    //int arr2[5]; //c언어 스타일 - c에서는 배열을 만들때 개수를 바로 지정한다.
                     //  자바는 이런 문법을 지원하지않는다. 컴파일 오류!!
    //#자바 스타일
    // 1) 배열을 가리킬 레퍼런스 선언
    // => 레퍼런스(reference)? 메모리의 주소를 저장하는 변수
    int[] arr1;// 자바는 이형식을 선호한다.
    int arr2[];
    
    
    //arr1[0] = 100;
                   //null - 주소없음.  
    arr1 = null; //null? 0으로 설정한다. 즉 특정메모리를 가리키지 않는상태를 표시함.
    arr1[0] = 100;
    
    
    //배열을 만들지도 않고,레퍼런스를 사용하려 하면 오류
    
    // 2) 배열을 생성하고 그주소를 레퍼런스에 담는다.
    
    arr1 = new int[5];
    arr2 = new int[5];
    
    //3) 배열에 값을 담기 - 배열 레퍼런스를 사용하여 메모리를 저장한다.
    arr1[0] = 100;
    arr1[1] = 90;
    arr1[2] = 80;
    arr1[3] = 70;
    arr1[4] = 60;
    //arr1[-1] = 100; ArrayIndexOutOfBoundsException
    //arr1[5] = 50;   ArrayIndexOutOfBoundsException
    
    
  } 
}

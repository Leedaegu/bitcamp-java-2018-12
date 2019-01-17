package com.eomcs.lms.handler;


import java.util.Arrays;
import com.eomcs.lms.domain.Member;

public class MemberList {
  
  static final int LENGTH = 3;  
  Member[] arr = new Member[LENGTH];
  int size = 0;
  
  public Member[] toArray() {
    Member[] a = new Member[size];
    for (int i = 0; i < size; i++) {
      a[i] = this.arr[i];
    }
    return a;   
  } 
  
  
  
  public void add(Member member) {
    if(size == arr.length) {
      arr = Arrays.copyOf(arr, arr.length + (arr.length >> 1));

      System.out.printf("배열  증가 함: %d\n", arr.length);
    }    
    arr[size++] = member;
  }
  
}

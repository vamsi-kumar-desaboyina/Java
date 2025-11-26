package com.javaprograms.arrays;
import java.util.*;
public class ArrayInSorting {
  public static void main(String[] args) {
    int[] arr={4,7,1,3,9,6};
    Arrays.sort(arr);
    for(int i=0;i<=arr.length-1;i++)
    {
      System.out.println(arr[i]);
    }
    
  }
}

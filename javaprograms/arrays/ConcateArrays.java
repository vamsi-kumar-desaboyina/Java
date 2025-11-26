package com.javaprograms.arrays;
import java.util.*;
public class ConcateArrays {
  public static void main(String[] args) {
    int[] arr1={1,5,3,4,2};
    int[] arr2={9,7,6,8,10};
    int[] narr= new int[arr1.length+arr2.length];
    for(int i=0;i<=arr1.length-1;i++)
    {
      narr[i]=arr1[i];
    }
    int k=0;
    for(int i=arr1.length;i<=narr.length-1;i++)
    {
      narr[i]=arr2[k++];
    }
    Arrays.sort(narr);
    for(int ele:narr)
    {
      System.out.print(ele+" ");
    }
  }
}

package com.javaprograms.arrays;
public class SumofTwoArrays {
  public static void main(String[] args) {
    int[] arr1={2,5,7,9,6};
    int[] arr2={9,3,5,4,2};
    int[] narr=new int[arr1.length];
    for(int i=0;i<=narr.length-1;i++)
    {
      narr[i]=arr1[i]+arr2[i];
    }
    for(int ele:narr)
    {
      System.out.print(ele+" ");
    }
  }
}

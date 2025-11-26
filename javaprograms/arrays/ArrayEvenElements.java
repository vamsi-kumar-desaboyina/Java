package com.javaprograms.arrays;
public class ArrayEvenElements {
  public static void main(String[] args) {
    int[] arr={4,7,1,3,2,9,6};
    // int[] narr=new int[arr.length];
    // for(int i=0;i<=arr.length-1;i++)
    // {
    //     if (arr[i]%2==0) {
    //       narr[i]=arr[i];
    //     }
    // }
    // for(int i=0;i<=narr.length-1;i++)
    // {
    //   if(narr[i]!=0)
    //     System.out.println(narr[i]);
    // }

    for(int i=0;i<=arr.length-1;i++)
    {
        if (arr[i]%2==0) {
          System.out.println(arr[i]);
        }
    }
  }
  
}

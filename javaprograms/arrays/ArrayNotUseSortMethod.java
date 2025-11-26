package com.javaprograms.arrays;
public class ArrayNotUseSortMethod {
  public static void main(String[] args) {
    int[] arr={4,7,1,3,9,6};
    for(int i=0;i<=arr.length-1;i++)
    {
      for(int j=0;j<=arr.length-1;j++)
      {
        if (arr[i]<arr[j]) {
          int temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
        }

      }
    }


    for(int i=0;i<=arr.length-1;i++)
    {
      System.out.println(arr[i]);
    }
  }
}

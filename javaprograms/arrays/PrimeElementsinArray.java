package com.javaprograms.arrays;
public class PrimeElementsinArray {
  public static void main(String[] args) {
    int[] arr={12,5,7,9,6,11,17,4};
    for(int i=0;i<=arr.length-1;i++)
    {
      boolean b=true;
      for(int j=2;j<=arr[i]/2;j++)
      {
        if (arr[i]%j==0) {
          b=false;
          break;
        }
      }
      if (b==true) {
        System.out.print(arr[i]+" ");
      }
    }
  }
}

package com.javaprograms.arrays;
public class SumOfArray {

  public static void main(String[] args) {
    int[] arr={4,7,1,3,9,6,'a'};
    int sum=0;
    for(int i=0;i<=arr.length-1;i++)
    {
        sum=sum+arr[i];
    }
    System.out.println("sum of array "+sum);
  }
  
}

package com.javaprograms.arrays;
public class DuplicatesInArray {
  public static void main(String[] args) {
    int[] arr={5,7,3,2,1,9,3,5,7,4};
    
    for(int i=0;i<=arr.length-1;i++)
    {
      
      for(int j=i+1;j<=arr.length-1;j++)
      {
          if(arr[i]==arr[j])
          {
            System.out.print(arr[i]+" ");
          }
      }
      
    }
  }
  
}

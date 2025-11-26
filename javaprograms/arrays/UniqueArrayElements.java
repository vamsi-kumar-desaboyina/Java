package com.javaprograms.arrays;
public class UniqueArrayElements {
  public static void main(String[] args) {
    int[] arr={5,7,3,2,1,9,3,5,7,4};
    
    for(int i=0;i<=arr.length-1;i++)
    {
      int count=0;
      for(int j=0;j<=arr.length-1;j++)
      {
          if(arr[i]==arr[j])
          {
            count++;
          }
      }
      if (count==1) {
        System.out.print(arr[i]+" ");
      }
      
    }
  }
}

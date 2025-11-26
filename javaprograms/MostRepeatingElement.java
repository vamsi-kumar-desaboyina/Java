package com.javaprograms;
public class MostRepeatingElement {
  public static void main(String[] args) {
    int[] arr={2,6,5,9,1,2,6,7,6,5,5,9,1,5};
    int max=Integer.MIN_VALUE;
    int ele=0;
    for(int i=0;i<arr.length;i++)
    {
      int count=0;
      for(int j=0;j<arr.length;j++)
      {
          if(arr[i]==arr[j])
          {
            count++;
          }
      }
      if(count>max)
      {
        max=count;
        ele=arr[i];
      }
    }
    System.out.println(ele+" "+max);
  }
}

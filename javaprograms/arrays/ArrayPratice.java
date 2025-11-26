package com.javaprograms.arrays;
import java.util.Scanner;

public class ArrayPratice {
  public static void main(String[] args) {
    // Scanner sc= new Scanner(System.in);
    // System.out.println("enter the numner: ");
    // int n=sc.nextInt();
    // int[] arr= new int[n];
    // for(int i=0;i<=arr.length-1;i++)
    // {
    //   System.out.println("enter the numner: ");
    //   arr[i]=sc.nextInt();
    // }
    // for (int ele : arr) {
    //   System.out.print(ele+" ");
    // }

    // int[] arr={4,8,1,3,9};
    // int sum=0;
    // for (int ele : arr) {
    //     sum=sum+ele;
    //   }
    //   System.out.print(sum+" ");

    // int[] arr={5,1,3,2,6,7};
    // int[] narr= new int[arr.length+1];
    // int l=narr.length;
    // int sum=0;
    // for (int i : arr) {
    //   sum=sum+i;
    // }
    // int preres=(l*(l+1))/2;
    // int res=preres-sum;
    // System.out.println(res);


  //   Scanner sc= new Scanner(System.in);
  //   System.out.println("enter the numner: ");
  //   int n=sc.nextInt();
  //   System.out.println("enter the numner: ");
  //   int n1=sc.nextInt();
  //   int[][] arr= new int[n][n1];
  //   for(int i=0;i<=arr.length-1;i++)
  //   {
  //     for(int j=0;j<=arr.length-1;j++)
  //   {
  //     System.out.println("enter the numner: ");
  //     arr[i][j]=sc.nextInt();
  //   }
  // }
  //   for(int i=0;i<=arr.length-1;i++)
  //   {
  //     for(int j=0;j<=arr.length-1;j++)
  //   {
  //     System.out.print(arr[i][j]+" ");
  //   }
  //   System.out.println("");
    
  // }


  int[][] arr={ 
    {1,2,3}, 
    {4,5,6}, 
    {7,8,9} 
  }; 
  int sum=0;
  for(int i=0;i<=arr.length-1;i++)
    {
      for(int j=0;j<=arr.length-1;j++)
    {
      if (i>j) {
        sum=sum+arr[i][j];
      }
      
    }
      
  }
  System.out.println(sum);


  }
}

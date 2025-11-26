package com.javaprograms;
import java.util.Scanner;

public class PosOrNeg {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter the number: ");
    int n=sc.nextInt();
    if (n==0) 
    {
       System.out.println("not an even nor an odd");
//       System.exit(0); 
       return;
    }
    if(n>0)
    {
      System.out.println("positive "+n);
    }
    else
    {
      System.out.println("negitive "+n);
    }
  }
  
}

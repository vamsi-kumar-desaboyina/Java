package com.javaprograms;
import java.util.Scanner;

public class Prime1to100 {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the number: ");
    int n=sc.nextInt();
    if(n<2) {
    	System.out.println("no primes");
    	return;
    }
    for(int i=2;i<=n;i++)
    {
      boolean b=true;
        for(int j=2;j<i;j++)
        {
            if (i%j==0) {
              b=false;
              break;
              
            }
        }
        if (b==true) {
          System.out.println("prime "+i);
        }
    }
  }
  
}

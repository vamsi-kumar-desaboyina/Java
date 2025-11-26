package com.javaprograms;
import java.util.Scanner;

public class EvenOrOdd {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter the number: ");
    int n=sc.nextInt();

    if((n&1)==0)
    {
      System.out.println("even "+n);
    }
    else
    {
      System.out.println("odd "+n);
    }
   }
  
}

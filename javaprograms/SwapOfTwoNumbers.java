package com.javaprograms;
import java.util.Scanner;

public class SwapOfTwoNumbers {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter the number: ");
    int a=sc.nextInt();
    System.out.println("Enter the number: ");
    int b=sc.nextInt();
    
    System.out.println("Before swapping "+a+" "+b);
    // int temp;
    // temp=a;
    // a=b;
    // b=temp;

    a=a+b;
    b=a-b;
    a=a-b;

    System.out.println("After swapping "+a+" "+b);


  }
}

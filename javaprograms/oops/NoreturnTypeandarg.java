package com.javaprograms.oops;
import java.util.Scanner;

public class NoreturnTypeandarg
 {
  public static void main(String[] args) {
    m1();
  }
  public static void m1()
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the  number :"); 
    int a=sc.nextInt();
    System.out.println("Enter the  number :"); 
    int b=sc.nextInt();
    int sum=a+b;
    System.out.println(sum);
  }
  
}


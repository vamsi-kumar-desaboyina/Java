package com.javaprograms.oops;
import java.util.Scanner;

public class Noreturnwitharg {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the  number :"); 
    int a=sc.nextInt();
    System.out.println("Enter the  number :"); 
    int b=sc.nextInt();
    m1(a, b);
  }
  public static void m1(int a,int b)
  {
    int sum=a+b;
    System.out.println(sum);
  }
}

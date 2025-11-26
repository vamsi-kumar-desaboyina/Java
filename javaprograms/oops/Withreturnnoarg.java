package com.javaprograms.oops;
import java.util.Scanner;

public class Withreturnnoarg {
  public static void main(String[] args) {
    System.out.println(m1());
  }
  public static int m1()
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the  number :"); 
    int a=sc.nextInt();
    System.out.println("Enter the  number :"); 
    int b=sc.nextInt();
    int sum=a+b;
    return sum;
  }
}

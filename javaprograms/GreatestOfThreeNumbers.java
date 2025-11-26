package com.javaprograms;
import java.util.Scanner;

public class GreatestOfThreeNumbers {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter the number: ");
    int a=sc.nextInt();
    System.out.println("Enter the number: ");
    int b=sc.nextInt();
    System.out.println("Enter the number: ");
    int c=sc.nextInt();
    int d=a+b+c;
    System.out.println("sum of three numbers= "+d);
    if(a>b && a>c) System.out.println("a is greater");
    else if(b>c) System.out.println("b is greater");
    else System.out.println("c is greater");

  }
}

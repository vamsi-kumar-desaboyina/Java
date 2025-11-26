package com.javaprograms;
import java.util.Scanner;
public class GreatestOfTwoNumbers
{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter the number: ");
    int a=sc.nextInt();
    System.out.println("Enter the number: ");
    int b=sc.nextInt();
    int c=a+b;
    System.out.println(c);
    if(b>a) System.out.println("b is greater");
    else System.out.println("a is greater");
  }

}

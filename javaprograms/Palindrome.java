package com.javaprograms;
import java.util.Scanner;

public class Palindrome {
   public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the number: ");
    int a=sc.nextInt();
    int temp=a;
    int rev=0;
    while (a>0) {
      rev=rev*10+(a%10);
      a=a/10;
      
    }
    if(temp==rev)
    System.out.println("given number is palindrome: "+temp);
    else
    System.out.println("given number is not palindrome: "+temp);
  }
  
}

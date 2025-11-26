package com.javaprograms;
import java.util.Scanner;

public class Armstrong {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the number: ");
    int a=sc.nextInt();
    int temp=a;
    int temp1=a;
    String str=String.valueOf(temp1);
    int length=str.length();
    System.out.println(length);
    int count=0;
    while(temp1>0)
    {
    	temp1=temp1/10;
    	count++;
    }
    System.out.println(count);
    int sum=0;
    while (a>0) {
      sum=sum+(int) Math.pow(a%10, count);
      a=a/10;
      
    }
    if(temp==sum)
    System.out.println("given number is armstrong: "+temp);
    else
    System.out.println("given number is not armstrong: "+temp);
    
  }
  

  
}

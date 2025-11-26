package com.javaprograms;
import java.util.*;;
public class Factorial {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the number: ");
    int n=sc.nextInt();
    int fac=1;
    // while (n>0) {
    //   fac=fac*n;
    //   n--;
      
    // }

    for(int i=n;i>0;i--)
    {
      fac=fac*i;
    }
    System.out.println("factorial of the given number: "+fac);
  }
  
}

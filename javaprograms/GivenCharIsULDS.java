package com.javaprograms;
import java.util.Scanner;

public class GivenCharIsULDS {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter the character: ");

    char ch=sc.next().charAt(0);

    if(ch>='A' && ch<='Z')
    {
      System.out.println("Uppercase "+ch);
    }
    else if (ch>='a' && ch<='z') {
      System.out.println("Lowercase "+ch);
    }
    else if (ch>='0' && ch<='9') {
      System.out.println("Digit "+ch);
    }
    else
    {
      System.out.println("Special "+ch);
    }

  }
  
}

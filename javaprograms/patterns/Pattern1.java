package com.javaprograms.patterns;
public class Pattern1 {
  public static void main(String[] args) {
    for(int i=1;i<=4;i++)
    {
      for(int j=4;j>i;j--)
      {
        System.out.print("  ");
      }
      for(int j=1;j<=i;j++)
      {
        System.out.print("* ");
      }
      for(int j=i-1;j>=1;j--)
      {
        System.out.println("* ");
      }
      System.out.println("");
    }

  }
}


package com.javaprograms;
public class CountOddAndEven {
  public static void main(String[] args) {
    int counte=0;
    int counto=0;
    for(int i=1;i<=10;i++)
    {
      if(i%2==0)
      counte++;
      else
      counto++;
      
    }
    System.out.println("even "+ counte);
      System.out.println(counto+" odd");
  }
  
}

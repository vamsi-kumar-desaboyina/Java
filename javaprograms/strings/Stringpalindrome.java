package com.javaprograms.strings;
public class Stringpalindrome {
  public static void main(String[] args) {
    String str="dad";
    String rev="";
    char[] carr=str.toCharArray();
    for(int i=carr.length-1;i>=0;i--)
    {
        rev=rev+carr[i];
    }
    if (str.equals(rev)) {
      System.out.println("palindrome "+str);
    }
    else
    {
      System.out.println("palindrome not  "+str);
    }

  }
}

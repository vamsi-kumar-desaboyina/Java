package com.javaprograms.strings;
public class StringRev {
  
  public static void main(String[] args) {
    String str="hello";
    String rev="";
    char[] carr=str.toCharArray();
    for(int i=carr.length-1;i>=0;i--)
    {
        rev=rev+carr[i];
    }
    System.out.println(rev);

  }
}

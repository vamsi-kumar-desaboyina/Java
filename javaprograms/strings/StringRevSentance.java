package com.javaprograms.strings;
public class StringRevSentance {
  public static void main(String[] args) {
    String str="This Is Java Class";
    String[] sarr=str.split(" ");
    for(int i=sarr.length-1;i>=0;i--)
    {
      System.out.print(sarr[i]+" ");
    }
  }
}

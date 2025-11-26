package com.javaprograms.strings;
public class StringBufferStringRevPal {
  public static void main(String[] args) {
    String str="dad";
    StringBuffer sb= new StringBuffer(str);
    String rev=sb.reverse().toString();
    if (rev.equals(str)) {
      System.out.println("pal");
    }
    else
    {
      System.out.println("not pal");
    }
  }
}

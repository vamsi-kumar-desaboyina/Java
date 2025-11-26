package com.javaprograms.strings;
public class StringBufferStringRev {
  public static void main(String[] args) {
    String str="hello";
    StringBuffer sb=new StringBuffer(str);
    String rev=sb.reverse().toString();
    System.out.println(rev);
  }
}

package com.javaprograms.strings;
public class RevWordSentence {
  public static void main(String[] args) {
    String str="This Is Java Class";
    String[] sarr=str.split(" ");
    String rev="";
    for (String string : sarr) {
      char[] carr=string.toCharArray();
      for (int i=carr.length-1;i>=0;i--) {
        rev=rev+carr[i];
      }
      rev=rev+" ";
    }
    System.out.println(rev);
  }
}

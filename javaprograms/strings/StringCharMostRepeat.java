package com.javaprograms.strings;
public class StringCharMostRepeat {
  public static void main(String[] args) {
    String str="ihubtalentinstitute";
    char[] carr=str.toCharArray();
    int max=0;
    char ch=' ';
    for(int i=0;i<=carr.length-1;i++)
    {
      int count=0;
      for(int j=0;j<=carr.length-1;j++)
      { 
        if (carr[i]==carr[j]) {
          count++;
        }

      }
      if (count>max) {
        max=count;
        ch=carr[i];
      }
    }
    System.out.println(max+" "+ch);
  }
}

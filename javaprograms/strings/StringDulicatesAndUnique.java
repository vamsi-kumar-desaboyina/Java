package com.javaprograms.strings;
public class StringDulicatesAndUnique {
  public static void main(String[] args) {
    String str="google";
    char[] carr=str.toCharArray();
    for(int i=0;i<=carr.length-1;i++)
    {
      for(int j=i+1;j<=carr.length-1;j++)
      {
          if (carr[i]==carr[j]) {
            System.out.print(carr[i]);
          }
      }
    }
    System.out.println("");
    for(int i=0;i<=carr.length-1;i++)
    {
      for(int j=i+1;j<=carr.length-1;j++)
      {
          if (carr[i]==carr[j]) {
            System.out.print(carr[i]);
          }
      }
    }
    for(int i=0;i<=carr.length-1;i++)
    {
      int count=0;
      for(int j=0;j<=carr.length-1;j++)
      {
          if (carr[i]==carr[j]) {
            count++;
          }
      }
      if (count==1) {
        System.out.print(carr[i]);
      }
    }
  }
}

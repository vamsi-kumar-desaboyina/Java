package com.javaprograms;
public class EscapeCharcters {
  public static void main(String[] args) {
    System.out.println("vamsi\nkumar");
    System.out.println("vamsi\\kumar");
    System.out.println("vamsiku\'mar");
    System.out.println("vamsikum\"ar");
    System.out.println("vamsikum\bar");//not supported in ide
    System.out.println("vamsi\b\b\bkumar");//not supported in ide
    System.out.println("vamsiku\tmar");
    System.out.println("vamsiku\rmar");//not supported in ide
    System.out.println("vamsikumar");
    System.out.println("vamsikumar");

  }
}

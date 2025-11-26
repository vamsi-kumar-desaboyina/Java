package com.javaprograms.strings;
import java.util.Scanner;

public class ReverseNumberAndDWords {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the number: ");
    int a=sc.nextInt();
    while (a>0) {
      switch (a%10) {
        case 0:
          System.out.println("zero");
          break;
          case 1:
          System.out.print("one");
          break;
          case 2:
          System.out.print("two");
          break;
          case 3:
          System.out.print("three");
          break;
          case 4:
          System.out.print("four");
          break;
          case 5:
          System.out.print("five");
          break;
          case 6:
          System.out.print("six");
          break;
          case 7:
          System.out.print("seven");
          break;
          case 8:
          System.out.print("eight");
          break;
          case 9:
          System.out.print("nine");
          break;
      
        default:
        System.out.print("none");
          break;
      }
      a=a/10;
      
    }
  }
  
}

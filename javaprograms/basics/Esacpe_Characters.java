package com.javaprograms.basics;
public class Esacpe_Characters {
  public static void main(String[] args) {
    System.out.println("vamsi\nkumar");// o/p vamsi
                                         //     kumar
    System.out.println("----------------------------------");
    System.out.println("vamsi\tkumar"); // o/p vamsi  kumar
    System.out.println("----------------------------------");
    System.out.println("vamsi\bkumar"); // o/p vamskumar
    System.out.println("----------------------------------");
    System.out.println("vamsi\\kumar"); //vamsi\kumar
    System.out.println("----------------------------------");
    System.out.println("vamsi\"kumar");// vamsi"kumar
    System.out.println("----------------------------------");
    System.out.println("vamsi\'kumar"); //vamsi'kumar
    System.out.println("----------------------------------");
    System.out.println("vamsi'kumar"); //vamsi'kumar
    System.out.println("----------------------------------");
    System.out.println("vamsi\rkumar"); //kumar
    System.out.println("----------------------------------");

  }
}

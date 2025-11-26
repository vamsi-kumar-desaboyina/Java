package com.javaprograms.basics;
import java.util.*;
public class Decision_making_statements_if {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    //if
    // System.out.println("Enter the number: ");
    // int a=scanner.nextInt();
    // if(true)
    // {
    //   System.out.println("if is true then this block is executed");
    // }
    // if(a==10)
    // {
    //   System.out.println("given number is equal to 10");
    // }

    // Q)Write a java program to find out greatest of two numbers? 
    // System.out.println("Enter the number: ");
    // int n1=scanner.nextInt();
    // System.out.println("Enter the number: ");
    // int n2=scanner.nextInt();
    // if(n1>n2)
    // {
    //   System.out.println("n1 is bigger");
    // }
    // if(n1<n2)
    // {
    //   System.out.println("n2 is bigger");
    // }
    
    //if else
  // if(true) 
  //   { 
  //   System.out.println("if is true then this block is executed"); 
  //   } 
  // else 
  //   { 
  //   System.out.println("if is false then this block is executed"); 
  //   }

  //Q)Write a java program to find out given age is eligible to vote or not? 
  // System.out.println("Enter the number: ");
  // int age=scanner.nextInt();
  // if(age>=18)
  // System.out.println("vote");
  // else
  // System.out.println("not eligible");

  // Q)Write a java program to check given number is even or odd?
    // System.out.println("Enter the number: ");
    // int number=scanner.nextInt();
    // if (number%2==0) {
    //   System.out.println("even number "+number);
    // }
    // else
    // System.out.println("odd number "+number);

     
  //Q)Write a java program to check given number is odd or not ? 
  // System.out.println("Enter the number: ");
  // int number=scanner.nextInt();
  // if (number%2!=0) {
  //   System.out.println("odd number "+number);
  // }
  // else{
  //   System.out.println("not odd number "+number);
  // }

  //Q)Write a java program to find out given number is +ve or -ve ?
  // System.out.println("Enter the number: ");
  // int number=scanner.nextInt();
  // if (number==0) {
  //   System.out.println("NOR NEGITIVE or positive");
  //   System.exit(0); 
  // }
  // if(number>0)
  // {
  //   System.out.println("positive ");
  // }
  // else{
  //   System.out.println("negitive ");
  // }

  //if else if ladder
//   if(true) 
//  { 
//   System.out.println("this block will be executed 1");//code to be execute if if is true  
//  } 
//  else if(true) 
//  { 
//   System.out.println("this block will be executed 2"); //code to be execute if else if 1st is true and if is false
//  } 
//  else if(true) 
//  { 
//   System.out.println("this block will be executed 3"); //code to be execute if else if 2nd is true and if is false and else if 1 st is false 
//  } 
//  else 
//  { 
//   System.out.println("this block will be executed");//code to be execute if all are false. 
//  }

    //Q)Write a java program to find out given alphabet is a vowel or not? 
    // System.out.println("Enter the alphabet: ");
    // char chara=scanner.next().charAt(0);
    // if(chara=='a' || chara=='A' || chara=='e' || chara=='E' || chara=='i' || chara=='I' || chara=='o' || chara=='O' || chara=='u' || chara=='U')
    // {
    //   System.out.println("voewl "+chara);
    // }
    // else
    // {
    //   System.out.println("not vowel "+ chara);
    // }

    // if(chara=='a' || chara=='A')
    // {
    //   System.out.println("voewl "+chara); 
    // }
    // else if(chara=='e' || chara=='E')
    // {
    //   System.out.println("voewl "+chara);
    // }
    // else if(chara=='i' || chara=='I')
    // {
    //   System.out.println("voewl "+chara);
    // }
    // else if(chara=='o' || chara=='O')
    // {
    //   System.out.println("voewl "+chara);
    // }
    // else if(chara=='u' || chara=='U')
    // {
    //   System.out.println("voewl "+chara);
    // }
    // else
    // {
    //   System.out.println("not vowel "+ chara);
    // }

    //Q)Write a java program to find out given alphabet is a upper case letter, lower case letter, digit or a special symbol? 
    // System.out.println("Enter the alphabet: ");
    // char chara=scanner.next().charAt(0);
    // if (chara>='a' && chara<='z') {
    //   System.out.println("lower case "+chara);
    // }
    // else if (chara>='A' && chara<='Z') {
    //   System.out.println("upper case "+chara);
    // }
    // else if (chara>='0' && chara<='9') {
    //   System.out.println("Digit "+chara);
    // }
    // else
    // {
    //   System.out.println("special character "+ chara);
    // }

    //nested if stmt
    //     if(condition) 
          // { 
          //   if(condition) 
          //   {  
          //   - 
          //   - //code to be execute  
          //   - 
          //   } 
        // }  

    // 
//Q)Write a java program to find out given number is +ve or -ve by using  nested if stmt?
   System.out.println("Enter the number: ");
    int number=scanner.nextInt();
    if(number!=0)
    {
      if(number>0)
      {
        System.out.println("positive: "+number);
      }
      else
      {
        System.out.println("negitive: "+number);
      }
    }

scanner.close();
 
   



  }
}

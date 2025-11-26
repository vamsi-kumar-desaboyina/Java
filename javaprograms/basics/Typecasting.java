package com.javaprograms.basics;
public class Typecasting {
  public static void main(String[] args) {
    //implicet 
    byte b=10;
    System.out.println(b);
    // Short s=b;
    // System.out.println(s);
    int i=b;
    System.out.println(i);
    long l=b;
    System.out.println(l);
    float f=b;
    System.out.println(f);
    double d=b;
    System.out.println(d);
    // char ch=b;
    // System.out.println(ch);

    System.out.println("-------------------------------------------");

    short s1=200;
    System.out.println(s1);
    int i1=s1;
    System.out.println(i1);
    long l1=s1;
    System.out.println(l1);
    float f1=s1;
    System.out.println(f1);
    double d1=s1;
    System.out.println(d1);
    // char ch1=s1;
    // System.out.println(ch);

    System.out.println("-------------------------------------------");

    int i2=50000;
    System.out.println(i2);
    long l2=i2;
    System.out.println(l2);
    float f2=i2;
    System.out.println(f2);
    double d2=i2;
    System.out.println(d2);

    System.out.println("-------------------------------------------");

    long l3=2222222222222l;
    System.out.println(l3);
    float f3=l3;
    System.out.println(f3);
    double d3=l3;
    System.out.println(d3);
    System.out.println("-------------------------------------------");

    float f4=3.12f;
    System.out.println(f4);
    double d4=f4;
    System.out.println(d4);
    System.out.println("-------------------------------------------");

    char ch5='a';
    System.out.println(ch5);
    // short s5=ch5;
    // System.out.println(s5);
    int i5=ch5;
    System.out.println(i5);
    long l5=ch5;
    System.out.println(l5);
    float f5=ch5;
    System.out.println(f5);
    double d5=ch5;
    System.out.println(d5);
    System.out.println("-------------------------------------------");

    //explicet
    double d6=333333333333333333333d;
    System.out.println(d6);
    float f6=(float)d6;
    System.out.println(f6);
    long l6=(long)d6;
    System.out.println(l6);
    int i6=(int)d6;
    System.out.println(i6);
    short s6=(short)d6;
    System.out.println(s6);
    byte b6=(byte)d6;
    System.out.println(b6);
    char ch6=(char)d6;
    System.out.println(ch6);
    System.out.println("-------------------------------------------");

    float f7=30000.14f;
    System.out.println(f7);
    long l7=(long)f7;
    System.out.println(l7);
    int i7=(int)f7;
    System.out.println(i7);
    short s7=(short)f7;
    System.out.println(s7);
    byte b7=(byte)f7;
    System.out.println(b7);
    char ch7=(char)f7;
    System.out.println(ch7);
    System.out.println("-------------------------------------------");

    long l8=5555555555l;
    System.out.println(l8);
    int i8=(int)l8;
    System.out.println(i8);
    short s8=(short)l8;
    System.out.println(s8);
    byte b8=(byte)l8;
    System.out.println(b8);
    char ch8=(char)l8;
    System.out.println(ch8);
    System.out.println("-------------------------------------------");

    int i9=100000;
    System.out.println(i9);
    short s9=(short)i9;
    System.out.println(s9);
    byte b9=(byte)i9;
    System.out.println(b9);
    char ch9=(char)i9;
    System.out.println(ch9);
    System.out.println("-------------------------------------------");

    short s10=15000;
    System.out.println(s10);
    byte b10=(byte)s10;
    System.out.println(b10);
    char ch10=(char)s10;
    System.out.println(ch10);
    System.out.println("-------------------------------------------");

    byte b11=94;
    System.out.println(b11);
    char ch11=(char)b11;
    System.out.println(ch11);
    System.out.println("-------------------------------------------");

    //     The process of converting from one datatype to another datatype is called typecasting. 
    // In java, typecasting can be performed in two ways. 
    // 1)Implicit typecasting  
    // 2)Explicit typecasting  
    // 1)Implicit typecasting  ----------------------- 
    // If we want to store small value into a bigger variable then we need to use implicit typecasting. 
    // A compiler is responsible to perform implicit typecasting. 
    // There is no possibility to loss the information. 
    // It is also known as widening or upcasting. 
    
    // We can perform implicit typecasting as follow. 
    
    // ex: 
    // byte ---> short 
    //                   ---> 
    //                         int  -->long -->float -->double 
    //   char       ---> 
    

    //     2)Explicit typecasting  ---------------------- 
    // If we want store big value into a smaller variable then we need to use explicit typecasting. 
    
    // A programmer is responsible to perform explicit typecasting. 
    
    // There is a possibility to loss the information. 
    
    // It is also known as Narrowing or Downcasting. 
    
    // We can perform explicit typecasting as follow. 
    
    // ex: 
    // byte <--- short 
    //               <--- 
    //                    int  <-- long <--float <--double 
    //     char<--
  }
}

package com.javaprograms.basics;
public class Operators_java {
  public static void main(String[] args) {
    //Assignment
    int n=10;
    n=20;
    n=30;
    n=15;
    System.out.println(n);
    System.out.println("----------------------------------------");


    //Arthmetic
    int a=10;
    int b=20;
    int c=30;
    int sum=a+b;
    int sub=c-b;
    int mul=a*b*c;
    int div=c/a;
    int mod=a%b;
    System.out.println(sum);
    System.out.println(sub);
    System.out.println(mul);
    System.out.println(div);
    System.out.println(mod);
    System.out.println("----------------------------------------");

    //relational
    System.out.println(a==b);
    System.out.println(a>=b);
    System.out.println(a!=b);
    System.out.println(a<=b);
    System.out.println(a>b);
    System.out.println(a>b);
    System.out.println("----------------------------------------");

    //logical
    System.out.println(a>b && a<c);
    System.out.println(a>b || a<c);
    System.out.println(!(a>b));
    System.out.println("----------------------------------------");

    //bitwise
    int f=-2;
    System.out.println(a&b);
    System.out.println(a|b);
    System.out.println(a^b);
    System.out.println(~a);
    System.out.println(~f);
    System.out.println("----------------------------------------");

    
    //ternary or conditional
    int bo=(a>b)?a:b;
    System.out.println(bo);
    System.out.println("----------------------------------------");

    //left shift and right shift Operator
    System.out.println(a<<b);
    System.out.println(a>>b);
    System.out.println("----------------------------------------");

    //increment and decrement operators
    System.out.println(a); //10
    a=a++;                  // a=10   a++; then a=11;
    System.out.println(a); //10   a=11     
    System.out.println(b); //20
    b=b++;                 //b=20
    System.out.println(b); //20
    int d=a++ + b++;       //10+20=30 a=11 b=21
    System.out.println(d);  //30

    System.out.println(a);  //11
    a=a--;                  //a=11
    System.out.println(a);  //11
    System.out.println(b);  //21
    b=b--;                  //b=21
    System.out.println(b);  //21
    int d1=a-- + b--;       //11+21=32 a=10 b=20
    System.out.println(d1); //32

    System.out.println(a);  //10
    a = ++a;                //a=11
    System.out.println(a);  //11
    System.out.println(b);  //20
    b=++b;                  //b=21
    System.out.println(b);  //21
    int d2=++a + ++b;       //12+22=34 a=12 b=22
    System.out.println(d2); //34

    System.out.println(a);  //12
    a=--a;                  //a=11
    System.out.println(a);  //11
    System.out.println(b);  //22
    b=--b;                  //b=21
    System.out.println(b);  //21
    int d3=--a + --b;       //10+20 a=10 b=20
    System.out.println(d3); //30
    System.out.println("-----------------------------------------------");

    // difference between a=a++ and a++
    System.out.println(a+" "+b);
    a++;
    System.out.println(a);
    b++;
    System.out.println(b);
    System.out.println("-----------------------------------------------");

    System.out.println(a+" "+b);
    a=a++;
    System.out.println(a);
    b=b++;
    System.out.println(b);
    
    // logical AND operator(&&) ------------------------ 
    // Truth table ----------- 
    // T T = T 
    // T F = F  
    // F T = F  
    // F F = F   
    // logical OR operator(||) ------------------------- 
    // Truth table ----------- 
    // T T = T 
    // T F = T 
    // F T = T 
    // F F = F 
    // Logical NOT operator (!)
    // Truth table -----------
    // t=f
    // f=t
 
    // How to convert decimal number to binary number ---------------------------------------------- 
    // decimal number : 10  
     
    // binary number  : 1010 
     
    //   2|10--- 0 
    //   2|5--- 1 
    //   2|2--- 0  ^ 
    //     1    | 
    //   --------------------  
    //   1010 
     
    // How to convert binary number to decimal number -------------------------------------------- 
    // binary number : 1010 
     
    // decimal number : 10  
     
    //   1010 
    //       <---   
    //   0*1 + 1*2 +  0*4 + 1*8 
     
    //   0  + 2 + 0 + 8  
     
    //   10 

//     Post increment/decrement  ------------------------- 
// Rule1: First Take  
 
// Rule2: Then Change  

// Pre increment/decrement  ------------------------- 
// Rule1: First Change 
 
// Rule2: Then Take


  }
}

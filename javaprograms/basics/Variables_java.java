package com.javaprograms.basics;
public class Variables_java {
  //instance variables
  byte idefaultvalue_byte;
    short idefaultvalue_short;
    int idefaultvalue_int;
    long idefaultvalue_long;
    float idefaultvalue_float;
    double idefaultvalue_double;
    char idefaultvalue_char;
    boolean idefaultvalue_boolean;
    int a=10;
    
  //static variables
    static byte sdefaultvalue_byte;
    static short sdefaultvalue_short;
    static int sdefaultvalue_int;
    static long sdefaultvalue_long;
    static float sdefaultvalue_float;
    static double sdefaultvalue_double;
    static char sdefaultvalue_char;
    static boolean sdefaultvalue_boolean;
    static int b=20;
    static int d=10;
  public static void main(String[] args) {
    
    Variables_java oJava=new Variables_java();
    //printing default values for instance variables.
    System.out.println("default for byte instance: "+oJava.idefaultvalue_byte);
    System.out.println("default for short instance: "+oJava.idefaultvalue_short);
    System.out.println("default for int instance: "+oJava.idefaultvalue_int);
    System.out.println("default for long instance: "+oJava.idefaultvalue_long);
    System.out.println("default for float instance: "+oJava.idefaultvalue_float);
    System.out.println("default for double instance: "+oJava.idefaultvalue_double);
    System.out.println("default for char instance: "+oJava.idefaultvalue_char);
    System.out.println("default for boolean instance: "+oJava.idefaultvalue_boolean);

    //printing default values for static variables.
     System.out.println("default for byte static: "+oJava.sdefaultvalue_byte);
     System.out.println("default for short static: "+oJava.sdefaultvalue_short);
     System.out.println("default for int static: "+oJava.sdefaultvalue_int);
     System.out.println("default for long static: "+oJava.sdefaultvalue_long);
     System.out.println("default for float static: "+oJava.sdefaultvalue_float);
     System.out.println("default for double static: "+oJava.sdefaultvalue_double);
     System.out.println("default for char static: "+oJava.sdefaultvalue_char);
     System.out.println("default for boolean static: "+oJava.sdefaultvalue_boolean);

    //printing default values for static variables.
    System.out.println("default for byte static: "+Variables_java.sdefaultvalue_byte);
    System.out.println("default for short static: "+Variables_java.sdefaultvalue_short);
    System.out.println("default for int static: "+Variables_java.sdefaultvalue_int);
    System.out.println("default for long static: "+Variables_java.sdefaultvalue_long);
    System.out.println("default for float static: "+Variables_java.sdefaultvalue_float);
    System.out.println("default for double static: "+Variables_java.sdefaultvalue_double);
    System.out.println("default for char static: "+Variables_java.sdefaultvalue_char);
    System.out.println("default for boolean static: "+Variables_java.sdefaultvalue_boolean);

    //printing default values for static variables.
    System.out.println("default for byte static: "+sdefaultvalue_byte);
    System.out.println("default for short static: "+sdefaultvalue_short);
    System.out.println("default for int static: "+sdefaultvalue_int);
    System.out.println("default for long static: "+sdefaultvalue_long);
    System.out.println("default for float static: "+sdefaultvalue_float);
    System.out.println("default for double static: "+sdefaultvalue_double);
    System.out.println("default for char static: "+sdefaultvalue_char);
    System.out.println("default for boolean static: "+sdefaultvalue_boolean);

    //local variables
    // byte ldefaultvalue_byte;
    // short ldefaultvalue_short;
    // int ldefaultvalue_int;
    // long ldefaultvalue_long;
    // float ldefaultvalue_float;
    // double ldefaultvalue_double;
    // char ldefaultvalue_char;
    // boolean ldefaultvalue_boolean;
    //printing default values for instance variables. complilation error .
    // System.out.println("default for byte local: "+ldefaultvalue_byte);
    // System.out.println("default for short local: "+ldefaultvalue_short);
    // System.out.println("default for int local: "+ldefaultvalue_int);
    // System.out.println("default for long local: "+ldefaultvalue_long);
    // System.out.println("default for float local: "+ldefaultvalue_float);
    // System.out.println("default for double local: "+ldefaultvalue_double);
    // System.out.println("default for char local: "+ldefaultvalue_char);
    // System.out.println("default for boolean local: "+ldefaultvalue_boolean);

    int c=30;
    System.out.println(oJava.a+" "+Variables_java.b+" "+c);
    int d=50;
    System.out.println(d);//local has high prefarence than static.

    //variables are used to store the values.and what kind of values has to be store in the variable is totally depend up on datatype we use.

    //     Based on the position and execution these variables are divided into three types. 
    // 1)Instance variables / Non-static variables  
    // 2)Static variables / Global variables  
    // 3)Local variables / Temperory variables / Automatic variables  
    // 1)Instance variables --------------------- 
    // A value of a variable which is varied(changes) from object to object is called instance variable. 
    // Instance variable will be created at the time of object creation and it will destroy at the time of 
    // object destruction.Hence scope of instance variable is same as scope of an object. 
    // Instance variable store in Heap area as a part of an object. 
    // Instance variable must and should declare immediately after the class but not inside methods, 
    // blocks and constructors. 
    // Instance variable we can access directly from instance area but we can't access directly from 
    // static area. 
    // To access instance variable from static area we need to create object reference.

      //     2)Static variables ------------------ 
      // A value of a variable which is not varied from object to object is called static variable. 
      // A static variable will be created at the time of class loading and it will destroy at the time of class 
      // unloading .Hence scope of static variable is same as scope of .class file. 
      // Static variable will store in method area. 
      // Static variable must and should declare immediately after the class by using static keyword but 
      // not inside methdods,blocks and constructors. 
      // Static variable can access directly from instance area and static area. 
      // Static varible can access by using object reference and classname. 

      //       3)Local variables ------------------ 
      // To meet temperory requirement, programmers will declare some variables inside methods , 
      // blocks and constructors such type of variables are called local variables. 
      // A local variable will be created at the time of execution block and it will destroy when execution 
      // block is executed.Hence scope of local variable is same as scope of execution block where it is 
      // declared. 
      // Local variable will store in java stack memory. 
  }
}

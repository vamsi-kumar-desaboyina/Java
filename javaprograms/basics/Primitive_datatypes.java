package com.javaprograms.basics;
public class Primitive_datatypes {
  public static void main(String[] args) {
    //byte 
    System.out.println(Byte.MAX_VALUE);
    System.out.println(Byte.MIN_VALUE);
    System.out.println(Byte.SIZE);// 1bit = 8 bits
    byte b=10;
    System.out.println(b);
    // b=-129; //or 128
    // System.out.println(b); //java.lang.Error: Unresolved compilation problem: 
    // Type mismatch: cannot convert from int to byte
    System.out.println("-------------------------------");

    //short
    System.out.println(Short.MAX_VALUE);
    System.out.println(Short.MIN_VALUE);
    System.out.println(Short.SIZE);
    short s=1213;
    System.out.println(s);
    // s=1213456;
    // System.out.println(s); //java.lang.Error: Unresolved compilation problem: 
    // Type mismatch: cannot convert from int to byte
    System.out.println("-------------------------------");

    //int
    System.out.println(Integer.MAX_VALUE);
    System.out.println(Integer.MIN_VALUE);
    System.out.println(Integer.SIZE);
    int i=1232321;
    System.out.println(i);
    i='a'; 
    System.out.println(i); // 97  
    //i=12323213343;
    //System.out.println(i);//java.lang.Error: Unresolved compilation problem: 
    //The literal 12323213343 of type int is out of range
    System.out.println("-------------------------------");

    //long
    System.out.println(Long.MAX_VALUE);
    System.out.println(Long.MIN_VALUE);
    System.out.println(Long.SIZE);
    long l=1223432213;
    System.out.println(l);
    l=1223432213223343l;
    System.out.println(l);
    // l=9223372036854775808l;
    // System.out.println(l);//java.lang.Error: Unresolved compilation problem: 
    //The literal 12323213343 of type long is out of range
    System.out.println("-------------------------------");


    //float
    System.out.println(Float.MAX_VALUE);
    System.out.println(Float.MIN_VALUE);
    System.out.println(Float.SIZE);
    Float f=3.14f;
    System.out.println(f);
    f=3.1445454454f;
    System.out.println(f); //3.1445456 o/p
    f=300f;
    System.out.println(f); //300.0 o/p
    //f=12;
    //System.out.println(f);//Unresolved compilation problems: 
    //Type mismatch: cannot convert from int to Float
    //f=1223432213223343l;
    //System.out.println(f);//Unresolved compilation problems: 
    //Type mismatch: cannot convert from long to Float
    // f=3.14;
    // System.out.println(f);//Unresolved compilation problems: 
    //Type mismatch: cannot convert from double to Float
    System.out.println("-------------------------------");

    //double
    System.out.println(Double.MAX_VALUE);
    System.out.println(Double.MIN_VALUE);
    System.out.println(Double.SIZE);
    double d=3.14f;
    System.out.println(d); //o/p 3.140000104904175
    d=3.1445454454f;
    System.out.println(d); 
    d=300f;
    System.out.println(d);
    d=12;
    System.out.println(d);
    d=1223432213223343l;
    System.out.println(d); // o/p 1.223432213223343E15
    d=3.14;
    System.out.println(d); //o/p 3.14
    d=30234.432232343454554545334333434343;
    System.out.println(d); //o/p 30234.432232343454
    System.out.println("-------------------------------");

    //char
    System.out.println(Character.MAX_VALUE);
    System.out.println(Character.MIN_VALUE);
    System.out.println(Character.SIZE);
    char ch='a';
    System.out.println(ch);
    ch='1';
    System.out.println(ch);
    ch=' ';
    System.out.println(ch);
    ch='&';
    System.out.println(ch);
    ch=99;
    System.out.println(ch); // o/p c
    // ch='ss';
    // System.out.println(ch); //java.lang.Error: Unresolved compilation problem: 
    //Invalid character constant
    System.out.println("-------------------------------");

    //boolean
    //System.out.println(Boolean.MAX_VALUE);//java.lang.Error: Unresolved compilation problems: 
    //MAX_VALUE cannot be resolved or is not a field
    //System.out.println(Boolean.MIN_VALUE);//java.lang.Error: Unresolved compilation problems: 
    //MIN_VALUE cannot be resolved or is not a field
    //System.out.println(Boolean.SIZE);//java.lang.Error: Unresolved compilation problems: 
    //SIZE cannot be resolved or is not a field
    boolean bo=true;
    System.out.println(bo);
    //bo=1;
    //System.out.println(bo);//java.lang.Error: Unresolved compilation problems:
    //cannot convert from int to boolean
    //bo='c';
    //System.out.println(bo);//java.lang.Error: Unresolved compilation problems:
    //cannot convert from char to boolean
    //bo="fdss";
    //System.out.println(bo);//java.lang.Error: Unresolved compilation problems:
    //cannot convert from String to boolean
    //bo=TRUE; 
    //System.out.println(bo); // C.T.E  
    System.out.println("-------------------------------");


    

  }
  
}

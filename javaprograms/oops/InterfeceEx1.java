package com.javaprograms.oops;
interface Virat1
{
  void m1();
  int AS=3;
}
interface Virat2
{
  void m1();
  int AS=4;
}
class Virat3 implements Virat1,Virat2
{
  public void m1()
  {
    int a=Virat1.AS;
    int b=Virat2.AS;
    System.out.println(a);
    System.out.println("one");
  }
}


public class InterfeceEx1 {
  public static void main(String[] args) {
    Virat3 obj= new Virat3();
    obj.m1(); 
  }
}

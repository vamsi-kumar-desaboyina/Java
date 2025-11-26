package com.javaprograms.oops;
interface Rohit
{
  void m1();
}
interface Rohit1 extends Rohit
{
  void m2();
}
class Rohit2 implements Rohit1
{
  public void m2()
  {
    System.out.println("one");
  }
  public void m1()
  {
    System.out.println("one");
  }
}
public class InterfaceEx3 {
  public static void main(String[] args) {
    Rohit2 obj=new Rohit2();
    obj.m1();
    obj.m2();
  }
}

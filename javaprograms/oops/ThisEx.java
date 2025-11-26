package com.javaprograms.oops;
class Gayle
{
  int a=100;
  public void m1(int a)
  {
    
    System.out.println(a);
    System.out.println(this.a);
    this.m2();
  }
  public void m2()
  {
    System.out.println("vamso");
  }
}


public class ThisEx {
  public static void main(String[] args) {
    Gayle ong=new Gayle();
    ong.m1(10);
  }
}

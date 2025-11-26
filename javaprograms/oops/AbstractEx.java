package com.javaprograms.oops;
abstract class cha{
  public abstract void m1();
  public static void m2()
  {
    System.out.println("sdfg");
  }
  protected int a=100;
  

}
class cha1 extends cha
{
  public void m1()
  {
    System.out.println("ab");
    System.out.println(a);
  }
}

public class AbstractEx {
  public static void main(String[] args) {
    cha1 obj=new cha1();
    obj.m1();
    obj.m2();
  }
}

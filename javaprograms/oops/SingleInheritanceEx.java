package com.javaprograms.oops;
class Abc{
    public void m1()
    {
      System.out.println("one");
    }
}
class Bcd extends Abc{
  public void m2()
  {
    System.out.println("two");
  }
}
public class SingleInheritanceEx {
  public static void main(String[] args) {
    Abc obj =new Abc();
    obj.m1();
    Bcd obj1=new Bcd();
    obj1.m2();
    obj1.m1();
  }
}

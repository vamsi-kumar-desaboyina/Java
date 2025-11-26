package com.javaprograms.oops;
class Abcd
{
  public void m1()
  {
    System.out.println("one");
  }
}
class Bcde extends Abcd
{
public void m2()
{
  System.out.println("two");
}
}
class Cde extends Bcde
{
  public void m3()
  {
    System.out.println("three");
  }
}

public class MultiInheritanceEx {
  public static void main(String[] args) {
    Abcd obj=new Abcd();
    obj.m1();
    Bcde obj1=new Bcde();
    obj1.m1();
    obj1.m2();
    Cde obj2=new Cde();
    obj2.m1();
    obj2.m2();
    obj2.m3();
    
  }
  }


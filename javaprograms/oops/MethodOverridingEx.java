package com.javaprograms.oops;
class Lalith
{
  public void m1()
  {
    System.out.println("one");
  }
}

class LalithYadav extends Lalith
{
  public void m1()
  {
    System.out.println("two");
  }
}


public class MethodOverridingEx {
  public static void main(String[] args) {
    Lalith obj= new Lalith();
    obj.m1();
    LalithYadav obj1= new LalithYadav();
    obj1.m1();
    Lalith obj2= new LalithYadav();
    obj2.m1();

  }
}

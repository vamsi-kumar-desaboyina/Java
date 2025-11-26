package com.javaprograms.oops;
class VamsiKumar
{
  public void m1()
  {
    System.out.println("one");
  }
  public void m1(int a)
  {
    System.out.println("two");
  }
  public void m1(String s)
  {
    System.out.println("three");
  }
  public void m1(float a)
  {
    System.out.println("four");
  }
  
}

public class MethodOverloadingEx {
  public static void main(String[] args) {
    VamsiKumar obj=new VamsiKumar();
    obj.m1();
    obj.m1(4);
    obj.m1("vamsi");
    obj.m1(6.9f);
    
  }
  
}

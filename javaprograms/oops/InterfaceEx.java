package com.javaprograms.oops;
interface Virat
{
  void m1();

}

class Ab implements Virat
{
  public void m1()
  {
    System.out.println("one");
  }
}

public class InterfaceEx {
  public static void main(String[] args) {
    Ab obj=new Ab();
    obj.m1();
  }
}

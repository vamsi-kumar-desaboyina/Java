package com.javaprograms.oops;
class Parent
{
  int a=100;
}
class child extends Parent
{
  int a=10;
  child(int a)
  {
    System.out.println(a);
    System.out.println(this.a);
    System.out.println(super.a);
  }
}

public class SuperEx {
  public static void main(String[] args) {
    child obj=new child(2);
  }
}

package com.javaprograms.oops;

public class ParameterziedConsEX1
 {
  private int a;
  private float b;

  public  ParameterziedConsEX1(int a,float b)
  {
    this.a=a;
    this.b=b;
  }
  public void getPa()
  {
    System.out.println(a);
    System.out.println(b);
  }
  public static void main(String[] args) {
    ParameterziedConsEX1 obj =new ParameterziedConsEX1(2,4.5f);
    obj.getPa();
  }
}

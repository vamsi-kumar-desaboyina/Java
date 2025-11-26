package com.javaprograms.oops;
class Singleton
{
  static Singleton singleton=null;
  private Singleton()
  {

  }
  public static Singleton getInstance()
  {
      if (singleton==null) {
        singleton=new Singleton();
      }
      return singleton;
  }
}

public class SingletonEx {
  public static void main(String[] args) {
    Singleton obj=Singleton.getInstance();
    Singleton obj1=Singleton.getInstance();
    System.out.println(obj.hashCode());
    System.out.println(obj1.hashCode());
    
  }
}

package com.javaprograms.oops;
class Vamsi
{
  private int eid;
  private String ename;

  public void setEid(int eid)
  {
    this.eid=eid;
  }
  public int getEid()
  {
    return eid;
  }
  public void setEname(String ename)
  {
    this.ename=ename;
  }
  public String getEname()
  {
    return ename;
  }
}

public class EncapsulationEx {
  public static void main(String[] args) {
    Vamsi obj= new Vamsi();
    obj.setEid(4);
    obj.setEname("vamsi");
    System.out.println(obj.getEid());
    System.out.println(obj.getEname());
  }
  
}

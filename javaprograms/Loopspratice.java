package com.javaprograms;
public class Loopspratice {
  public static void main(String[] args) {
    // for(int i=1;i<=4;i++)
    // {
    //   for(int j=1;j<=4;j++)
    //   {
    //     System.out.print(i+" ");
    //   }
    //   System.out.println("");
    // }

    // for(int i=1;i<=4;i++)
    // {
    //   for(int j=1;j<=4;j++)
    //   {
    //     System.out.print(j+" ");
    //   }
    //   System.out.println("");
    // }

    // for(int i=1;i<=4;i++)
    // {
    //   for(int j=1;j<=4;j++)
    //   {
    //     System.out.print("* ");
    //   }
    //   System.out.println("");
    // }

    // for(int i=4;i>=0;i--)
    // {
    //   for(int j=1;j<=4;j++)
    //   {
    //     System.out.print(i+" ");
    //   }
    //   System.out.println("");
    // }

    // for(char i='a';i<='d';i++)
    // {
    //   for(int j=1;j<=4;j++)
    //   {
    //     System.out.print(i+" ");
    //   }
    //   System.out.println("");
    // }

    // for(char i='d';i>='a';i--)
    // {
    //   for(int j=1;j<=4;j++)
    //   {
    //     System.out.print(i+" ");
    //   }
    //   System.out.println("");
    // }

    // for(int i=1;i<=4;i++)
    // {
    //   for(int j=1;j<=4;j++)
    //   {
    //     if ((i==1) ||(j==1) || (i==4) ||(j==4)) {
    //       System.out.print("* ");
    //     }
    //     else
    //     {
    //       System.out.print("  ");
    //     }
        
    //   }
    //   System.out.println("");
    // }

    // for(int i=1;i<=5;i++)
    // {
    //   for(int j=1;j<=5;j++)
    //   {
    //     if (i==j) {
    //       System.out.print("* ");
    //     }
    //     else{
    //       System.out.print("- ");
    //     }
    //   }
    //   System.out.println("");
    // }

    // for(int i=1;i<=5;i++)
    // {
    //   for(int j=1;j<=5;j++)
    //   {
    //     if (i==j ||(i+j)==6) {
    //       System.out.print("* ");
    //     }
    //     else{
    //       System.out.print("- ");
    //     }
    //   }
    //   System.out.println("");
    // }

    // for(int i=1;i<=5;i++)
    // {
    //   for(int j=1;j<=5;j++)
    //   {
    //     if (i==3 || j==3) {
    //       System.out.print("* ");
    //     }
    //     else{
    //       System.out.print("  ");
    //     }
    //   }
    //   System.out.println("");
    // }

    // for(int i=1;i<=3;i++)
    // {
    //   for(int j=1;j<=3;j++)
    //   {
    //     if (i==2 && j==2) {
    //       System.out.print("0 ");
    //     }
    //     else{
    //       System.out.print("1 ");
    //     }
    //   }
    //   System.out.println("");
    // }

    // for(int i=1;i<=4;i++)
    // {
    //   for(int j=1;j<=i;j++)
    //   {
        
    //       System.out.print(i+" ");
        
    //   }
    //   System.out.println("");
    // }

    // for(int i=1;i<=4;i++)
    // {
    //   for(int j=1;j<=i;j++)
    //   {
        
    //       System.out.print(j+" ");
        
    //   }
    //   System.out.println("");
    // }

    // for(int i=1;i<=4;i++)
    // {
    //   for(int j=1;j<=i;j++)
    //   {
        
    //       System.out.print("* ");
        
    //   }
    //   System.out.println("");
    // }

    // for(int i=4;i>=1;i--)
    // {
    //   for(int j=1;j<=i;j++)
    //   {
        
    //       System.out.print(i+" ");
        
    //   }
    //   System.out.println("");
    // }

    // for(int i=1;i<=4;i++)
    // {
    //   for(int j=1;j<=i;j++)
    //   {
        
    //       System.out.print("* ");
        
    //   }
    //   System.out.println("");
    // }
    // for(int i=3;i>=1;i--)
    // {
    //   for(int j=1;j<=i;j++)
    //   {
        
    //       System.out.print("* ");
        
    //   }
    //   System.out.println("");
    // }
    int k=1;
    for(int i=1;i<=4;i++)
    {
      for(int j=1;j<=i;j++)
      {
        if (k<=9) {
          System.out.print(k+" ");
          k++; 
        }
        else{
          System.out.print("0 ");
        }
      }
      System.out.println("");
    }
  }
}

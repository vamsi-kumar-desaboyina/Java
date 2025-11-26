package com.javaprograms.basics;
import java.util.*;;
public class Selection_Statement_Switchcase {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    //   switch(condition/expression) 
//  { 
//   case val1:  
//     //code to be execute 
//     break stmt; 
//   case val2:  
//     //code to be execute 
//     break stmt; 
//   - 
//   - 
//   default: 
//     //code to be execute if all cases are false. 
//  }
// Declaration of break statement in switch case is optional. 
// If we won't defined break statement then from where our condition is satisfied from there all 
// cases will be executed that state is called fall through state of switch case.
   
// The allowed datatype of switch case are byte,short,int ,char and String. 
// If we take other datatypes then we will get compile time error.

//Q)Write a java program to check given alphabet is a vowel or consonent?
//  System.out.println("Enter: ");
//     char ch=scanner.next().charAt(0);
//     switch (ch) {
//       case 'a':
//         System.out.println("vowel "+ch);
//         break;
//         case 'e':
//         System.out.println("vowel "+ch);
//         break;
//         case 'i':
//         System.out.println("vowel "+ch);
//         break;
//         case 'o':
//         System.out.println("vowel "+ch);
//         break;
//         case 'u':
//         System.out.println("vowel "+ch);
//         break;
    
//       default:
//       System.out.println("consonent "+ch);
//         break;
//     }

// System.out.println("Enter: ");
//     char ch=scanner.next().charAt(0);
//     switch (ch) {
//       default:
//       System.out.println("consonent "+ch);
//       case 'a':
//         System.out.println("vowel "+ch);
//       break;
//         case 'e':
//         System.out.println("vowel "+ch);
//         break;
//         case 'i':
//         System.out.println("vowel "+ch);
//         break;
//         case 'o':
//         System.out.println("vowel "+ch);
//         break;
//         case 'u':
//         System.out.println("vowel "+ch);
//         break;
    
      
     
//     }

System.out.println("Enter: ");
    char ch=scanner.next().charAt(0);
    switch (ch) {
      
      case 'a':
        System.out.println("vowel "+ch);
      
        case 'e':
        System.out.println("vowel "+ch);
        break;
        case 'i':
        System.out.println("vowel "+ch);
        break;
        case 'o':
        System.out.println("vowel "+ch);
        break;
        case 'u':
        System.out.println("vowel "+ch);
        break;
        default:
      System.out.println("consonent "+ch);
    
      
     
    }

    scanner.close();
  }
}

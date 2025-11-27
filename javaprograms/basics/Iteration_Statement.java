package com.javaprograms.basics;
import java.util.*;

public class Iteration_Statement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        

        System.out.println("\n--- WHILE LOOP EXAMPLE ---");
        // While loop → Executes only when condition is true
        int i = 1;
        while (i <= n) {
            System.out.println("While Loop Value: " + i);
            i++;
        }

        System.out.println("\n--- DO WHILE LOOP EXAMPLE ---");
        // Do-while loop → Executes at least once even if condition is false
        int j = 1;
        do {
            System.out.println("Do-While Loop Value: " + j);
            j++;
        } while (j <= n);

        System.out.println("\n--- FOR LOOP EXAMPLE ---");
        // For loop → Used when number of iterations is known
        for (int k = 1; k <= n; k++) {
            System.out.println("For Loop Value: " + k);
        }

        
    }
}

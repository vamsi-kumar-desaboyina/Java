package com.javaprograms;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		boolean b = false;

		if (n % 4 == 0) {
			b = true;
			if (n % 100 == 0) {
				b = true;
				if (n % 400 == 0) {
					b = true;

				} else {
					b = false;
				}

			} else {
				b = true;
			}

		} else {
			b = false;
		}
		System.out.println(n + " is a leap year " + b);
	}

}

// exactly divisible by 4 and 100(centurey) and 400
// or
// divisible by 4 and not divisible by 100

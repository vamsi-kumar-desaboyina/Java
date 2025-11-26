package com.javaprograms;

import java.util.Scanner;

public class PrimeOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number: ");
		int n = sc.nextInt();
		if(n<2) {
			System.out.println("not prime "+ n);
			return;
		}
		boolean b = true;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				b = false;
				break;
			}
		}
		if (b == true)
			System.out.println("prime " + n);

		else
			System.out.println("not prime " + n);
	}

}

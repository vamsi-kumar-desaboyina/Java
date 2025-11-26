package com.javaprograms;

import java.util.Scanner;

public class Lcm {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number: ");
		int n = sc.nextInt();
		System.out.println("enter the number: ");
		int n1 = sc.nextInt();
		int gcd = 0;
		int min = (int) Math.min(n1, n);
		for (int i = 1; i <= min; i++) {
			if (n % i == 0 && n1 % i == 0) {
				gcd = i;
			}
		}
		int lcm=(n*n1)/gcd;
		System.out.println("gcd of two numbers " + gcd);
		System.out.println("lcm of two numbers " + lcm);
	}

}


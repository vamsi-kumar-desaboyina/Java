package com.javaprograms.arrays;

import java.util.Scanner;

public class ArrayPratice {
	public static void main(String[] args) {
		// Scanner sc= new Scanner(System.in);
		// System.out.println("enter the numner: ");
		// int n=sc.nextInt();
		// int[] arr= new int[n];
		// for(int i=0;i<=arr.length-1;i++)
		// {
		// System.out.println("enter the numner: ");
		// arr[i]=sc.nextInt();
		// }
		// for (int ele : arr) {
		// System.out.print(ele+" ");
		// }


		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int sum = 0;
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = 0; j <= arr.length - 1; j++) {

				sum = sum + arr[i][j];

			}

		}
		System.out.println(sum);

	}
}

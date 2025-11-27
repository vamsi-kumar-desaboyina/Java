package com.javaprograms.arrays;

public class ArrayNotUseSortMethod {
	public static void main(String[] args) {
		int[] arr = { 4, 7, 1, 3, 9, 6 ,0,-2,33,22};
		for (int i = 0; i < arr.length; i++) {
			boolean swap = false;
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
					swap = true;
				}

			}
			if (!swap)
				break;
		}

		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.println(arr[i]);
		}
	}
}

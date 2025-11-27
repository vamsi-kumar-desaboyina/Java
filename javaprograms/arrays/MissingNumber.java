package com.javaprograms.arrays;

public class MissingNumber {
	public static void main(String[] args) {
		 int[] arr={5,1,3,2,6,7};
	     int[] narr= new int[arr.length+1];
	     int l=narr.length;
	     int sum=0;
	     for (int i : arr) {
	       sum=sum+i;
	     }
	     int preres=(l*(l+1))/2;
	     int res=preres-sum;
	     System.out.println(res);
	}
}

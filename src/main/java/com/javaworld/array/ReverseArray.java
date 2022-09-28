package com.javaworld.array;

public class ReverseArray {

	static void reverseInt(int a[]) {
		
		int start=0, end=a.length-1;
		while(start<end) {
			a[start] ^=a[end];
			a[end] ^= a[start];
			a[start] ^=a[end];
			start++;
			end--;
		}
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args) {

		int[] a= {2,5,7,8,12,34};
		reverseInt(a);
	}

}

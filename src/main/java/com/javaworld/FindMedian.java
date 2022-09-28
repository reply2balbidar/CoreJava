package com.javaworld;

import java.util.Arrays;

public class FindMedian {

	static int findmedian(int a[], int n) {
		Arrays.sort(a);
		
		if(n%2 != 0) {
			return a[n/2];
		}
		return (a[(n-1)/2]+ a[n/2])/2;
	}
	public static void main(String[] args) {

		int a[]= {1,2,3,5,8,9,6,4};
		int n=findmedian(a, a.length);
		System.out.println(n);
	}

}

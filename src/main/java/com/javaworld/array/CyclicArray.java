package com.javaworld.array;

import java.util.Arrays;

public class CyclicArray {

	static void rotate(int a[]) {
		int i=0,j=a.length-1;
		while(i !=j) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
			}
		
	}
	public static void main(String[] args) {

		int [] a= {2,3,4,5,6,7,8};
		rotate(a);
		System.out.println(Arrays.toString(a));
	}

}

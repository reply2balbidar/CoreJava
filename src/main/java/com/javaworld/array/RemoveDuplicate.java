package com.javaworld.array;

public class RemoveDuplicate {

	static int removeDuplicate(int[] a,int n) {
		int[] b=new int[n];
		int c=0;
		for(int i=0; i<n-1; i++) {
			if(a[i] !=a[i+1])
			b[c++]=a[i];
		}
		b[c++]=a[n-1];
		for(int i=0; i<c; i++) {
			a[i]=b[i];
		}
		return c;
	}
	public static void main(String[] args) {

		int [] a= {2,3,3,4,5,5,6,7,8,8,9};
		int n=removeDuplicate(a,a.length);
		 for (int i = 0; i < n; i++)
	         System.out.print(a[i] + " ");
		}
}

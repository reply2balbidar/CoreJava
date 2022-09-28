package com.javaworld.array;

public class KThElementFind {

	private static void kThElementFindUnsortedArray(int[] a, int k){
	
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			if(k-1==i) {
				System.out.println(a[i]);
			}
		}
	}
	private static int kThElementFindSortedArray(int[] a, int k){
		
		return a[k-1];
		
	}
	public static void main(String[] args) {

		int [] a= {7,8,9,2,19,21,5,23};
		int arr[] ={3, 5, 7, 12, 19 };
        int K = 2;
		kThElementFindUnsortedArray(a, 3);
		System.out.println(kThElementFindSortedArray(arr, K));
		int min=a[0];
	 for(int i=0; i<a.length; i++) {
		 if(min>a[i]) {
			 min=a[i];
			 
		 }
	 }
	 System.out.println(min);	
	}

}

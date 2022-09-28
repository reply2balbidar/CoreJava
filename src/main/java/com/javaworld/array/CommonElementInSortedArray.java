package com.javaworld.array;

public class CommonElementInSortedArray {

	private static void commonELemntInSortedArray(int[] a1,int a2[], int []a3) {
		int x = 0,y = 0,z = 0;
		while(x<a1.length && y<a2.length && z<a3.length) {
			if(a1[x]==a2[y] && a2[y]==a3[z]) {
				System.out.print(a1[x] +" ");
				x++;
				y++;
				z++;
			}else if(a1[x]<a2[y]) {
				x++;
			}
			
			else if(a2[y]<a3[z]) {
				y++;
			}else {
				z++;
			}
		}
	}
	public static void main(String[] args) {
		
		int a1[]= {2,3,4,6,8};
		int a2[]= {1,5,6,8,9};
		int a3[]= {3,7,8,10,12};
		System.out.println();
		commonELemntInSortedArray(a1, a2, a3);
	}
}

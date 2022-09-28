package com.javaworld.array;

import java.util.ArrayList;

public class MovePositiveAndNegativeNumber {

	private static int [] moveNegAndPosNumber(int a[]) {
		ArrayList<Integer> postList=new ArrayList<>();
		ArrayList<Integer> NegList=new ArrayList<>();
		for(int i=0; i< a.length; i++) {
			if(a[i]>0) {
				postList.add(a[i]);
			}
			else {
				NegList.add(a[i]);
			}
		}
		int psize=postList.size();
		int nsize=NegList.size();
		int s=0;
		for(int i=0; i<psize; i++) {
			a[s]=postList.get(i);
			s++;
		}
		for(int i=0; i<nsize; i++) {
			a[s]=NegList.get(i);
			s++;
		}
		return a;
	}
	
	public static void main(String[] args) {

		int[] a= {3,6,9,-2,1,-5,-7,4};
		moveNegAndPosNumber(a);
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}

}

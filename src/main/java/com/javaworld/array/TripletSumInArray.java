package com.javaworld.array;

import java.util.Arrays;

public class TripletSumInArray {

	  public static boolean find3Numbers(int A[], int n, int X) { 
		   
	      boolean ans = false;
	      Arrays.sort(A);
	      for(int i=0; i<A.length; i++){
	          int j = i+1;
	          int k = n-1;
	          while(j<k){
	              if(A[i]+A[j]+A[k]==X){
	                  ans = true;
	                  return ans;
	              }
	              else if(A[i]+A[j]+A[k] > X){
	                  k--;
	              }
	              else{
	                  j++;
	              }
	          }
	      }
	       return ans;
	   }
	  
	  public static void main(String[] args) {
		int a[] = {1, 4, 45, 6, 10, 8};
		boolean i=find3Numbers(a, a.length, 13);
		if(i) {
			System.out.println(i);
		}
	}
}


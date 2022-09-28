package com.javaworld.array;

import java.util.Arrays;

public class ArraySubsetOfanotherArray {

	  static String isSubset( long a1[], long a2[], long n, long m) {
		    if(m>n){
		        return "No";
		    }
		    Arrays.sort(a1);
		    Arrays.sort(a2);
		    for(int i=0;i<m;i++)
		    {
		        int j = 0;
		        while(j<n){
		            if(a1[j] == a2[i])
		            {
		                break;
		            }
		            else{
		                j++;
		            }
		        }
		        if(j==n)
		        {
		            return "No";
		        }
		    }
		    
		    return "Yes";
		        
		    }
	public static void main(String[] args) {

	long	a1[] = {1, 2, 3, 4, 5, 6};
	long	a2[] = {1, 2, 4};
	String s=isSubset(a1, a2, a1.length, a2.length);
	System.out.println(s);
		
	}

}

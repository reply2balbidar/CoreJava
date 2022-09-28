package com.javaworld.array;

public class ReverseString {

	static void reverseString(String str) {
		
		char[] c=str.toCharArray();
		int start=0, end=c.length-1;
		while(start<end) {
			c[start] ^=c[end];
			c[end] ^=c[start];
			c[start] ^=c[end];
			start++;
			end--;
		}
		for(int i=0; i<c.length; i++) {
			System.out.println(c[i]);
		}
	}
	public static void main(String[] args) {

		String str="balbindar";
		reverseString(str);
	}

}

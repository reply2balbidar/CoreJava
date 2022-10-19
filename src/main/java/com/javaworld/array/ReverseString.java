package com.javaworld.array;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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
		
		int len = str.length();
        IntStream.range(0, len)
                .map(i -> len - 1 - i)
                .mapToObj(j->str.charAt(j))
                .forEach(System.out::print);
       
        String revWord= Stream.of(str).map(word -> new StringBuilder(word).reverse())
        .collect(Collectors.joining(" "));
       System.out.println("\n" +revWord);
	}

}

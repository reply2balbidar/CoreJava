package com.javaworld;

import java.util.HashMap;
import java.util.Map;

public class CharaterOccurenceInString {

	public static void main(String[] args) {

		String str="balbindar";
		characterCount(str);
	}

	private static void characterCount(String str) {

		HashMap<Character, Integer> hashMap=new HashMap<>();
		char[] ch= str.toCharArray();
		for(char c:ch) {
			if(hashMap.containsKey(c)) {
				hashMap.put(c, hashMap.get(c)+1);
			}else {
				hashMap.put(c, 1);
			}
	    }
		System.out.println(hashMap);
		for(Map.Entry<Character, Integer> entry: hashMap.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey());
			}
		}
	}
}

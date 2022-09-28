package com.javaworld.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Anagram {

	 static boolean isAnagram(String a, String b) {
	        char[] ch1=a.toCharArray();
	        char[] ch2=b.toCharArray();
	        Arrays.sort(ch1);
	        Arrays.sort(ch2);
	       
	        return Arrays.equals(ch1, ch2);
	    }
	 static void findMaximumOccurring(String str){
		 int maximumCount =0;
		 HashMap<Character, Integer> characterCountMap = new HashMap<>();
		 for (int i = 0; i <str.length() ; i++) {
		 char c = str.charAt(i);
		 if(characterCountMap.containsKey(c)){
		 int count = characterCountMap.get(c);
		 count++;
		 if(maximumCount<count)
		 maximumCount++;
		 characterCountMap.put(c, count);
		 }else{
		 characterCountMap.put(c, 1);
		 }
		 }
		  
		 Set<Character> set = characterCountMap.keySet();
		 Iterator<Character> iterator = set.iterator();
		 while(iterator.hasNext()){
		 char key = iterator.next();
		 //check count
		 if(characterCountMap.get(key)==maximumCount){
		 System.out.println("Character: " + key + " has occurred maximum times in String:  " +  maximumCount);
		 }
		 }
		 }
	 static char countChar(String str) {
		 
			HashMap<Character, Integer> characterCountMap = new HashMap<>();
			for (int i = 0; i <str.length() ; i++) {
			char c = str.charAt(i);
			if(characterCountMap.containsKey(c)){
			characterCountMap.put(c, characterCountMap.get(c)+1);
			}else{
			characterCountMap.put(c, 1);
			}
			}
			System.out.println(characterCountMap);
			for (int i = 0; i <str.length() ; i++) {
				char c = str.charAt(i);
				if(characterCountMap.get(c)==1) {
					return c;
				}
				System.out.println(characterCountMap);
			}
			throw new RuntimeException("Undefined behaviour");
	 }
	public static void main(String[] args) {
		
		String str="i am java developer";
		System.out.println(countChar(str));
		
		String str1 = "java2blog tutorial";
		System.out.println("String 1: " + str1);
		findMaximumOccurring(str1);
	}

}

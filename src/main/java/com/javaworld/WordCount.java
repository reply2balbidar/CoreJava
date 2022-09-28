package com.javaworld;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class WordCount {

	public static void main(String[] args) {

		Map<Integer, String> wordsByKey = new HashMap<>();
		wordsByKey.put(1, "one");
		wordsByKey.put(2, "two");
		wordsByKey.put(3, "three");
		wordsByKey.put(4, "four");
		
		 StringBuilder str1 = new StringBuilder("{");
		    for (Integer key : wordsByKey.keySet()) {
		    	str1.append(key + "=" + wordsByKey.get(key) + ", ");
		    }
		    str1.delete(str1.length()-2, str1.length()).append("}");
		    System.out.println(str1.toString());
		
		   
		Map<String, String> map = Arrays.stream(str1.toString().split(","))
			      .map(entry -> entry.split("="))
			      .collect(Collectors.toMap(entry -> entry[0], entry -> entry[1]));
		System.out.println(map);
		
		String str = map.keySet().stream()
			      .map(key -> key + "=" + map.get(key))
			      .collect(Collectors.joining(", ", "{", "}"));
		System.out.println(str);
}
}

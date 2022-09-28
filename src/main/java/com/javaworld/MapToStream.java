package com.javaworld;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class MapToStream {
   static Map<String, Integer> getmap(String str){
	   
	   Map<String, Integer> map=Arrays.stream(str.split(" "))
			                               .collect(Collectors.toMap(value-> value, value->value.length()));
	return map;
	   
   }
	public static void main(String[] args) {

		String str="He is a developer";
		System.out.println(getmap(str));
	}

}

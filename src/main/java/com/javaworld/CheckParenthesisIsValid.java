package com.javaworld;

import java.util.ArrayDeque;
import java.util.Deque;

public class CheckParenthesisIsValid {
	
	private static boolean isValidParenthesis(String str) {
		Deque<Character> stack
        = new ArrayDeque<Character>();
		
		for(int i=0; i<str.length(); i++) {
			char ch=str.charAt(i);
			if(ch=='(' || ch=='{' || ch == '[') {
				stack.add(ch);
				continue;
			}
			char check;
			switch(ch) {
			case ')':
				check=stack.pop();
				if(check=='{' && check=='[') 
					return false;
				break;
			case '}':
				check=stack.pop();
				if(check=='(' && check=='[') 
					return false;
				break;
			case ']':
				check=stack.pop();
				if(check=='(' || check=='{') 
					return false;
				break;
			}
		}
		return (stack.isEmpty());
	}

	public static void main(String[] args) {

		String str="([{}])";
		if(isValidParenthesis(str))
			System.out.println("balanced");
	}

}

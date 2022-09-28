package com.javaworld;

import java.util.ArrayList;

public class StackUsingArrayList {

	private  ArrayList<String> stack=new ArrayList<>();
	
	@Override
	public String toString() {
		return "StackUsingArrayList [stack=" + stack + "]";
	}
    public void push(String element) {
    	stack.add(element);
    	
    }
    public String pop() {
    	if(stack.isEmpty()) {
    		return null;
    	}
    	String top=stack.get(stack.size()-1);
		stack.remove(stack.size()-1);
		return top;
    }
    public String peek() {
    	
    	if(stack.isEmpty()) {
    		return null;
    	}
		return stack.get(stack.size()-1);
    	
    }
    public int size() {
		return stack.size();
    	
    }
    public boolean isEmpty() {
    	
		return stack.isEmpty();
    	
    }

	public static void main(String[] args) {

		StackUsingArrayList stack = new StackUsingArrayList();
		System.out.println("Is Stack Empty:"+stack.isEmpty());
		stack.push("Gyan");
		stack.push("Vivek");
		stack.push("Rochit");
		stack.push("Panda");
		System.out.println("Is Stack Empty:"+stack.isEmpty());
		System.out.println(stack);
		System.out.println("Stack Size:"+stack.size());
		System.out.println("Peek Top Element:"+stack.peek());
		System.out.println("After peek:"+stack);
		System.out.println("Pop Top Element:"+stack.pop());
		System.out.println("After pop:"+stack);
		System.out.println("Stack Size now:"+stack.size());
	}

}

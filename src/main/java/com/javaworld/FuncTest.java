package com.javaworld;

@FunctionalInterface
public interface FuncTest {

	void say();
	
	int hashCode();  
    String toString();  
    boolean equals(Object obj);  
	
}

interface Ninterface extends FuncTest{
	void say();
	
}

class FunctionalInterfaceExample2 implements Ninterface {

	@Override
	public void say() {
     System.out.println("hello");		
	}
	public static void main(String[] args) {
		FunctionalInterfaceExample2 f=new FunctionalInterfaceExample2();
		f.say();
	}
}
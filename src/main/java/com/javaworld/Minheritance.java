package com.javaworld;

class Tree{
	void leave() {
		System.out.println("l");
	}
}
class MangoTree extends Tree{
	void fruit() {
		System.out.println("m");
	}
}
public class Minheritance {

	public static void main(String[] args) {

		Tree t=new MangoTree();
		t.leave();
	
	}

}

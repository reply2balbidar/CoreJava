package com.javaworld;

import java.util.HashSet;

public class LinkedList {

	static Node head;
	
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			next=null;
		}
	}
	public static void push(int new_data) {
		Node new_node=new Node(new_data);
		new_node.next=head;
		head=new_node;
	}
	static boolean detectLoop(Node node) {
		HashSet<Node> set=new HashSet<>();
		while(node !=null) {
			if(set.contains(node)) 
				return true;
			set.add(node);
			node=node.next;
		}
		return false;
	}
	public static void main(String[] args) {

		LinkedList.push(15);
		LinkedList.push(10);
		LinkedList.push(5);
		LinkedList.push(20);
		
		LinkedList.head.next.next.next.next=LinkedList.head;
		if(detectLoop(head)) {
			System.out.println("loop found");
		}else {
				System.out.println("loop Not Found");
			}
		System.out.println(detectLoop(head));
		}
		

}

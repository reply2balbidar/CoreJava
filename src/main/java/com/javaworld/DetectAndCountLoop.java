package com.javaworld;

public class DetectAndCountLoop {

	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			next=null;
		}
	}
	static int countNodes(Node  node) {
		int res = 1;
        Node temp = node;
        while (temp.next != node)
        {
            res++;
            temp = temp.next;
        }
        return res;
	}
	static int countNodesinLoop( Node list)
    {
        Node slow_p = list,
             fast_p = list;
 
        while (slow_p !=null &&
               fast_p!=null &&
               fast_p.next!=null)
        {
            slow_p = slow_p.next;
            fast_p = fast_p.next.next;
 
            if (slow_p == fast_p)
                return countNodes(slow_p);
        }
 
        return 0;
    }
	public static void main(String[] args) {
		Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
 
        // Create a loop for testing
        head.next.next.next.next.next = head.next;
 
        System.out.println( countNodesinLoop(head));
		
	}

}

package com.java.linkedlist;

public class DeleteNodeWithoutHead {
	
	public static Node deleteNode(Node node) {
		
		Node temp = null;
		
		if(node.next!=null)
		{
			temp = node.next.next;
			node.next.next = null;
		}
		
		
		if(node.next!=null)
		{
			Node val = node;
			node = node.next;
			node.next = val;
		}
		
		node.next = null;
		node.next = temp;
		
		return node;
			
	}
	
	public static void main(String[] args) {
		
		Node head = new Node(3);
		head.next = new Node(4);
		head.next.next = new Node(5);
		head.next.next.next = new Node(11);
		head.next.next.next.next = new Node(8);
		
		Node node = head.next.next;
		
	    head.next.next = deleteNode(node);
		
		while(head!=null)
		{
			System.out.print(head.data + " ");
			head = head.next;
		}		
			
	}

}

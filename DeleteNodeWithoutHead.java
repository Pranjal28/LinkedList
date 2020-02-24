package com.java.linkedlist;

public class DeleteNodeWithoutHead {
	
	public static Node deleteNode(Node node) {
		
		
		if(node.next!=null)
		{
			Node temp = node;
			node = node.next;
			node.next = temp;			
		}
		
		node.next = null;
		return node;
	}
	
	public static void main(String[] args) {
		
		Node head = new Node(3);
		head.next = new Node(4);
		head.next.next = new Node(5);
		head.next.next.next = new Node(11);
		
		Node node = head.next.next;
		
		head.next.next = deleteNode(node);
		
		while(head!=null)
		{
			System.out.print(head.data + " ");
			head = head.next;
		}		
			
	}

}

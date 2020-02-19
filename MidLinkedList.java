package com.java.linkedlist;

public class MidLinkedList {
	
	public void findMiddle(Node head)
	{
		Node fastPtr = head, slowPtr = head;
		
		while(fastPtr!=null && slowPtr!=null
				&& fastPtr.next != null && slowPtr.next != null)
		{
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;
		}
		
		System.out.println("Middle element of linked list is " + slowPtr.data);
	}
	
	public static void main(String[] args) {
		
		Node head = new Node(3);
		head.next = new Node(4);
		head.next.next = new Node(5);
		head.next.next.next = new Node(6);
		head.next.next.next.next = new Node(7);
		head.next.next.next.next.next = new Node(8);
		
		
		MidLinkedList midLinkedList = new MidLinkedList();
		midLinkedList.findMiddle(head);
	}

}

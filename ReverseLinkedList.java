package com.java.linkedlist;

public class ReverseLinkedList {
	
	public static Node reverseList(Node head)
	{
		Node current = head, prev = null, next= null;
		while(current!=null)
		{
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		
		head = prev;
		return head;
	}

	public static void main(String[] args) {

		Node head = new Node(3);
		head.next = new Node(4);
		head.next.next = new Node(5);
		head.next.next.next = new Node(11);
		head.next.next.next.next = new Node(7);
		head.next.next.next.next.next = new Node(8);
		
		Node start = reverseList(head);
		
		while(start!=null)
		{
			System.out.print(start.data + " ");
			start = start.next;
		}
	}
}

package com.java.linkedlist;

public class DeleteMiddle {
	
	public static Node findMiddle(Node head)
	{
		Node fastPtr = head, slowPtr = head, midPtr = head;
		
		int flag = 0;
		
		while(slowPtr!=null && fastPtr!= null && midPtr != null && slowPtr.next != null
				&& fastPtr.next != null && midPtr.next != null)
		{
			slowPtr = slowPtr.next;
			if(flag>=1)
				midPtr = midPtr.next;
			fastPtr = fastPtr.next.next;
			flag++;
		}
		
		return midPtr;
	}
	
	public static void main(String[] args) {

		Node head = new Node(3);
		head.next = new Node(4);
		head.next.next = new Node(5);
		head.next.next.next = new Node(11);
		head.next.next.next.next = new Node(7);
		head.next.next.next.next.next = new Node(8);
		
		Node startNode = head;
		
		Node start = findMiddle(head);
		
		System.out.println(start.data);
		
		while(head.next!=null)
		{
			if(head==start)
			{
				head.next = start.next.next;
				start = null;
			}
			
			head = head.next;			
		}
		
		while(startNode!=null)
		{
			System.out.print(startNode.data + " ");
			startNode = startNode.next;
		}
	}

}

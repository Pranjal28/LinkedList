package com.java.linkedlist;

class DoubleNode
{
	DoubleNode prev;
	DoubleNode next;
	int data;
	
	public DoubleNode(int value)
	{
		prev = null;
		next = null;
		data = value;
	}
}

public class DoublyLinkedList {
	
	public static void printLinkedList(DoubleNode head)
	{
		while(head!=null)
		{
			System.out.print(head.data + " ");
			head = head.next;
		}
	}
	
	public static DoubleNode deleteNode(DoubleNode head, int data)
	{
		
		DoubleNode start = null;
		
		while(head.next!=null)
		{
			 start = head;
			if(head.next.data == data)
			{
				DoubleNode temp = head.next;
				head.next = head.next.next;
				head.next.prev = head;
				temp = null;
			}
			
			head = head.next;
		}
		return start;
	}
	
	public static void main(String[] args) {
		
		DoubleNode head = new DoubleNode(3);
		head.prev = null;
		head.next = new DoubleNode(4);
		head.next.prev = head;
		head.next.next = new DoubleNode(2);
		head.next.next.prev = head.next;
		
		printLinkedList(head);
		DoubleNode node = deleteNode(head, 4);
		
		System.out.println();
		
		while(node!=null)
		{
			System.out.print(node.data + " ");
			node = node.next;
		}
		
		
		
	}

}

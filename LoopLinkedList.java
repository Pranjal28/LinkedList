package com.java.linkedlist;

public class LoopLinkedList {

	public void startOfLoop(Node head, Node fastPtr, Node slowPtr) {
		while (fastPtr != null && slowPtr != null && fastPtr.next != null && slowPtr.next != null) {
			fastPtr = fastPtr.next;
			slowPtr = slowPtr.next;

			if (fastPtr == slowPtr) {
				System.out.println("Starting point of loop is " + slowPtr.data);
	
				
				removeLoop(head,slowPtr);
				break;
			}
		}
	}

	public void removeLoop(Node start, Node fastPtr) {

		Node head = fastPtr;
		while (head != null) {
			if (head.next == fastPtr) {
				head.next = null;
				break;
			}

			head = head.next;
		}
		
		System.out.println("Linked List after Loop removed"); 
		
		while(start!=null)
		{
			System.out.print(start.data+ " ");
			start = start.next;
		}
		
		System.out.println();

		

	}

	public boolean findAndRemoveLoop(Node head) {
		Node fastPtr = head, slowPtr = head;

		int flag = 0;

		while (fastPtr != null && slowPtr != null && fastPtr.next != null && slowPtr.next != null) {
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;

			if (fastPtr == slowPtr) {
				flag = 1;
				break;
			}
		}

		if (flag == 1) {
			slowPtr = head;
			startOfLoop(head, fastPtr, slowPtr);

		}

		if (flag == 1)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {

		Node head = new Node(3);
		head.next = new Node(4);
		head.next.next = new Node(5);
		head.next.next.next = new Node(11);
		head.next.next.next.next = new Node(7);
		head.next.next.next.next.next = new Node(8);

		head.next.next.next.next.next.next = head.next.next.next;

		LoopLinkedList loopLinkedList = new LoopLinkedList();
		boolean isLoop = loopLinkedList.findAndRemoveLoop(head);

		if (isLoop)
			System.out.println("Loop exists");
		else
			System.out.println("Loop does not exist");
	}

}

package com.java.linkedlist;

public class SumLinkedList {
	
	public static int calculateLinkedList(Node head)
	{
		int sum=0, d;
		
		while(head!=null)
		{
			d = head.data%10;
			sum =(sum*10) + d;
			head = head.next;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		
		Node head1 = new Node(3);
		head1.next = new Node(4);
		
		int sum1 = calculateLinkedList(head1);
		
		Node head2 = new Node(3);
		head2.next = new Node(9);
		head2.next.next = new Node(6);
		head2.next.next.next = new Node(7);
		
		int sum2 = calculateLinkedList(head2);
		
		int sum = sum1 + sum2;
		int d;
		
		Node head = new Node(sum%10);
		sum = sum/10;
		Node start = head;
		
		while(sum>0)
		{
			d = sum%10;		
			Node node = new Node(d);
			start.next = node;
		    start = start.next;
			sum = sum/10;			
		}
		
		Node startNode = ReverseLinkedList.reverseList(head);
		
		while(startNode!=null)
		{
			System.out.print(startNode.data + " ");
			startNode = startNode.next;
		}
				
	}
	

}

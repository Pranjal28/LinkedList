package com.java.linkedlist;

import java.util.LinkedList;

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
		
		int sum2 = calculateLinkedList(head2);
		
		int sum = sum1 + sum2;
		
		int d;
		
		Node head=new Node(sum%10);
		Node start = head;
		sum = sum/10;
		head.next = null;
		head = head.next;
				
		while(sum>0)
		{
			d = sum%10;
			System.out.println("hello");
			if(head==null)
				head = new Node(d);
			System.out.println(head.data);
			head.next = null;
			head = head.next;
			sum = sum/10;
				
		}
		
		while(start!=null)
		{
			System.out.println(start.data);
			start = start.next;
		}
		
		
		
//		int rev=0,d, count=0;
//		
//		while(sum>0)
//		{
//			d = sum%10;
//			rev = (rev*10)  + d;
//			sum = sum/10;
//			count++;
//		}
//		
//		System.out.println(list);
		
		
	}
	

}

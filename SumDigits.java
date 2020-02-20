package com.java.linkedlist;

public class SumDigits {
	
	public static int calculateLength(Node head)
	{
		int count=0;
		
		while(head!=null)
		{
			count++;
			head=head.next;
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		
		Node head1 = new Node(3);
		head1.next = new Node(9);
		head1.next.next = new Node(6);
		head1.next.next.next = new Node(7);
		
		int length1 = calculateLength(head1);
		
		Node head2 = new Node(3);
		head2.next = new Node(4);
		head2.next.next = new Node(3);
		
		int length2 = calculateLength(head2);
		
		int diff1=0,diff2=0,val=0;
		
		if(length1>length2)
			diff1 = length1 - length2;
		if(length2>length1)
			diff2 = length2 - length1;
		
		while(val<diff1)
		{
			Node temp = new Node(0);
			temp.next = head2;
			head2=temp;
			val++;
		}
		
		val = 0;
		
		while(val<diff2)
		{
			Node temp = new Node(0);
			temp.next = head1;
			head1=temp;
			val++;
		}
		
		
		Node rev1 = ReverseLinkedList.reverseList(head1);
		Node rev2 = ReverseLinkedList.reverseList(head2);
		
		int d = (rev1.data + rev2.data)%10;
		int carry = (rev1.data + rev2.data)/10;
		rev1 = rev1.next;
		rev2 = rev2.next;
		
		Node start1 = new Node(d);
		
		while(rev1 != null && rev2 != null)
		{
			d = (rev1.data + rev2.data+carry)%10;
			carry = (rev1.data + rev2.data+carry)/10; 
			Node node = new Node(d);
			node.next = start1;
			start1 = node;
			rev1 = rev1.next;
			rev2 = rev2.next;
		}
		
		
		
		
		while(start1!=null)
		{
			System.out.print(start1.data + " ");
			start1=start1.next;
		}
		
				
				
	}
	

}

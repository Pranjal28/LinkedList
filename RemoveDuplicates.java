package com.java.linkedlist;

public class RemoveDuplicates {

	public static void removeDuplicates(Node head) {
		Node curr = head;

		while (curr != null) {
			Node temp = curr;

			while (temp != null && temp.data == curr.data) {
				temp = temp.next;
			}

			curr.next = temp;
			curr = curr.next;

		}
	}

	public static void main(String[] args) {

		Node head = new Node(3);
		head.next = new Node(4);
		head.next.next = new Node(4);
		head.next.next.next = new Node(5);
		head.next.next.next.next = new Node(6);
		head.next.next.next.next.next = new Node(6);

		removeDuplicates(head);

		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

}

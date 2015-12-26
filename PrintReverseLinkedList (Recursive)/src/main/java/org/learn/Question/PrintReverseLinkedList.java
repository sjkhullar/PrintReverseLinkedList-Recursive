package org.learn.Question;

import org.learn.List.Node;

public class PrintReverseLinkedList {
	public static void printReverseLinkedList(Node head) {
		if(null == head) {
			return;
		}		
		printReverseLinkedList(head.next);
		System.out.printf("%d ",head.data);		
	}
	
	public static void insert(Node head, int data) {
		while(head.next != null) 
			head = head.next;
		head.next = new Node(data);
	}
	
	public static void print(Node head) {
		while(head != null) {
			System.out.printf("%d ",head.data);
			head = head.next;
		}
		System.out.println("");		
	}
}

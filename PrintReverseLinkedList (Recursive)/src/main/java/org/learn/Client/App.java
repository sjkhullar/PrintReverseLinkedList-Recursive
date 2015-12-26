package org.learn.Client;

import org.learn.List.Node;
import org.learn.Question.PrintReverseLinkedList;

public class App 
{
	public static void main( String[] args )
    {
		int[] data = {1, 2, 3, 4, 5};
		Node head = new Node(data[0]);
		for(int count = 1; count < data.length; count++)
			PrintReverseLinkedList.insert(head,data[count]);
		System.out.println("Original Linked list");
		PrintReverseLinkedList.print(head);
		System.out.println("Printing the linked list in reverse order");
		PrintReverseLinkedList.printReverseLinkedList(head);
    }
}

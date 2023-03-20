package com.cogent.hw.Coding317;

public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.head = new Node(11);
		
		list.head.next = new Node(12);
		list.head.next.next = new Node(11);
		list.head.next.next.next = new Node(11);
		list.head.next.next.next.next = new Node(12);
		list.head.next.next.next.next.next = new Node(11);
		list.head.next.next.next.next.next.next = new Node(10);

      System.out.println(
          "Linked List before removing duplicates : ");
      list.printList(list.head);
      System.out.println();
     
      
      System.out.println(
          "Linked List after removing duplicates : ");
      list.rmDup();
      list.printList(list.head);
	}

}

package com.cogent.hw.Coding317;


public class Question8 {
	class Node{
		int data;
		Node next;
		
		public Node() {};

		public Node(int data) {
			super();
			this.data = data;
			this.next = null;
		}
		
	}
	Node head = null;
	Node tail = null;
	
	public void addNode(int data) {
		// TODO Auto-generated method stub
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		}
		else {
			tail.next = newNode;
			tail = newNode;
		}
	}

	public void display() {
		// TODO Auto-generated method stub
		Node cur = head;
		while(cur != null) {
			System.out.print(cur.data + "->");
			cur = cur.next;
		}
		System.out.println();		
	}

//	public void removeDuplicate() {
//		// TODO Auto-generated method stub
//		Node cur = head;
//		Node
//		
//	}

}

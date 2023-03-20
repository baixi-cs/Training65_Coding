package com.cogent.hw.Coding317;



public class LinkedList {
	Node head;
	
	

	
	public void addNode(int val) {
//		Node dummy = new Node(-1);
//		head = dummy.next;
		Node newNode = new Node(val);
		if (head == null) {
			newNode = head;
			
		}
		Node cur = head;
		while(cur.next != null) {
			cur = cur.next;
		}
		cur.next = newNode;
		
	}
	
	
	public void rmDup() {
		Node cur = null;
		Node pre = null;
		pre = head;
		while (pre != null &&pre.next != null) {
			cur = pre;
			while (cur.next != null) {
				if(pre.val == cur.next.val) {
					cur.next = cur.next.next;
					System.gc();
				}
				else {
					cur = cur.next;
				}
			}
			pre = pre.next;
		}
			
		
	}

	 public void printList(Node node){
		 while (node != null) {
			 System.out.print(node.val + " ");
	         node = node.next;
	     }
	}
	 
	   

}


package com.cogent.collection;


import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<Float> ll = new LinkedList<Float> ();
		ll.add(55.5f);
		ll.add(-15.5f);
		ll.add(5995.5f);
		ll.add(235.5f);
		ll.add(-21.5f);
		ll.add(0.5f);
		ll.add(805.5f);
		
		System.out.println(ll);
		
		System.out.println("After Sort:");
		Collections.sort(ll);
		for(Float i: ll ) {
			System.out.println(i);
		}
		
		
		
		
	}
}

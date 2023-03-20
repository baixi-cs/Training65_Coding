package com.cogent.collection;

import java.util.*;

public class IterDemo {
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	
		ArrayList<String> batch65 = new ArrayList<String> ();
		batch65.add("amanda");
		batch65.add("cai");
		batch65.add("yuhan");
		batch65.add("abhin");
		batch65.add("guangjian");
		batch65.add("anna");
	
		for(String s: batch65) {
			System.out.println(s);
		}
		System.out.println("*****************it");
		Iterator<String> itr = batch65.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
}

}

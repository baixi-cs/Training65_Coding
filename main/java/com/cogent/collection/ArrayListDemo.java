package com.cogent.collection;

import java.util.*;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	ArrayList<String> batch65 = new ArrayList<String> ();
	batch65.add("amanda");
	batch65.add("cai");
	batch65.add("yuhan");
	batch65.add("abhin");
	batch65.add("guangjian");
	batch65.add("anna");
	
	
	System.out.println(batch65.size());
	ArrayList<String> batch66 = new ArrayList<String> ();
	batch66.add("AA");
	batch66.add("BB");
	System.out.println(batch66.size());
	batch65.addAll(batch66);
	System.out.println(batch65);
	for(String s: batch65 ) {
		System.out.println(s);
	}
	
	
	
	
	System.out.println(batch65.size());
	System.out.println(batch66.isEmpty());
	System.out.println(batch66);
	System.out.println(batch66.contains("CC"));
	
//	Iterator itr = batch65.iterator();
//	while (itr.hasNext()) {
//		System.out.println(itr.next());
//	}
//	
	
	
//	System.out.println(batch65.equals(batch66));
	
	ArrayList<Integer> info = new ArrayList<Integer> ();
	info.add(122);
	info.add(112);
	info.add(132);
	info.add(12);
	info.add(14);
	info.add(13);
	info.add(15);
	info.add(16);
	
	
	
//	for(Integer i: info ) {
//		System.out.println(i);
//	}
//	
//	for (int i=0; i< info.size();i++) {
//		System.out.println(info.get(i));
//	}
	
	
	System.out.println(info.contains(132));
	System.out.println(info);
	System.out.println(info.remove(3));
	System.out.println(info.clone());
	
	System.out.println(info.lastIndexOf(122));
	
	System.out.println(info.size());
	System.out.println(info.isEmpty());
	System.out.println("Max :"+ Collections.max(info));
	
	
	
	
	
	ArrayList<Integer> info2 = new ArrayList<Integer> ();
	info2.add(5);
	info2.add(6);
	System.out.println(info.addAll(0, info2));
	System.out.println("After sort:");
	Collections.sort(info);
	for(Integer i: info ) {
		System.out.println(i);
	}
	
//	Iterator itr = info.iterator();
//	while (itr.hasNext()) {
//		System.out.println(itr.next());
//	}
////	
	}
	

}

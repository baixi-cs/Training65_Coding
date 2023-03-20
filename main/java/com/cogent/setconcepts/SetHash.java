package com.cogent.setconcepts;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetHash {
	public static void main(String[] args) {
		HashSet<Integer> info = new HashSet<Integer> ();
		info.add(122);
		info.add(112);
		info.add(132);
		info.add(12);
		
		info.add(114);
		info.add(114);
		info.add(114);
		info.add(16);
		
		System.out.println(info.size());
//		
		for(Integer i: info ) {
			System.out.println(i);
		}
//		System.out.println(info.contains(132));
//		System.out.println(info);
//		System.out.println(info.remove(3));
//	
//
//		System.out.println(info.size());
//		System.out.println(info.isEmpty());
//		
//		Collections.max(info);
////		Collections.sort(info); #
//		
//		HashSet<Integer> info1 = new HashSet<Integer> ();
//		info1.add(12211);
//		info1.add(11211);
//		System.out.println(info.addAll(info1));
//		System.out.println(info.clone());
//		
//		System.out.println(info.toArray());
//		for(Integer i: info ) {
//			System.out.println(i);
//		}
//		
		LinkedHashSet<Integer> info2 = new LinkedHashSet<Integer> ();
		info2.add(122);
		info2.add(112);
		info2.add(132);
		info2.add(12);
		
		info2.add(114);
		info2.add(114);
		info2.add(114);
		info2.add(16);
		System.out.println("*****************");
		for(Integer i: info2 ) {
			System.out.println(i);
		}
		info2.clear();
		
		
		
		
		
	}

}

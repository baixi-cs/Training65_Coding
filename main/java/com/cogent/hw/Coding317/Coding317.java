package com.cogent.hw.Coding317;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Coding317 {
	
//			1. How do you reverse a string in Java?
	public String reverseStr(String s) {
		char[] str = s.toCharArray();
		int left = 0;
		int right = str.length-1;
		while (left < right) {
			while(str[left] < 65 && str[left] >90 || str[left] < 97 && str[left] > 122 ) {
				left += 1;
			}
			while(str[right] < 65 && str[right] >90 || str[right] < 97 && str[right] > 122 ) {
				right -= 1;
			}
			
			char temp = str[left];
			str[left] = str[right];
			str[right] = temp;
			left += 1;
			right -= 1;
		}
		
		return new String(str);
	}

	
	
//			2. Write a Java program to print a Fibonacci sequence using recursion.
	public int printFib(int n) {
		// TODO Auto-generated method stub
		if(n < 2) {
//			System.out.println(" "+ n);
			return n;		
		}else {
			return printFib(n-2) +  printFib(n-1);
		}
		
	}


//			3. Write a Java program that sorts HashMap by value.
	public void printHashMap(HashMap<String, Integer> hm) {
		for(Map.Entry m :hm.entrySet()) {
			System.out.println("\t" + m.getKey()+" "+m.getValue());
		}
		
	}
	public void printHashMap2(HashMap<Integer, Integer> hm) {
		for(Map.Entry m :hm.entrySet()) {
			System.out.println("\t" + m.getKey()+" "+m.getValue());
		}
		
	}
	public void printHashMap3(HashMap<Character, Integer> hm) {
		for(Map.Entry m :hm.entrySet()) {
			System.out.println("\t" + m.getKey()+" "+m.getValue());
		}
		
	}
	
	public static LinkedHashMap sortHashMapVal(HashMap<String, Integer> hm) {
	
		// TODO Auto-generated method stu
		List<Entry<String, Integer>> list = new LinkedList<>(hm.entrySet());
		Collections.sort(list,(l1, l2)->l1.getValue().compareTo(l2.getValue()));
		LinkedHashMap<String, Integer> sortedhm = new LinkedHashMap();
		for(Map.Entry<String, Integer> entry :list) {
			sortedhm.put(entry.getKey(), entry.getValue());
		}
		return sortedhm;
		
	}
//			4. How do you get distinct characters and their count in a string in Java?



	public void distCharCnt(String s) {
		// TODO Auto-generated method stub
		HashMap<Character, Integer> resHashMap = new HashMap<Character, Integer> ();	
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (resHashMap.containsKey(c)) {
				resHashMap.put(c, resHashMap.get(c) + 1);
			}
			else {
				resHashMap.put(c, 1);
			}
		}
		printHashMap3(resHashMap);
	}
	
//			5.  How do you show a diamond problem with multiple inheritance in Java?
	public void showDiamMultinherit() {
		// TODO Auto-generated method stub
		
		
		
		
		
		
	}
	
	
//			6. Write a program in Java to count the digits in a number.
	public void digitCnt(String s) {
		// TODO Auto-generated method stub
		HashMap<Integer, Integer> resHashMap = new HashMap<Integer, Integer> ();	
		for(int i = 0; i < s.length(); i++) {
			int c = s.charAt(i);
			System.out.println("c= " + c);
			if (resHashMap.containsKey(c)) {
				resHashMap.put(c, resHashMap.get(c) + 1);
			}
			else {
				resHashMap.put(c, 1);
			}
		}
		printHashMap2(resHashMap);
		
	}
//			7. Write a program in Java to Toggle the case of every character of a string. For instance, if the input string is “CoGEnt”, the output should be “cOgeNT”.
	public String toggleCase(String s) {
		String res = "";
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(Character.isUpperCase(c)) {
				c = Character.toLowerCase(c);
			}else if(Character.isLowerCase(c)) {
				c = Character.toUpperCase(c);
			}
			res += c;	
		}
		return res;
	}



	
	
//			8.Java program to remove duplicate elements from a singly linked list
//


}

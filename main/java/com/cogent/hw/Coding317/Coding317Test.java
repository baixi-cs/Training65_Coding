package com.cogent.hw.Coding317;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Coding317Test {
	public static void main(String[] args) {
		Coding317 ct = new Coding317();
		String s = "Safari can protect your privacy by identifying trackers";
		int num2 = 360988756;
		int num = 8;
		HashMap <String, Integer> hm = new HashMap <String, Integer>();
		hm.put("Tom", 23);
		hm.put("Jerry", 28);
		hm.put("Zach", 18);
		hm.put("Ava", 29);
		hm.put("Dan", 43);
		hm.put("Fred", 17);
		
//	1. How do you reverse a string in Java?
		String reverseStr = ct.reverseStr(s);
		System.out.println("q1 reverse a string: " +reverseStr);
		System.out.println("\n");
		
//	2. Write a Java program to print a Fibonacci sequence using recursion.
		int res = ct.printFib(num);
		System.out.println("q2 print a Fibonacci sequence: " +res);
		System.out.println("\n");
		
//	3. Write a Java program that sorts HashMap by value.
		
		ct.printHashMap(hm);
		System.out.println("q3 after sorts HashMap by value: ");
		Map<String, Integer> res1 = Coding317.sortHashMapVal(hm);
		for(Map.Entry m : res1.entrySet()) {
			System.out.print("\t key: " + m.getKey());
			System.out.println(", val: "+m.getValue());
		}
		
//		ct.sortHashMapVal(hm);
		System.out.println("\n");
		
//	4. How do you get distinct characters and their count in a string in Java?
		System.out.println("q4 distinct characters and their count: ");
		ct.distCharCnt(s);
		System.out.println("\n");
//	5.  How do you show a diamond problem with multiple inheritance in Java?
		//see Q5
//		This leads to the ambiguity as the compiler doesn’t know which superclass method to execute. 
//		Because of the diamond-shaped class diagram, it’s referred to as Diamond Problem in java. The 
//		diamond problem in Java is the main reason java doesn’t support multiple inheritances in classes. 
		
//	6. Write a program in Java to count the digits in a number.
		String digits = String.valueOf(num2);
//		String digits2 = Integer.toString(num2);
		System.out.println("digits= " + digits);
		System.out.println("q6 count the digits in a number: " + digits.length());
		System.out.println("\n");

		
//	7. Write a program in Java to Toggle the case of every character of a string. For instance, if the input string is “CoGEnt”, the output should be “cOgeNT”.
		System.out.println("q7 Toggle the case of before: " + s);
		String toggleStr = ct.toggleCase(s);		
		System.out.println("q7 Toggle the case of  after: " + toggleStr);
		System.out.println("\n");
		
//	8. Java program to remove duplicate elements from a singly linked list
		//see LinkedList class
		

		
	}
}

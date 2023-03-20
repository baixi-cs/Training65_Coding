package com.cogent.superkeyword;

public class StringDemo {
	public static void main(String[] args) {
//		String s = "Andy";
//		String s1 = "Alex";
//		char[] s2 = {'A','n','d','y'};
//		String s3 = new String("Alex");
//		
//		s3 = "Andy";
//	
//		System.out.println(s);
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);
//		
//		System.out.println(s.hashCode());
//		System.out.println(s1.hashCode());
//		System.out.println(s2.hashCode());
//		System.out.println(s3.hashCode());
//		
//		
//		System.out.println(s.equals(s2));//F
//		System.out.println(s1.equals(s3));//T
//		System.out.println(s1==s3);//F
//		System.out.println(s==s3);//T string pool
//		String s1 = "StringBuilder is a mutable object in Java";
//		
//		String s2 = "String is immutable whereas StringBuffer and StringBuilder are mutable classes.";
//		
//		char ch = s1.charAt(7);
//		System.out.println(ch);
//		char[] s9 = {'A','n','d','y', 't','i','m','e'};
//		
//		String s3 = s1+ s2;
//		System.out.println(s3);
//		
//		boolean isContain =s2.contains("mute");
//		System.out.println(isContain);
//		
//		int idx = s2.indexOf('w');
//		System.out.println(idx);
//		
//		String s4 = s2.substring(3, 30);
//		System.out.println(s4);
////		String s5 = s2.subSequence(3, 30);
////		System.out.println(s5);
//		
//		String s6 = s2.replace('S','H');
//		System.out.println(s6);
//		
//		String s7 = s1.trim();
//		System.out.println(s7);
//		
//		String s8 = s1.strip();
//		System.out.println(s8);
//		
//		String ss = new String(s9);
//		System.out.println(ss);
//		
		StringBuffer  sbf = new StringBuffer("String is immutable whereas StringBuffer");
		StringBuilder sbd = new StringBuilder("StringBuilder is a mutable object in Java");
		
		System.out.println(sbf.substring(3, 14));
		System.out.println(sbf.capacity());
		System.out.println(sbf.charAt(5));
		System.out.println(sbf.append('S'));
		System.out.println(sbf.reverse());
		System.out.println(sbf.insert(5, "hhhhh"));
		System.out.println(sbf.indexOf("mm"));
		System.out.println("------------------------------");
		System.out.println(sbd.substring(3, 14));
		System.out.println(sbd.capacity());
		System.out.println(sbd.charAt(0));
		System.out.println(sbd.append("cogent"));
		System.out.println(sbd.reverse());
		System.out.println(sbd.deleteCharAt(7));
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
	}


}

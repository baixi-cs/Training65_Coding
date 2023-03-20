package com.cogent.loop2;

public class Test {
	public static void main(String[] args) {
		
		LoopConcepts lc = new LoopConcepts();
		System.out.println("----------------");
		lc.runLoops(5, 10);
		System.out.println("----------------");
		lc.runLoops(5, 50, 5);
		
		
	}
}

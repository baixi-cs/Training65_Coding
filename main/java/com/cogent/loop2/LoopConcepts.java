package com.cogent.loop2;

public class LoopConcepts {
	public void runLoops(int low, int hi) {
		int cnt = 0;
		for(int i = low; i <= hi; i++) {
			System.out.println(i);
			cnt += 1;
			System.out.println("cnt="+ cnt);		
		}
		
	}
	public void runLoops(int low, int hi, int step) {
		for(int i = low; i <= hi; i+=step) {
			System.out.println(i);
			
		}
		
	}

}

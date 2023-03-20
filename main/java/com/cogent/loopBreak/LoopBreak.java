package com.cogent.loopBreak;

public class LoopBreak {
	public void runLoops() {
		
		for(int i = 0; i <= 20; i+=2) {
			if (i %2 == 0) {
				System.out.println("i="+ i+" is even");
			}if (i% 2== 0 && i % 3 == 0) {
				continue;
			}
			
			if (i == 15) {break;}
			System.out.println("i="+ i);
			
		}
		System.out.println("out loop");
		
	}
	

}

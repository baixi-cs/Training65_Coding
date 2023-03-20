package com.cogent.portal;

public class Test {
	public static void main(String[] args) {
		Portal p = new Portal("algorithms", 5);
		p.addQuestion(100);
		p.display(555);
		Portal.noq = 115;
		Portal.showRes(85);
		
		
	}

}

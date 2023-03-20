package com.cogent.keyword;

public class Motor {
	private void disp() {
		System.out.println("I am in private disp method");
	}
	public  void show() {
		
		System.out.println("I am in public show method");
		disp();
	}


}

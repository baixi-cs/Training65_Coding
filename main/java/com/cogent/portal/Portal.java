package com.cogent.portal;

public class Portal {
	static int noq;
	String type;
	int result;
	
	
	
	public Portal(String type, int result) {
		super();
		this.type = type;
		this.result = result;
	}
	public void addQuestion(int n) {
		for (int i = 1; i <= n;i++) {
			System.out.print(i);
		}
	}
	public void display(int n) {
		for (n = 500; n <= 1000;n++) {
			
			if (n %2 == 1) {
				System.out.println("the num" + n + "is odd");
			}
			else {
				System.out.println("the num" + n + "is even");
			}
		}

	}
	public static void showRes(int n) {
		if (n >= 40) {
			System.out.println("success");
		}
	}
	
	

}

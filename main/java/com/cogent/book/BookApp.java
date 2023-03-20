package com.cogent.book;

public class BookApp {
	int balance;
	

	public void bookAvailble(int deposit) {
		balance += deposit;
		System.out.println("After add, the book balance is :" + balance);
				
	}
	public void sold(int deposit) {
		balance -= deposit;
		System.out.println("After sell, the book balance is :" + balance);
		
	}
	public void showAmout() {
		System.out.println("Current book balance is :" + balance);
		
	}

}

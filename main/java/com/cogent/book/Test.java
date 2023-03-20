package com.cogent.book;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("----------------------------");
		BookApp bookapp = new BookApp();
		bookapp.balance = 30;
		bookapp.bookAvailble(20);
		bookapp.sold(14);
		bookapp.showAmout();
	}

}

package com.cogent.oop;

public class BankApp {
	float balance;
	
	public void depositAmout(float deposit) {
		balance += deposit;
		System.out.println("After deposit, the balance is :" + balance);
				
	}
	public void withdrawAmout(float deposit) {
		balance -= deposit;
		System.out.println("After withdraw, the balance is :" + balance);
		
	}
	public void showAmout() {
		System.out.println("Current  balance is :" + balance);
		
	}
	

}

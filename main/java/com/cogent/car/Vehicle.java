package com.cogent.car;

public class Vehicle {
	String mode;
	int engId;
	
	public Vehicle() {
		
	}
	public Vehicle(String mode, int engId) {
		this.mode = mode;
		this.engId = engId;
	}
	public void showInfo(String mode, int engId) {
		System.out.println("The engine id: "+ engId+", the mode name is: "+ mode);
		
	}
	

}

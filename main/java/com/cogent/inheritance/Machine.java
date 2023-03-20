package com.cogent.inheritance;

public class Machine {
	String model;
	int productId;
	
	
	
	public Machine(String model, int productId) {
		
		this.model = model;
		this.productId = productId;
	}


	public void switchOn() {
		System.out.println("machine start");
	
	}


	@Override
	public String toString() {
		return "Machine [model=" + model + ", productId=" + productId + "]";
	}
	

}

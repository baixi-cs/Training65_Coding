package com.cogent.inheritance;

public class WashingMachine extends Machine {
	String address;
	
	public WashingMachine(String model, int productId, String address) {
		super(model, productId);
		this.address = address;
	}

	public void washClothes () {
		System.out.println("washing machine start");
	
	}

	@Override
	public String toString() {
		return "WashingMachine [address=" + address + ", model=" + model + ", productId=" + productId + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	


}

package com.cogent.inheritance;

public class AC extends Machine {
	String city;
	
	public AC(String model, int productId, String city) {
		super(model, productId);
		this.city = city;
	}

	public void tempControl () {
		System.out.println("AC machine start");
	
	}

	@Override
	public String toString() {
		return "AC [city=" + city + ", model=" + model + ", productId=" + productId + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	
	


}

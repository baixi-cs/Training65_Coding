package com.cogent.varibletype;

public class Vehicle {
	String model;
	String type;
	float cost;
	
	
	public Vehicle() {
		System.out.println("default constrctor");
	}
	
	public Vehicle(String model, String type, float cost) {
//		super();
		this.model = model;
		this.type = type;
		this.cost = cost;
		System.out.println("para constrctor");
	}
	
	
	@Override
	public String toString() {
		return "Vehicle [model=" + model + ", type=" + type + ", cost=" + cost + "]";
	}


	

}

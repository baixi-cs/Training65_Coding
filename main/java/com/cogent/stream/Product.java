package com.cogent.stream;

public class Product {
	int id;
	String name;
	float cost;
	
	public Product() {
		System.out.println("default constructor");
	}
	
	public Product(int id, String name, float cost) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", cost=" + cost + "]";
	}
	
	
	

}

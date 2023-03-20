package com.cogent.keyword;

public abstract class Emp {
	int id = 200;
	String name;
	float salary;
	
	public Emp(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	void addEmp() {
//		System.out.println("add Emp"+super.id);
		System.out.println("compelte --no abs method");
		
	}
	abstract void display() ;//not complete

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	

}

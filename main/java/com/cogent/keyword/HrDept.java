package com.cogent.keyword;

public class HrDept extends Emp {
	String dept;
	
	public HrDept(int id, String name, float salary, String dept) {
		super(id, name, salary);
		this.dept = dept;
	}
	
	void show() {
		id = 400;
		System.out.println("show local"+this.id);
		System.out.println("show super"+super.id);
	}
	void display() {
		System.out.println("abs mthond in hr");
	}
	@Override
	public String toString() {
		addEmp();
		return "HrDept [dept=" + dept + ", id=" + id + ", name=" + name + ", salary=" + salary + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	

}

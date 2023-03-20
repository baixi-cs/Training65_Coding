package com.cogent.oop;

public class Employee {
	private int id;
	private String name;
	private String dept;
	private float salary;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public Employee() {
		
	}
	public Employee(int id, String name, String dept, float salary) {
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		
	}
	public void addEmp(int id, String name) {
		if (this.id  != id && this.name != name) {
			System.out.println("the new emplyee add successfully");
		}
		
	}
	public void delEmp(int id, String name, String dept, float salary) {
		if (this.id  == id && this.name == name) {
			System.out.println("the new emplyee delete successfully");
		}
		
	}
	public void updateEmp(float salary) {
	
		System.out.println("the new emplyee update the salary is:"+ salary);
		
	}
	public void displayEmp() {
		System.out.println("The emplyee id: " + id + " the name is:"+ name + " the dept is: "+ dept +"the salary is"+ salary );
	}
//	public String toStringEmp() {
//		System.out.println("The emplyee id: " + id + " the name is:"+ name + " the dept is: "+ dept +"the salary is"+ salary );
//	}
	
}

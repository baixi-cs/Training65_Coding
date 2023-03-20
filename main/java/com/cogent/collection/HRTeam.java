package com.cogent.collection;

import java.util.ArrayList;

public class HRTeam {
	public void addEmp() {
		//create single Employee
		Employee e1 = new Employee(23, "Alex", 25000.00f);
		Employee e2 = new Employee(12, "Eric", 88000.00f);
		Employee e3 = new Employee(29, "Ben", 162000.00f);
		Employee e4 = new Employee(34, "Cici", 200000.00f);
		Employee e5 = new Employee(65, "Dan", 47000.00f);
		
		//Create Collection or Bucket
		ArrayList <Employee> dept = new ArrayList <Employee>();
		dept.add(e5);
		dept.add(e4);
		dept.add(e3);
		dept.add(e2);
		dept.add(e1);
		
		System.out.println("Company has employee as below:");
		for(Employee e: dept) {
			System.out.println(e);
		}
		
		for(Employee e: dept) {
			if(e.getSalary()> 50000.00f) {
				System.out.println("Salary above 50000's name :" + e.getName());
			}
		}
		
//		ArrayList <Employee> empList = new ArrayList <Employee>();
//		empList.add(new Employee(23, "Alex", 25000.00f));
//		empList.add(new Employee(12, "Eric", 88000.00f));
//		empList.add(new Employee(29, "Ben", 162000.00f));
//		empList.add(new Employee(65, "Dan", 47000.00f));
//		empList.add(new Employee(34, "Cici", 200000.00f));
////		
//		System.out.println("Company has employee as below:");
//		for(Employee e: empList) {
//			System.out.println(e);
//		}
//		
//		for(Employee e: empList) {
//			if(e.getSalary()> 50000.00f) {
//				System.out.println("Salary > 50000's name :" + e.getName());
//			}
//		}
//		
	}

}

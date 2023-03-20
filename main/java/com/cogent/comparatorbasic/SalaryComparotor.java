package com.cogent.comparatorbasic;

import java.util.Comparator;

public class SalaryComparotor implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// logic to compare objects...
//		return 0;
		
//		Employee s1=o1;  
//		Employee s2=o2;  
		  
		return Float.compare(o1.salary, o2.salary);
	}
}

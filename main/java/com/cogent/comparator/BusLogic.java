package com.cogent.comparator;

import java.util.ArrayList;
import java.util.Collections;


public class BusLogic {
	public void addRecords() {
		
		ArrayList <Emp> empList = new ArrayList <Emp>();
		empList.add(new Emp(23, "Alex", "IT", 25000.00f));
		empList.add(new Emp(12, "Eric", "Admin",  88000.00f));
		empList.add(new Emp(29, "Ben","HR", 162000.00f));
		empList.add(new Emp(65, "Dan", "Marketing",47000.00f));
		empList.add(new Emp(34, "Cici", "Sales", 200000.00f));
		
		System.out.println("Company has employee as below:");
		for(Emp e: empList) {
			System.out.println(e);
		}
		
		NameComparator nc = new NameComparator();
		Collections.sort(empList,nc);
		
		System.out.println("After sort:");
		for(Emp e: empList) {
			System.out.println(e);
		}
		
	}

}

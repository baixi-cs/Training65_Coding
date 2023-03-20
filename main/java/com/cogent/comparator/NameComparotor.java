package com.cogent.comparator;

import java.util.Comparator;

public class NameComparotor implements Comparator<Emp>{
	public int compare(Emp e1, Emp e2) {
		Emp s1 = e1;
		Emp s2 = e2;
		return s1.getName().compareTo(s2.getName());
	}

}

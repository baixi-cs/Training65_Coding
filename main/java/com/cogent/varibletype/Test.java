package com.cogent.varibletype;


public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Vehicle v1 =  new Vehicle();
		v1.model = "BMW";
		v1.type = "S600";
		v1.cost = 30000f;
		System.out.println(v1.toString());
		
		Vehicle v2=  new Vehicle("Benz", "M1", 80000f);
		System.out.println(v2.toString());
		
		
	}

}

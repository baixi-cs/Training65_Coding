package com.cogent.car;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v1 = new Vehicle();
		v1.engId = 101;
		v1.mode = "honda";
		v1.showInfo("BMW", 110);
		Vehicle v2 = new Vehicle("Benz", 121);
		v2.showInfo("Tesla", 1000);
		
		Motor m1 = new Motor();
		m1.mpg = 31;
		System.out.println(m1.speed(16));
		System.out.println(m1.speed(20));
	
		
	}

}

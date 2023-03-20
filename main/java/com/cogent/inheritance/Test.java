package com.cogent.inheritance;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		
		c.startEngine();
		c.getCost();
		
		Vehicle v = new Vehicle();
		v.startEngine();
		System.out.println("------------");
		Machine m = new Machine("LG", 345);
		m.switchOn();
		System.out.println(m.toString());
	
		
		WashingMachine wm = new WashingMachine("SIMENS", 678, "OREGON");
		wm.washClothes();
		wm.switchOn();
		System.out.println(wm.toString());
		
		AC ac = new AC("Pansonic", 890, "Washington");
		ac.tempControl();
		System.out.println(ac.toString());
		
		
		
		

	}

}

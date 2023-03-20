package com.cogent.interfacedemo;

public class Process implements Employee, PayRoll{
	
	public void add() {
		System.out.println("pro default add method");
	}
	public void calculate() { //
		System.out.println("pro scalculate salary method");
	}
	

}

package com.cogent.oop;

public class Calculator {
	
	
	int x;
	int y; 
	int z;
	float a;
	float b;
		
	
	public int getAdd(int x, int y, int z) {
		return x+y+z;
	}
	public int getMinus(int x, int y, int z) {
		return x-y-z;
	}
	public int getMult(int x, int y, int z) {
		return x*y*z;
	}
	public int getDiv(int x, int y, int z) {
		return x/y/z;
	}
	public float getFloatResult(float a, float b) {
		return  a+b;
	}
	
	
	public void display() {
		System.out.println("Display function");
	}

}

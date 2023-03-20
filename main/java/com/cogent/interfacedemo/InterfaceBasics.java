package com.cogent.interfacedemo;

public interface InterfaceBasics {
	final int no = 100;// final  
	public abstract void show(); //before JDK 1.8
	default void add() { //default
		System.out.println("default method");
	}
	public static void display() { //
		System.out.println("static method");
	}

}

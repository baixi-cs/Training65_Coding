package com.cogent.interfacedemo;

public interface Employee {
	final int id = 1001;
	default void add() { //default
		System.out.println("emp default add method");
	}
	public static void show() { //
		System.out.println("emp static show method");
	}

}

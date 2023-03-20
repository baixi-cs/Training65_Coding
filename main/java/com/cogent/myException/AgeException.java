package com.cogent.myException;

public class AgeException extends Exception{
	public AgeException(String msg) {
	  super(msg);
	  System.out.println("Age Exception created");
	}
}

package com.cogent.lib;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library l = new Library();
		l.student = "Alex";
		
		Library.setLibrarian("Anna");
		Library.getLibrarian();
		
		l.display(12);

	}

}

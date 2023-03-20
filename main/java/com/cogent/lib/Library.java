package com.cogent.lib;

public class Library {
	static String librarian;
	String student;
	
	public Library() {
		
	}
	
	public Library(String student) {
//		super();
		this.student = student;
	}
	public static String getLibrarian() {
		return librarian;
	}
	public static void setLibrarian(String librarian) {
		Library.librarian = librarian;
	}
	public String getStudent() {
		return student;
	}
	public void setStudent(String student) {
		this.student = student;
	}
	
	void display( int borrow) {
		int book =8;
		book = book + borrow;
		System.out.println("There are ibrariar: "+ librarian +", student: "+ student +" and books: "+book + "in library");
		 
		
	}
	
	
	
	

}

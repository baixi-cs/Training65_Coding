package com.cogent.stream;

@FunctionalInterface
public interface Perimeter {
//	void peri(int x, int y);
	void peri(int x, int y);
	
	default void show() {
		System.out.println("show method in default peri inter");
	}

}

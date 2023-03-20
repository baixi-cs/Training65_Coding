package com.cogent.stream;

public class TestPeri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Perimeter p = (x, y)-> {
			System.out.println("i got the x:" + x + "\t y:"+y+"\t perimeter:" + 2* (x+y));
		};
		p.peri(5, 10);
		p.show();
		
		
		
		

	}

}

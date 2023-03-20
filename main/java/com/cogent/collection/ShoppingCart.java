package com.cogent.collection;

import java.util.ArrayList;

public class ShoppingCart {
	
	public void addProduct() {
		//create obs of p
		
		Product p1 = new Product(101, "kiwi", 3.5f);
		Product p2 = new Product(10, "laptop", 1500.00f);
		Product p3 = new Product(21, "book", 23.00f);
		Product p4 = new Product(99, "switch", 299.00f);
		Product p5 = new Product(11201, "phone", 999.5f);
		
		//Create Collection or Bucket to Add Product to it
		ArrayList <Product> bktemp = new ArrayList<Product> ();
		bktemp.add(p1);
		bktemp.add(p2);
		bktemp.add(p3);
		bktemp.add(p4);
		bktemp.add(p5);
		
		for(Product p : bktemp ) {
			if (p.getCost() > 100) {
				System.out.println(p.getName());
			}
		}
	}

}

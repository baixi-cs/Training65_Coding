package com.cogent.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.cogent.collection.Employee;

public class StreamConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.collection add lots objs
//		ArrayList<String> batch65 = new ArrayList<String> ();
//		batch65.add("amanda");
//		batch65.add("cai");
//		batch65.add("yuhan");
//		batch65.add("abhin");
//		batch65.add("guangjian");
//		batch65.add("anna");
//		
//		batch65.stream().forEach(p->System.out.println(p));
//		System.out.println("*****************************1");
//		batch65.forEach(System.out::println);
//	
//		System.out.println("*****************************2");
//		
//		Stream <String> st = batch65.stream();
//		
//		 //intermediate Operation         //terminal Operation
//		st.filter(str->str.endsWith("n")).forEach(System.out::println);
		
		
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
		
//		for(Product p : bktemp ) {
//			if (p.getCost() > 100) {
//				System.out.println(p.getName());
//			}
//		}
		System.out.println("*****************************3");
		List<Float> bkt = bktemp.stream()
		.filter(p->p.getCost() > 50.00f)
		.map(pm->pm.getCost()-2000.00f).toList();
//		.forEach(System.out::println);
//		
		System.out.println("st"+bkt);
		bktemp.stream().distinct().forEach(System.out::println);
    
		
		List<Float> bucketEmp2=bktemp.stream()
				.filter(p ->p.cost> 50.00)   // filtering price  
		        .map(pm ->pm.cost-5000).toList();          // fetching price  
		    //   .forEach(p->System.out.println(p));  // iterating price 

				//bucketEmp.stream().filter(p ->p.cost> 30000.00).map(pm ->pm.cost-5000).forEach(System.out::println);
				System.out.println(bucketEmp2);

		
				System.out.println("::::::::::::::::::::::::::::::::::");
//				 List < Product > productSortedList2 = bucketEmp.stream()
//				            .sorted(Comparator.comparing(Product::getName)).collect(Collectors.toList()); //ascending order
//				
//				// System.out.println(productSortedList2);
//				 productSortedList2.stream().forEach(System.out::println);
				
//				 List < Product > productSortedList2 = bktemp.stream()
//				            .sorted(Comparator.comparing(Product::getId)).collect(Collectors.toList()); //ascending order
//				
//				 System.out.println("**"+productSortedList2);
//				 productSortedList2.stream().forEach(System.out::println);

		
					//Create Collection or Bucket
		ArrayList <Customer> bank = new ArrayList <Customer>();
		bank.add(new Customer(23, "Alex", 25000.00f));
		bank.add(new Customer(12, "Eric", 88000.00f));
		bank.add(new Customer(34, "Cici", 200000.00f));
		bank.add(new Customer(29, "Ben", 162000.00f));
		bank.add(new Customer(65, "Dan", 47000.00f));
					
		System.out.println("Bank has as below:");
		for(Customer c: bank) {
				System.out.println(c);
			}
		System.out.println("*****************************3");
		List <Customer> ctmSortedList = bank.stream()
			.sorted(Comparator.comparing(Customer::getBalance))
			.collect(Collectors.toList());
		ctmSortedList.stream().forEach(System.out::println);
	}

}

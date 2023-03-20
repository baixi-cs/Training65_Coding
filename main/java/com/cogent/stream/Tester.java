package com.cogent.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Tester {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Customer> bank = new ArrayList <Customer>();
		bank.add(new Customer(23, "Alex", 25000.00f));
		bank.add(new Customer(12, "Eric", 88000.00f));
		bank.add(new Customer(34, "Cici", 200000.00f));
		bank.add(new Customer(29, "Ben", 162000.00f));
		bank.add(new Customer(65, "Dan", 47000.00f));
		
		bank.add(new Customer(29, "Ben", 162000.00f));
		bank.add(new Customer(65, "Dan", 47000.00f));
					
//		System.out.println("Bank has as below:");
//		for(Customer c: bank) {
//				System.out.println(c);
//			}
		
//		List < Product > productSortedList2 = bktemp.stream()
//	            .sorted(Comparator.comparing(Product::getId)).collect(Collectors.toList()); //ascending order
//	
//		System.out.println("*****************************3");
//		List <Customer> ctmSortedList = bank.stream()
//			.sorted(Comparator.comparing(Customer::getBalance))
//			.collect(Collectors.toList());
//		ctmSortedList.stream().forEach(System.out::println);
//		
//		long cnt = bank.stream().count();
//		System.out.println("count:"+ cnt);
		
		
		//skip
//		int[]
//		
		Stream<Integer> st = Stream.of(3, 4, 5, 8, 9, 15, 1, 2, 3, 4, 5);
//		
//		System.out.println("*****************************after skip");
//		st.skip(3).forEach(System.out::println);
//		System.out.println("*****************************after distinct");
//		st.map(i->i*i).distinct().forEach(System.out::println);
//		System.out.println("*****************************after limit");
//		List <Int> list1 = st.filter(i->i >3).limit(2).toList();
//		System.out.println("*****************************after max, min, sum, avg");
//	 
//		System.out.println("max:"+ st.mapToInt((i)->i).summaryStatistics().getMax()+" min:"+ st.mapToInt((i)->i).summaryStatistics().getMin()+ " sum: "+st.mapToInt((i)->i).summaryStatistics().getSum() +" avg: "+ st.mapToInt((i)->i).summaryStatistics().getAverage());
////		st.sorted().forEach(System.out::println);
////		st.map(i->i*i).forEach(System.out::println);
//		
//		System.out.println(st.filter(i->i>3).count());
	
		System.out.println("any match result="+st.anyMatch(i->i==4));
		System.out.println("first get result="+st.filter(i->i==4).findFirst().get());
		st.distinct().forEach(System.out::println);
		System.out.println("*****************************after skip");
		bank.stream().skip(3).forEach(System.out::println);
		System.out.println("*****************************after limit");
		bank.stream().limit(5).forEach(System.out::println);
		

		
		List <Customer> ctmSortedList = bank.stream()
				.filter(c->c.getId()>=20)
				.collect(Collectors.toList());
//		ctmSortedList.stream().forEach(System.out::println);
		System.out.println("ctmSortedList: " +ctmSortedList);
		
		
		
//		
//
//		//toArr
//		System.out.println("*****************************to array");
//		bank.stream().toArray();
//		
		//distinct
//		System.out.println("*****************************after distinct");
//		bank.stream().distinct().forEach(System.out::println);
//		
//		
		
		
		
		
		
		
		
//		

	}

}

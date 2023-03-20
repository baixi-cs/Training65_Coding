package com.cogent.ioConcepts;

import java.util.Scanner;

public class ScannerBasics {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter num1:");
		int num1 = scanner.nextInt();
		System.out.println(" num1 = " + num1);
		float num2 = scanner.nextFloat();
		System.out.println(" num1 = " + num1);
		
		System.out.println(" input 3 nums: " );
		float n1 = scanner.nextFloat();
		float n2 = scanner.nextFloat();
		float n3 = scanner.nextFloat();
		String str1 = scanner.nextLine();
		char ac = scanner.next().charAt(0);
		System.out.println(str1+ ac );
		for (int i = 0 ; i< 3; i++) {
			float n = scanner.nextFloat();
		}
		System.out.println(n1+n2+n3 );
		float max;
		if ((n1 > n2) &&(n1 > n3)) {
			max = n1;
		}else if ((n2 > n1) &&(n2 > n3)) {
			max = n2;
		}
		else {
			max = n3;
				
		}
		System.out.println(" max = " + max);
		
	}
}

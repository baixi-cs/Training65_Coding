package com.cogent.ioConcepts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BufferedReaderDemo {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println(" input 2 nums:  " );
//		int n1 = Integer.parseInt(br.readLine());
//		int n2 = Integer.parseInt(br.readLine());
//		int n3 = n1+ n2;
//		System.out.println(" n1=  "+ n1 );
//		System.out.println(" n1=  "+ n1 );
		
		System.out.println(" input 3 float nums:  " );
		float num1 = Float.parseFloat(br.readLine());
		float num2 = Float.parseFloat(br.readLine());
		float num3 = Float.parseFloat(br.readLine());
		float total = num1+num2+num3;
		System.out.println(" tot 3 float =  "+ total);
		
	}

}

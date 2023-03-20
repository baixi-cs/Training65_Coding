package com.cogent.exception;

public class HandleError {
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 0;
		String str = null;
		try {
			
			
			int n3 = n1/n2;
			System.out.println(n3);
			System.out.println("--------------------------");
	
			
			System.out.println(str.length());
			
			System.out.println("--------------------------");
			char[] chs = new char[5];
			chs[5] = 'Q';
			
			
		}
//			catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
		catch(ArithmeticException ae ){
			System.out.println("assd");
//			ae.printStackTrace();
			
//			System.out.println(ae.getMessage());
			
		}
		catch(NullPointerException npe ){
			System.out.println("assaasdfghjkd");
			npe.printStackTrace();
//			
//			System.out.println(npe.getMessage());
			
		}
		catch(ArrayIndexOutOfBoundsException aioe ){
			System.out.println("__________________");
			aioe.printStackTrace();

			System.out.println(aioe.getMessage());
		}finally {
			System.out.println("finally success");
		}
	}	
	
}

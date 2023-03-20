package com.cogent.myException;

public class Test1 {
	public static void main(String[] args) throws AgeException {
		// TODO Auto-generated method stub
		
		
		VoteApp va1 = new VoteApp();
		va1.checkVote(22);
		System.out.println("**********************");
		VoteApp va2 = new VoteApp();
		va2.checkVote(15);

	}

}

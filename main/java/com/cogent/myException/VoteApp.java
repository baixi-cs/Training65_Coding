package com.cogent.myException;

public class VoteApp {
	public void checkVote(int age) throws AgeException {
		if(age < 18) {
			throw new AgeException("personal nor eligible to vote");
		}else {
			System.out.println("vote");
		}
		
		System.out.println("Success");
	}

}

package com.cogent.voterapp;

public class VoteApp {
	int age;
	public boolean checkVote(int age) {
		if (age < 0 || age > 130) {
			System.out.println("the age is "+ age + ", It is out of range");
			return false;
		}
		else {
			if (age < 18) {
				System.out.println("You age is "+ age+ ", you cannot vote");
				return false;
			}
			else {
				System.out.println("You age is "+ age+ ",You are eligible to vote");
				return true;
			}
		}
		
	}

}

package com.cogent.voterapp;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VoteApp voteapp = new VoteApp();
		Boolean isLegal1 = voteapp.checkVote(15);
		System.out.println(isLegal1);
		
		System.out.println("----------------");
		Boolean isLegal2 = voteapp.checkVote(30);
		System.out.println(isLegal2);
		System.out.println("----------------");
		
		Boolean isLegal3 = voteapp.checkVote(135);
		System.out.println(isLegal3);
	}

}

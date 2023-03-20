package com.cogent.exception;

public class TryDemo {
	public static void main(String[] args) {
		String s = "afsdgk shdjfgk jfdrf";
		char[] chs = null;
		try {
			chs = s.toCharArray();
		}finally {
			System.out.println(chs);
		}
	}

}

package com.cogent.ioConcepts;

import java.io.FileReader;
import java.io.IOException;

public class FileRead {
	   public static void main(String[] args) {
	        try {
	            FileReader reader = new FileReader("M111.txt");//"MyFileAmit.txt"
	            int character;
	 
	            while ((character = reader.read()) != -1) {
	                System.out.print((char) character);
	            }
	            reader.close();
	 
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
		        

}

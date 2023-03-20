package com.cogent.ioConcepts;

import java.io.FileWriter;
import java.io.IOException;

public class FileStream {
	 public static void main(String[] args) {
	        try {
	            FileWriter writer = new FileWriter("MyFileAmit.txt", true);
	            writer.write("Hello World");
	            writer.write("\r\n");   // write new line
	            writer.write("Good Bye!");
	            writer.close();
	            System.out.print("file create successfly");
	           
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	 
	    }
	 


}

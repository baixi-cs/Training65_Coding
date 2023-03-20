package com.cogent.dateTime;
import java.util.Date; //before jdk1.8
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.text.SimpleDateFormat;

public class NewTime {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		LocalTime lt = LocalTime.now().withNano(0);
//	    System.out.println(String.format("time format : %s", lt));
		LocalTime ld = LocalTime.now();
	    int timeOfDay = ld.now().getHour();

	    if (timeOfDay < 6) {
	    	System.out.println("Hi, Good Night");
	    } else if (timeOfDay < 12) {
	    	System.out.println("Hi, Good Morning");
	    } else if (timeOfDay < 16) {
	    	System.out.println("Hi, Good Afternoon");
	    } else if (timeOfDay < 21) {
	    	System.out.println("Hi, Good Evening");
	    } else {
	    	System.out.println("Hi, Good Night");
	    }
	}

}

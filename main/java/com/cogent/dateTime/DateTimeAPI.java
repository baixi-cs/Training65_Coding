package com.cogent.dateTime;

import java.util.Date; //before jdk1.8
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.text.SimpleDateFormat;

public class DateTimeAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date now = new Date();
		//format yyyy-MM-dd HH:mm:ss
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	    String date  = sdf.format(now);
	    System.out.println(String.format("date format : %s", date));
	    
		//------------------------------------------------------------------
	    //format HH:mm:ss
	    SimpleDateFormat sdft = new SimpleDateFormat("HH:mm:ss");
	    String time = sdft.format(now);
	    System.out.println(String.format("time format : %s", time));

	    //result: time format : 11:19:14
	//------------------------------------------------------------------
	    //format yyyy-MM-dd HH:mm:ss
	    SimpleDateFormat sdfdt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    String datetime = sdfdt.format(now);
	    System.out.println(String.format("dateTime format : %s", datetime));
	    
	    LocalDate ld = LocalDate.now();
	    System.out.println(String.format("date format : %s", ld)); //date format : 2023-02-23
	    System.out.println("date: "+ ld.now());//2023-02-23
	    System.out.println("exactly date: "+ ld.getDayOfMonth());//2023-02-23
	   
	    LocalTime lt = LocalTime.now().withNano(0);
	    System.out.println(String.format("time format : %s", lt)); //time format : 11:24:33
	    
	    LocalDateTime dateTime = LocalDateTime.now();
	    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	    String dateTimeStr = dateTime.format(dateTimeFormatter);
	    System.out.println(String.format("dateTime format : %s", dateTimeStr));
	    
	    System.out.println("******************************************************");
	    ZonedDateTime zonedDateTime = ZonedDateTime.now();
	    System.out.println("Local time: " + zonedDateTime);//Local time: 2023-02-23T11:36:45.303353-08:00[America/Los_Angeles]
	    System.out.println(zonedDateTime.getOffset());
//
//	    Local time: 2023-02-23T11:36:45.303353-08:00[America/Los_Angeles]
//	    --------------------------------------------------------
	    
	    ZoneId zoneId = ZoneId.of(ZoneId.SHORT_IDS.get("JST"));
	    ZonedDateTime tokyoTime = zonedDateTime.withZoneSameInstant(zoneId);//tokyo local time: 2023-02-24T04:36:45.303353+09:00[Asia/Tokyo]
	    System.out.println("tokyo local time: " + tokyoTime);
//
//	    
//	    --------------------------------------------------------
	    // ZonedDateTime 转 LocalDateTime
	    LocalDateTime localDateTime = tokyoTime.toLocalDateTime();
	    System.out.println("tokyo local time convert to local time: " + localDateTime);//tokyo local time convert to local time: 2023-02-24T04:36:45.303353

	    
	
	}

}

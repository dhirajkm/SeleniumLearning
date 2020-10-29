package org.learning.selenium;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateCLass {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		
		SimpleDateFormat sdf = new SimpleDateFormat ("dd-MMM-YYYY:mm:ss");
		String time = sdf.format(d).replace(":", "_");
		System.out.println(time);
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		System.out.println(cal.MONTH);
		System.out.println(cal.getTimeZone());		
	}

}

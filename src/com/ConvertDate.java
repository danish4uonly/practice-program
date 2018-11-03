package com;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class ConvertDate {
	
	public static void main(String[] args)
	{
		SimpleDateFormat format1 = new SimpleDateFormat("yyyyMMDD");
        SimpleDateFormat format2 = new SimpleDateFormat("dd-MM-yyyy");
        Date date = null;
        try {
            date = format1.parse("20160115");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String dateString = format2.format(date);
        System.out.println(dateString);
        dateConvert();
	}
	
public static List<Integer> dateConvert(){
		
		List<Integer> yearRange = new ArrayList<Integer>();
		
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		
		int calYear = year-10;
		
		for(int i=0;i<10;i++)
		{
			yearRange.add(calYear+1);
			calYear=calYear+1;
		}
		
		/*String yearInString = String.valueOf(year);*/
		System.out.println("**********: "+calYear);
		
		for(Integer abc:yearRange)
		{
			System.out.println(abc);
		}
		
		return yearRange;
		
	}

}

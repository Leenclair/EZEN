package day23.util;

import java.util.Calendar;
import java.util.Date;

public class CalendarConvert {

	public static void main(String[] args) {
		//[1] Calendar�� Date�� ��ȯ
		Calendar cal = Calendar.getInstance();
		cal.set(2022, 5, 10);//2022-6-10
		
		Date d = cal.getTime();
		System.out.println(d.toLocaleString());
		
		//[2] Date�� Calendar�� ��ȯ
		Date date = new Date(2022-1900,7,23); //2022-08-23
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(date);
		
		System.out.println("\n"+CalendarTest2.showDate(cal2));
	}

}

package day23.util;

import java.util.Calendar;
import java.util.Date;

public class day23_과제3_이창수 {
	public static String toString(Calendar cal) {
		return cal.get(Calendar.YEAR)+"년"+(cal.get(Calendar.MONTH)+1)+"월"
				+cal.get(Calendar.DATE)+"일";
	}
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();

		cal.set(1993, 0, 7);
		long diff = (cal2.getTimeInMillis()-cal.getTimeInMillis())/1000;
		diff = diff/(24*60*60);
		System.out.println("생일<1993-01-07> 이후 경과일수:"+diff+"일");
		
		Date d = new Date(2022-1900,6,19);
		Date d2 = new Date(2022-1900,2,11);
		long gap = d.getTime()/1000;
		long gap2 = d2.getTime()/1000;
		gap = gap/(24*60*60);
		gap2 = gap2/(24*60*60);
		
		System.out.println("수료일까지 남은 일수:"+(gap-gap2));
		cal2.add(Calendar.YEAR, -10);
		System.out.println("3/11부터 10년 전 :"+toString(cal2));
		
	}
}
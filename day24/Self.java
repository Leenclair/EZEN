package day24;

import java.util.Calendar;

public class Self {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.add(cal.MONTH, 7);
		System.out.println(cal.getTime());
	}
}

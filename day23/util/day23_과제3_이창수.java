package day23.util;

import java.util.Calendar;
import java.util.Date;

public class day23_����3_��â�� {
	public static String toString(Calendar cal) {
		return cal.get(Calendar.YEAR)+"��"+(cal.get(Calendar.MONTH)+1)+"��"
				+cal.get(Calendar.DATE)+"��";
	}
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();

		cal.set(1993, 0, 7);
		long diff = (cal2.getTimeInMillis()-cal.getTimeInMillis())/1000;
		diff = diff/(24*60*60);
		System.out.println("����<1993-01-07> ���� ����ϼ�:"+diff+"��");
		
		Date d = new Date(2022-1900,6,19);
		Date d2 = new Date(2022-1900,2,11);
		long gap = d.getTime()/1000;
		long gap2 = d2.getTime()/1000;
		gap = gap/(24*60*60);
		gap2 = gap2/(24*60*60);
		
		System.out.println("�����ϱ��� ���� �ϼ�:"+(gap-gap2));
		cal2.add(Calendar.YEAR, -10);
		System.out.println("3/11���� 10�� �� :"+toString(cal2));
		
	}
}
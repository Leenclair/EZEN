package day24;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SelfTest {

	public static void main(String[] args) {
		System.out.println("��¥�� �Է��ϼ���<2022/05/11>");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy�� MM�� dd�� E");
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd E���� hh:mm:ss a");
		
		Date date;
		try {
		date = sdf.parse(str);
		String s = sdf.format(date);
		String s2 = sdf2.format(date);
		System.out.println(s);
		System.out.println(s2);
		}catch(ParseException e) {
			e.printStackTrace();
		}
		
		Date date2 = new Date();
		String s3 = sdf3.format(date2);
		System.out.println("\n���ó�¥ : "+s3);
	}

}

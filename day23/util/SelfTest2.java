package day23.util;
import java.util.Scanner;

public class SelfTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ֹε�Ϲ�ȣ�� �Է��ϼ���<�����¾��� �Է�>");
		String str5 = sc.nextLine();
		String s2 = str5.substring(7,8);
		String ss2 = str5.substring(0,2);
		String s3 = str5.substring(2, 4);
		String s4 = str5.substring(4, 6);
		String s5 = str5.substring(6,7);
		String gender="";
		String year="";
		//012345 6789012
		//990107 2223333
		if(s5.equals("1")||s5.equals("3")) {
			gender = "��";
		}else if(s5.equals("2")||s5.equals("4")) {
			gender = "��";
		}
		
		if(s2.equals("1")||s2.equals("2")) {
			year = "19";
		}else if(s2.equals("3")||s2.equals("4")) {
			year = "20";
		}
		
		
		System.out.println(year+ss2+"�� "+s3+"�� "+s4+"��"+" ,"+gender);
	}

}

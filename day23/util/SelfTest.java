package day23.util;

import java.util.Scanner;

public class SelfTest {

	public static void main(String[] args) {
		String str = "test.txt";
		int idx = str.lastIndexOf(".");
		
		System.out.print("���ϸ�:"+str.substring(0, idx));
		System.out.println(", Ȯ����:"+str.substring(idx+1));
		
		String str2 = "�ȳ��ϼ���\r\n ���� ȫ�浿�Դϴ�.";
		String s = str2.replace("\r\n", "<br>");
		System.out.println(s);
		
		String str3 = "c:\\shop\\upload\\test.txt";
		int idx2 = str3.lastIndexOf("\\");
		int idx3 = str3.lastIndexOf(".");
		
		System.out.println("����:"+str3.substring(0, idx2));
		System.out.println("���ϸ�:"+str3.substring(idx2+1,idx3));
		System.out.println("Ȯ����:"+str3.substring(idx3+1));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("URL�ּҸ� �Է��ϼ���");
		String str4 = sc.nextLine();
		if(str4.indexOf("http://www.mail.com")!=-1) {
			System.out.println("�ش� url �ּ�:"+str4);
		}else System.out.println("url �ּҰ� �������� �ʽ��ϴ�");
		
		
		
	}

}

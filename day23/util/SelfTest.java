package day23.util;

import java.util.Scanner;

public class SelfTest {

	public static void main(String[] args) {
		String str = "test.txt";
		int idx = str.lastIndexOf(".");
		
		System.out.print("파일명:"+str.substring(0, idx));
		System.out.println(", 확장자:"+str.substring(idx+1));
		
		String str2 = "안녕하세요\r\n 저는 홍길동입니다.";
		String s = str2.replace("\r\n", "<br>");
		System.out.println(s);
		
		String str3 = "c:\\shop\\upload\\test.txt";
		int idx2 = str3.lastIndexOf("\\");
		int idx3 = str3.lastIndexOf(".");
		
		System.out.println("폴더:"+str3.substring(0, idx2));
		System.out.println("파일명:"+str3.substring(idx2+1,idx3));
		System.out.println("확장자:"+str3.substring(idx3+1));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("URL주소를 입력하세요");
		String str4 = sc.nextLine();
		if(str4.indexOf("http://www.mail.com")!=-1) {
			System.out.println("해당 url 주소:"+str4);
		}else System.out.println("url 주소가 적합하지 않습니다");
		
		
		
	}

}

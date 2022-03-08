package day21;

import java.util.Scanner;

class SelfException2 extends Exception{
	public SelfException2() {
		super("주민번호를 잘못 입력했습니다. 14자리를 입력하세요");
	}
}

public class UserExSelf2 {
	
	public static String readNum() throws SelfException2{
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요");
		String str = sc.nextLine();
		
		if(str.length()!=14) {
			throw new SelfException2();
		}
		return str;
	}
	
	public static void main(String[] args) throws SelfException2 {
		try {
			String st = readNum();
			System.out.println("주민번호:"+st);
		}catch(SelfException2 e) {
			System.out.println(e.getMessage());
		}
	}

}

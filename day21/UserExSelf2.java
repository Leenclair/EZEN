package day21;

import java.util.Scanner;

class SelfException2 extends Exception{
	public SelfException2() {
		super("�ֹι�ȣ�� �߸� �Է��߽��ϴ�. 14�ڸ��� �Է��ϼ���");
	}
}

public class UserExSelf2 {
	
	public static String readNum() throws SelfException2{
		Scanner sc = new Scanner(System.in);
		System.out.println("�ֹι�ȣ�� �Է��ϼ���");
		String str = sc.nextLine();
		
		if(str.length()!=14) {
			throw new SelfException2();
		}
		return str;
	}
	
	public static void main(String[] args) throws SelfException2 {
		try {
			String st = readNum();
			System.out.println("�ֹι�ȣ:"+st);
		}catch(SelfException2 e) {
			System.out.println(e.getMessage());
		}
	}

}

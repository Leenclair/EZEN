package day21;

import java.util.Scanner;

class SelfException extends Exception{
	public SelfException() {
		super("�ֹι�ȣ�� �߸� �Է��߽��ϴ�. 13�ڸ��� �Է��ϼ���");
	}
}

public class UserExSelf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("�ֹι�ȣ�� �Է��ϼ���");
			String num = sc.nextLine();
			if(num.length()!=13) {
				throw new SelfException();
			}
			System.out.println("�ֹι�ȣ :"+num);
		}catch(SelfException e){
			System.out.println(e.getMessage());
		}
		System.out.println("���α׷��� ���������� ����Ǿ����ϴ�!");
	}

}

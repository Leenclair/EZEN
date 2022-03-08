package day21;

import java.util.Scanner;

class SelfException extends Exception{
	public SelfException() {
		super("주민번호를 잘못 입력했습니다. 13자리를 입력하세요");
	}
}

public class UserExSelf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("주민번호를 입력하세요");
			String num = sc.nextLine();
			if(num.length()!=13) {
				throw new SelfException();
			}
			System.out.println("주민번호 :"+num);
		}catch(SelfException e){
			System.out.println(e.getMessage());
		}
		System.out.println("프로그램이 정상적으로 종료되었습니다!");
	}

}

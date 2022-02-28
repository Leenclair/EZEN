package day13;

import java.util.Scanner;

class PhoneInfo{
	private String name;
	private String phone;
	private String birth;

	PhoneInfo(String name, String phone, String birth){
		this.name = name;
		this.phone = phone;
		this.birth = birth;
	}
	
	PhoneInfo(String name, String phone){
		this.name = name;
		this.phone = phone;
	}
		
	public void showInfo() {
		System.out.println("\n======입력된 정보 출력=======");
		System.out.println("name: "+this.name);
		System.out.println("phone: "+this.phone);
		if(birth!=null)System.out.println("birth: "+this.birth);
	}
}

public class PhoneInfoTest_Hw2_이창수 {

	public static void main(String[] args) {
		System.out.println("==========1단계==========");
		PhoneInfo ph1 = new PhoneInfo("홍길동","010-100-2000","92-01-17");
		PhoneInfo ph2 = new PhoneInfo("김연아","010-300-4000");
		ph1.showInfo();
		ph2.showInfo();
		
		System.out.println("==========2단계==========");
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("\n선택하세요...");
			System.out.println("1. 데이터 입력");
			System.out.println("2. 프로그램 종료");
			System.out.println("선택: ");
			String choice = sc.nextLine();
			if(choice.equals("1")) {
				System.out.println("이름:");
				String name = sc.nextLine();
				System.out.println("전화번호");
				String phone = sc.nextLine();
				System.out.println("생년월일");
				String birth = sc.nextLine();
				PhoneInfo p = new PhoneInfo(name, phone, birth);
				p.showInfo();
			}else if(choice.equals("2")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
			
		}
	}
}

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
		System.out.println("\n======�Էµ� ���� ���=======");
		System.out.println("name: "+this.name);
		System.out.println("phone: "+this.phone);
		if(birth!=null)System.out.println("birth: "+this.birth);
	}
}

public class PhoneInfoTest_Hw2_��â�� {

	public static void main(String[] args) {
		System.out.println("==========1�ܰ�==========");
		PhoneInfo ph1 = new PhoneInfo("ȫ�浿","010-100-2000","92-01-17");
		PhoneInfo ph2 = new PhoneInfo("�迬��","010-300-4000");
		ph1.showInfo();
		ph2.showInfo();
		
		System.out.println("==========2�ܰ�==========");
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("\n�����ϼ���...");
			System.out.println("1. ������ �Է�");
			System.out.println("2. ���α׷� ����");
			System.out.println("����: ");
			String choice = sc.nextLine();
			if(choice.equals("1")) {
				System.out.println("�̸�:");
				String name = sc.nextLine();
				System.out.println("��ȭ��ȣ");
				String phone = sc.nextLine();
				System.out.println("�������");
				String birth = sc.nextLine();
				PhoneInfo p = new PhoneInfo(name, phone, birth);
				p.showInfo();
			}else if(choice.equals("2")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				continue;
			}
			
		}
	}
}

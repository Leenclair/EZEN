package day12;

import java.util.Scanner;

class NameCard{
	String name, phone, address, rank;
	
	NameCard(String p_name, String p_phone, String p_address, String p_rank){
		name = p_name;
		phone = p_phone;
		address = p_address;
		rank = p_rank;
	}
	
	public void toNameCard() {
		System.out.println("�̸� : "+name);
		System.out.println("��ȭ��ȣ : "+phone);
		System.out.println("ȸ���ּ� : "+address);
		System.out.println("���� : "+rank);
	}
	
}


public class NameCardTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸�, ��ȭ��ȣ, ȸ���ּ�, ������ �Է��ϼ���");
		String name = sc.nextLine();
		String phone = sc.nextLine();
		String address = sc.nextLine();
		String rank = sc.nextLine();
		
		NameCard namecard = new NameCard(name, phone, address, rank);
		namecard.toNameCard();
		
	}

}

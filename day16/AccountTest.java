package day16;

import java.util.Scanner;

class Account{
	String accId;
	int balance;
	
	Account(String accId, int balance){
		this.accId = accId;
		this.balance = balance;
	}
	
	public void display() {
		System.out.println("���¹�ȣ : "+accId);
		System.out.println("�����ܾ� : "+balance);
	}
}

class KBAccount extends Account{
	int limit;
	KBAccount(String accId, int balance, int limit){
		super(accId, balance);
		this.limit = limit; 
	}
	
	public void display() {
		super.display();
		System.out.println("��ü�ѵ� : " +limit);
	}
}



public class AccountTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���¹�ȣ, �ܾ�, ��ü�ѵ��� �Է��ϼ���");
		String accId = sc.nextLine();
		int balance = sc.nextInt();
		int limit = sc.nextInt();
		KBAccount kba = new KBAccount(accId, balance, limit);
		System.out.println("======================");
		kba.display();
		
		//KBAccount �迭 ����� 3����� �߰�, for���� ��� �޼��� ȣ��(Ȯ�� for�� �̿�)
		KBAccount[] kbaArr = new KBAccount[3];
		kbaArr[0] = new KBAccount("010-0001", 10000, 1000);
		kbaArr[1] = new KBAccount("010-0002", 20000, 2000);
		kbaArr[2] = new KBAccount("010-0003", 30000, 3000);
		
		System.out.println("=============for==============");
		
		for(int i=0; i<kbaArr.length;i++) {
			kbaArr[i].display();
		}
		
		System.out.println("===========Ȯ�� for===========");
		
		for(KBAccount kba2 : kbaArr) {
			kba2.display();
		}
	}
}

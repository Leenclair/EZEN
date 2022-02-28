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
		System.out.println("계좌번호 : "+accId);
		System.out.println("계좌잔액 : "+balance);
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
		System.out.println("이체한도 : " +limit);
	}
}



public class AccountTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("계좌번호, 잔액, 이체한도를 입력하세요");
		String accId = sc.nextLine();
		int balance = sc.nextInt();
		int limit = sc.nextInt();
		KBAccount kba = new KBAccount(accId, balance, limit);
		System.out.println("======================");
		kba.display();
		
		//KBAccount 배열 만들고 3개요소 추가, for에서 출력 메서드 호출(확장 for도 이용)
		KBAccount[] kbaArr = new KBAccount[3];
		kbaArr[0] = new KBAccount("010-0001", 10000, 1000);
		kbaArr[1] = new KBAccount("010-0002", 20000, 2000);
		kbaArr[2] = new KBAccount("010-0003", 30000, 3000);
		
		System.out.println("=============for==============");
		
		for(int i=0; i<kbaArr.length;i++) {
			kbaArr[i].display();
		}
		
		System.out.println("===========확장 for===========");
		
		for(KBAccount kba2 : kbaArr) {
			kba2.display();
		}
	}
}

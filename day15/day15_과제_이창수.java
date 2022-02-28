package day15;

import java.util.Scanner;

class Account{
	protected String accId; //계좌번호
	protected int balance; //잔액
	
	public String getAccId() {
		return accId;
	}

	public void setAccId(String accId) {
		this.accId = accId;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
}

class KBAccount extends Account{
	private int transferlimit;

	KBAccount(String accId, int balance, int transferlimit) {
		this.accId = accId;
		this.balance = balance;
		this.transferlimit = transferlimit;
	}

	public int getTransferlimit() {
		return transferlimit;
	}

	public void setTransferlimit(int transferlimit) {
		this.transferlimit = transferlimit;
	}
	
	public void showInfo() {
		System.out.println("========================");
		System.out.println("계좌번호"+this.accId);
		System.out.println("계좌잔액"+this.balance);
		System.out.println("이체한도"+this.transferlimit);
	}
}


public class day15_과제_이창수 {

	public static void main(String[] args) {
		System.out.println("계좐번호, 잔액, 이체한도를 입력하세요");
		Scanner sc = new Scanner(System.in);
		KBAccount k = new KBAccount(sc.nextLine(),sc.nextInt(),sc.nextInt());
		k.showInfo();
	}

}

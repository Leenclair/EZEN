package day15;

import java.util.Scanner;

class Account{
	protected String accId; //���¹�ȣ
	protected int balance; //�ܾ�
	
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
		System.out.println("���¹�ȣ"+this.accId);
		System.out.println("�����ܾ�"+this.balance);
		System.out.println("��ü�ѵ�"+this.transferlimit);
	}
}


public class day15_����_��â�� {

	public static void main(String[] args) {
		System.out.println("����ȣ, �ܾ�, ��ü�ѵ��� �Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		KBAccount k = new KBAccount(sc.nextLine(),sc.nextInt(),sc.nextInt());
		k.showInfo();
	}

}

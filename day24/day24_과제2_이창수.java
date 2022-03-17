package day24;
import java.util.ArrayList;
import java.util.Scanner;

class Account{
	protected String noID;
	protected int balance;
	protected String name;
	protected int money; //�Ա�

	Account(String noID, int money, String name){
		this.noID = noID;
		this.balance = money;
		this.name = name;
	}

	public String getNoID() {
		return noID;
	}
	
	void deposit(int money) {
		balance += money;
	}

	void withdraw(int money) {
		balance -= money;
	}

	void showInfo() {
		System.out.println("����ID: "+noID);
		System.out.println("�ܾ�: "+balance);
		System.out.println("���̸�: "+name);
	}
}

class NormalAccount extends Account{
	double rate;

	NormalAccount(String noID, int money, String name, double rate){
		super(noID, money,name);
		this.rate = rate/100;
	}

	void deposit(int money) {
		this.money = money;
		balance += money+money*rate;
	}

	void showInfo() {
		super.showInfo();
		System.out.println("������: "+(int)(rate*100)+"%");
	}
}

interface special{
	public static final int CLASSA = 3;
	public static final int CLASSB = 2;
	public static final int CLASSC = 1;
}

class HighCreditAccount extends NormalAccount implements special{
	

	HighCreditAccount(String noID, int money, String name, double rate){
		super(noID, money,name, rate);
	}

	void showInfo() {
		super.showInfo();
		System.out.println("Ư��������: ");
	}
}

public class day24_����2_��â�� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Account> list = new ArrayList<>();

		while(true) {
			System.out.println("-----MENU-----");
			System.out.println("1. ���°���");
			System.out.println("2. ��   ��");
			System.out.println("3. ��   ��");
			System.out.println("4. �������� ��ü ���");
			System.out.println("5. ���α׷� ����");
			System.out.print("����: ");
			int type = sc.nextInt();
			sc.nextLine();
			
			switch(type){
			case 1:
				System.out.println("[������������]");
				System.out.println("1.���뿹�ݰ���");
				System.out.println("2.�ſ�ŷڰ���");
				System.out.print("����: ");
				int type2 = sc.nextInt();
				sc.nextLine();

				if(type2==1) {
					System.out.println("[���뿹�ݰ��� ����]");
					System.out.print("����ID: ");
					String id = sc.nextLine();
					System.out.print("�� ��: ");
					String name = sc.nextLine();
					System.out.print("�Աݾ�: ");
					int money = sc.nextInt();
					System.out.print("������: ");
					int rate = sc.nextInt();
					sc.nextLine();
					list.add(new NormalAccount(id, money, name,rate));
				}else if(type2==2) {
					System.out.println("[�ſ�ŷڰ��� ����]");
					System.out.print("����ID: ");
					String id = sc.nextLine();
					System.out.print("�� ��: ");
					String name = sc.nextLine();
					System.out.print("�Աݾ�: ");
					int money = sc.nextInt();
					System.out.print("������: ");
					int rate = sc.nextInt();
					sc.nextLine();
					list.add(new HighCreditAccount(id, money, name, rate));
					
					System.out.print("\n�ſ���<1toA, 2toB, 3toC>: ");
					int grade = sc.nextInt();
					sc.nextLine();
				}
				break;
			case 2:
				System.out.println("[��   ��]");
				System.out.print("����ID :");
				String id = sc.nextLine();
				System.out.print("�Աݾ�: ");
				int money = sc.nextInt();
				sc.nextLine();
				
				int i=0;
				for(i=0;i<list.size();i++) {
					if(id.equals(list.get(i).getNoID())) {
						list.get(i).deposit(money);
						System.out.println("�ԱݿϷ�");
						break;
					}
				}
				if(i==list.size()){
					System.out.println("��ȿ���� ���� ���̵��Դϴ�");
				}
				break;
			case 3:
				System.out.println("[��   ��]");
				System.out.print("����ID: ");
				String id2 = sc.nextLine();
				System.out.print("��ݾ�: ");
				int money2 = sc.nextInt();
				sc.nextLine();
				for(int j=0;j<list.size();j++) {
					if(id2.equals(list.get(j).getNoID())) {
						if(list.get(j).balance<money2) {
							System.out.println("�ܾ׺���");
							break;
						}
						list.get(j).withdraw(money2);
						System.out.println("��ݿϷ�");
					}
				}
				break;
			case 4:
				for(int k=0;k<list.size();k++) {
					System.out.println("=======================");
					list.get(k).showInfo();
				}
				break;
			case 5:
				System.out.println("�����մϴ�");
				return;

			}
		}
	}
}
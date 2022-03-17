package day24;
import java.util.ArrayList;
import java.util.Scanner;

class Account{
	protected String noID;
	protected int balance;
	protected String name;
	protected int money; //입금

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
		System.out.println("계좌ID: "+noID);
		System.out.println("잔액: "+balance);
		System.out.println("고객이름: "+name);
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
		System.out.println("이자율: "+(int)(rate*100)+"%");
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
		System.out.println("특별이자율: ");
	}
}

public class day24_과제2_이창수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Account> list = new ArrayList<>();

		while(true) {
			System.out.println("-----MENU-----");
			System.out.println("1. 계좌개설");
			System.out.println("2. 입   금");
			System.out.println("3. 출   금");
			System.out.println("4. 계좌정보 전체 출력");
			System.out.println("5. 프로그램 종료");
			System.out.print("선택: ");
			int type = sc.nextInt();
			sc.nextLine();
			
			switch(type){
			case 1:
				System.out.println("[계좌종류선택]");
				System.out.println("1.보통예금계좌");
				System.out.println("2.신용신뢰계좌");
				System.out.print("선택: ");
				int type2 = sc.nextInt();
				sc.nextLine();

				if(type2==1) {
					System.out.println("[보통예금계좌 개설]");
					System.out.print("계좌ID: ");
					String id = sc.nextLine();
					System.out.print("이 름: ");
					String name = sc.nextLine();
					System.out.print("입금액: ");
					int money = sc.nextInt();
					System.out.print("이자율: ");
					int rate = sc.nextInt();
					sc.nextLine();
					list.add(new NormalAccount(id, money, name,rate));
				}else if(type2==2) {
					System.out.println("[신용신뢰계좌 개설]");
					System.out.print("계좌ID: ");
					String id = sc.nextLine();
					System.out.print("이 름: ");
					String name = sc.nextLine();
					System.out.print("입금액: ");
					int money = sc.nextInt();
					System.out.print("이자율: ");
					int rate = sc.nextInt();
					sc.nextLine();
					list.add(new HighCreditAccount(id, money, name, rate));
					
					System.out.print("\n신용등급<1toA, 2toB, 3toC>: ");
					int grade = sc.nextInt();
					sc.nextLine();
				}
				break;
			case 2:
				System.out.println("[입   금]");
				System.out.print("계좌ID :");
				String id = sc.nextLine();
				System.out.print("입금액: ");
				int money = sc.nextInt();
				sc.nextLine();
				
				int i=0;
				for(i=0;i<list.size();i++) {
					if(id.equals(list.get(i).getNoID())) {
						list.get(i).deposit(money);
						System.out.println("입금완료");
						break;
					}
				}
				if(i==list.size()){
					System.out.println("유효하지 않은 아이디입니다");
				}
				break;
			case 3:
				System.out.println("[출   금]");
				System.out.print("계좌ID: ");
				String id2 = sc.nextLine();
				System.out.print("출금액: ");
				int money2 = sc.nextInt();
				sc.nextLine();
				for(int j=0;j<list.size();j++) {
					if(id2.equals(list.get(j).getNoID())) {
						if(list.get(j).balance<money2) {
							System.out.println("잔액부족");
							break;
						}
						list.get(j).withdraw(money2);
						System.out.println("출금완료");
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
				System.out.println("종료합니다");
				return;

			}
		}
	}
}
package day23.util;

import java.util.ArrayList;

/*
 * ��ȭ��ȣ ���� ���α׷�
 * Version 0.4
 * ���, ������ �̿�
 */

import java.util.Scanner;

class PhoneInfo {
	protected String name;
	protected String phoneNumber;
	PhoneInfo(String name, String phoneNumber) {
		this.name=name;
		this.phoneNumber=phoneNumber;
	}
	public String getName() {
		return name;
	}
	public void showPhoneInfo(){
		System.out.println("�̸�: "+name);
		System.out.println("��ȭ��ȣ: "+phoneNumber);
	}
}

class PhoneUnivInfo extends PhoneInfo{
	private String major;
	private int year;	
	
	public PhoneUnivInfo(String name, String phoneNumber, String major, 
			int year){
		super(name, phoneNumber);
		this.major=major;
		this.year=year;
	}
	
	public void showPhoneInfo()	{
		super.showPhoneInfo();
		System.out.println("����: "+major);
		System.out.println("�й�<����>: "+year);
	}
}

class PhoneCompanyInfo extends PhoneInfo{
	private String company;
	
	public PhoneCompanyInfo(String name, String phoneNumber, String company){
		super(name, phoneNumber);
		this.company=company;
	}
	
	public void showPhoneInfo(){
		super.showPhoneInfo();
		System.out.println("ȸ��: "+company);
	}
}

class PhoneBookManager2{
	Scanner sc=new Scanner(System.in);
	private ArrayList<PhoneInfo> list = new ArrayList<PhoneInfo>();
	
	private PhoneInfo readFriendInfo()	{
		System.out.print("�̸�: ");
		String name=sc.nextLine();
		System.out.print("��ȭ��ȣ: ");
		String phone=sc.nextLine();

		return new PhoneInfo(name, phone);
	}
	
	private PhoneInfo readUnivFriendInfo(){
		System.out.print("�̸�: ");
		String name=sc.nextLine();
		System.out.print("��ȭ��ȣ: ");
		String phone=sc.nextLine();
		System.out.print("����: ");
		String major=sc.nextLine();
		System.out.print("�й�(����): ");
		int year=sc.nextInt();
		sc.nextLine();

		return new PhoneUnivInfo(name, phone, major, year);
	}
	
	private PhoneInfo readCompanyFriendInfo()	{
		System.out.print("�̸�: ");
		String name=sc.nextLine();
		System.out.print("��ȭ��ȣ: ");
		String phone=sc.nextLine();
		System.out.print("ȸ��: ");
		String company=sc.nextLine();

		return new PhoneCompanyInfo(name, phone, company);	
	}	
	
	public void inputData()	{
		System.out.println("������ �Է��� �����մϴ�..");
		System.out.println("1. �Ϲ�, 2. ����, 3. ȸ��");
		System.out.print("����>> ");
		int choice=sc.nextInt();
		sc.nextLine();
		
		switch(choice){
			case 1:
				list.add(readFriendInfo());
				break;
			case 2:
				list.add(readUnivFriendInfo());
				break;
			case 3:
				list.add(readCompanyFriendInfo());
				break;
			default:
				System.out.println("�߸� �����Ͽ����ϴ�!!\n");
				return;
		}
		
		System.out.println("������ �Է��� �Ϸ�Ǿ����ϴ�. \n");		
	}

	public void searchData()	{
		if(list.isEmpty()) {
			System.out.println("������ ����");
			return;
		}
		
		System.out.println("������ �˻��� �����մϴ�..");

		System.out.print("�̸�: ");
		String name=sc.nextLine();

		for(int i=0;i<list.size();i++) {
			if(list.get(i).getName().equals(name)) {
				list.get(i).showPhoneInfo();
			}
		}

		System.out.println("������ �˻��� �Ϸ�Ǿ����ϴ�. \n");
		
	}

	public void deleteData()	{
		System.out.println("������ ������ �����մϴ�..");
		
		System.out.print("�̸�: ");
		String name=sc.nextLine();
		if(list.isEmpty()) {
			System.out.println("������ �����Ͱ� �����ϴ�");
		}else {
			for(int i=0;i<list.size();i++) {
				if(list.get(i).getName().equals(name)) {
					list.remove(i);
				}
			}
		}
		
		System.out.println("������ ������ �Ϸ�Ǿ����ϴ�. \n");
	}
	
	public void queryAllData()	{
		if (list.isEmpty()){
			System.out.println("�����Ͱ� �������� �ʽ��ϴ�.\n\n");
			return;
		}

		System.out.println("----------��ü ������ ��ȸ----------");
		for(int i=0; i<list.size(); i++){
			PhoneInfo p = list.get(i);
			p.showPhoneInfo();
			System.out.println();
		}//for
		
		System.out.println("--------------------------------------- \n");
	}

	public  void showMenu()	{
		System.out.println("�����ϼ���...");
		System.out.println("1. ������ �Է�");
		System.out.println("2. ��ü ������ ��ȸ");
		System.out.println("3. ������ �˻�");
		System.out.println("4. ������ ����");
		System.out.println("5. ���α׷� ����");
		System.out.print("����: ");
	}
}


class day23_����1_��â��{	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		PhoneBookManager2 manager=new PhoneBookManager2();
		int choice=0;
		
		while(true)	{
			manager.showMenu();
			choice=sc.nextInt();
			sc.nextLine();	
			
			switch(choice){
				case 1:
					manager.inputData();
					break;
				case 2:
					manager.queryAllData();
					break;
				case 3:
					manager.searchData();
					break;
				case 4:
					manager.deleteData();
					break;				
				case 5:
					System.out.println("���α׷��� �����մϴ�.");
					return;
				default:
					System.out.println("�߸� �����Ͽ����ϴ�. �ٽ� �����ϼ���\n");
					continue;
			}
		}//while

	}
}
package day23.util;

import java.util.ArrayList;

/*
 * 전화번호 관리 프로그램
 * Version 0.4
 * 상속, 다형성 이용
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
		System.out.println("이름: "+name);
		System.out.println("전화번호: "+phoneNumber);
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
		System.out.println("전공: "+major);
		System.out.println("학번<연도>: "+year);
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
		System.out.println("회사: "+company);
	}
}

class PhoneBookManager2{
	Scanner sc=new Scanner(System.in);
	private ArrayList<PhoneInfo> list = new ArrayList<PhoneInfo>();
	
	private PhoneInfo readFriendInfo()	{
		System.out.print("이름: ");
		String name=sc.nextLine();
		System.out.print("전화번호: ");
		String phone=sc.nextLine();

		return new PhoneInfo(name, phone);
	}
	
	private PhoneInfo readUnivFriendInfo(){
		System.out.print("이름: ");
		String name=sc.nextLine();
		System.out.print("전화번호: ");
		String phone=sc.nextLine();
		System.out.print("전공: ");
		String major=sc.nextLine();
		System.out.print("학번(연도): ");
		int year=sc.nextInt();
		sc.nextLine();

		return new PhoneUnivInfo(name, phone, major, year);
	}
	
	private PhoneInfo readCompanyFriendInfo()	{
		System.out.print("이름: ");
		String name=sc.nextLine();
		System.out.print("전화번호: ");
		String phone=sc.nextLine();
		System.out.print("회사: ");
		String company=sc.nextLine();

		return new PhoneCompanyInfo(name, phone, company);	
	}	
	
	public void inputData()	{
		System.out.println("데이터 입력을 시작합니다..");
		System.out.println("1. 일반, 2. 대학, 3. 회사");
		System.out.print("선택>> ");
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
				System.out.println("잘못 선택하였습니다!!\n");
				return;
		}
		
		System.out.println("데이터 입력이 완료되었습니다. \n");		
	}

	public void searchData()	{
		if(list.isEmpty()) {
			System.out.println("데이터 없음");
			return;
		}
		
		System.out.println("데이터 검색을 시작합니다..");

		System.out.print("이름: ");
		String name=sc.nextLine();

		for(int i=0;i<list.size();i++) {
			if(list.get(i).getName().equals(name)) {
				list.get(i).showPhoneInfo();
			}
		}

		System.out.println("데이터 검색이 완료되었습니다. \n");
		
	}

	public void deleteData()	{
		System.out.println("데이터 삭제를 시작합니다..");
		
		System.out.print("이름: ");
		String name=sc.nextLine();
		if(list.isEmpty()) {
			System.out.println("삭제할 데이터가 없습니다");
		}else {
			for(int i=0;i<list.size();i++) {
				if(list.get(i).getName().equals(name)) {
					list.remove(i);
				}
			}
		}
		
		System.out.println("데이터 삭제가 완료되었습니다. \n");
	}
	
	public void queryAllData()	{
		if (list.isEmpty()){
			System.out.println("데이터가 존재하지 않습니다.\n\n");
			return;
		}

		System.out.println("----------전체 데이터 조회----------");
		for(int i=0; i<list.size(); i++){
			PhoneInfo p = list.get(i);
			p.showPhoneInfo();
			System.out.println();
		}//for
		
		System.out.println("--------------------------------------- \n");
	}

	public  void showMenu()	{
		System.out.println("선택하세요...");
		System.out.println("1. 데이터 입력");
		System.out.println("2. 전체 데이터 조회");
		System.out.println("3. 데이터 검색");
		System.out.println("4. 데이터 삭제");
		System.out.println("5. 프로그램 종료");
		System.out.print("선택: ");
	}
}


class day23_과제1_이창수{	
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
					System.out.println("프로그램을 종료합니다.");
					return;
				default:
					System.out.println("잘못 선택하였습니다. 다시 선택하세요\n");
					continue;
			}
		}//while

	}
}
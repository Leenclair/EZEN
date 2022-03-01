package day16;

import java.util.Scanner;

class Employee{
	protected String name;
	Employee(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
		
	public int findPay() {
		return 0;
	}	
}

class Permanent extends Employee{
	protected int salary;
	protected int bonus;
	
	Permanent(String name, int salary, int bonus){
		super(name);
		this.salary = salary;
		this.bonus = bonus;
	}
	

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	public int findPay() {
		return salary+bonus;
	}	
}

class Temporary extends Employee{
	protected int time;
	protected int pay;
	
	Temporary(String name, int time, int pay){
		super(name);
		this.time = time;
		this.pay = pay;
	}
	
	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}
	
	public int findPay() {
		return time*pay;
	}	
}

public class day16_����_��â�� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������� - �����<P>, �ӽ���<T>�� �Է��ϼ���");
		String choice = sc.nextLine();
		
		if(choice.equalsIgnoreCase("P")) {
			System.out.println("�̸�, �⺻�޿�, ���ʽ��� �Է��ϼ���");
			Permanent p = new Permanent(sc.nextLine(),sc.nextInt(),sc.nextInt());
			sc.nextLine();
			System.out.println("---------------");
			System.out.println("�������:�����");
			System.out.println("�̸�:"+p.getName());
			System.out.println("�޿�:"+p.findPay());
		}else if(choice.equalsIgnoreCase("T")) {
			System.out.println("�̸�, ���ѽð�, �ð���޿��� �Է��ϼ���");
			Temporary t = new Temporary(sc.nextLine(), sc.nextInt(),sc.nextInt());
			sc.nextLine();
			System.out.println("---------------");
			System.out.println("�������:�ӽ���");
			System.out.println("�̸�:"+t.getName());
			System.out.println("�޿�:"+t.findPay());
		}else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
		
	}
}

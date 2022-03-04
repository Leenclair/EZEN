package day18.abs;

import java.util.Scanner;

abstract class Employee{
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
	
	public abstract int findPay();
	public abstract String kind();
}

class Permanent extends Employee{
	protected int salary;
	
	Permanent(String name, int salary){
		super(name);
		this.salary = salary;
	}
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int findPay() {
		return salary;
	}
	public String kind() {
		return "�����";
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
	
	public String kind() {
		return "�ӽ���";
	}
}

class SalesPerson extends Permanent{
	private int earnings;
	private final double RATE = 0.15;
	
	public SalesPerson(String name, int salary, int earnings) {
		super(name, salary);
		this.earnings = earnings;
	}
	
	public int findPay() {
		return salary+(int)(earnings*RATE);
	}
	
	public String kind() {
		return "�Ǹ���";
	}
}

class EmManager{
	Scanner sc = new Scanner(System.in);
	Employee e = null;
	
	public void menuP() {
		System.out.println("�̸�, �⺻�޿��� �Է��ϼ���");
		String name = sc.nextLine();
		int salary = sc.nextInt();
		sc.nextLine();
		e = new Permanent(name, salary);
	}
	
	public void menuT() {
		System.out.println("�̸�, ���ѽð�, �ð���޿��� �Է��ϼ���");
		String name = sc.nextLine();
		int time = sc.nextInt();
		int pay = sc.nextInt();
		sc.nextLine();
		e = new Temporary(name, time, pay);
	}
	
	public void menuS() {
		System.out.println("�̸�, �⺻�޿�, �Ǹż����� �Է��ϼ���");
		String name = sc.nextLine();
		int salary = sc.nextInt();
		int earnings = sc.nextInt();
		sc.nextLine();
		e = new SalesPerson(name, salary, earnings);
	}
	
	public void showSalary() {
		System.out.println("������� : "+e.kind());
		System.out.println("�̸� : "+e.name);
		System.out.println("�޿� : "+e.findPay());
	}
}

public class AbstractMethodTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmManager em = new EmManager();
		
		while(true) {
			System.out.println("������� - �����<P>, �ӽ���<T>, �Ǹ���<S>�� �Է��ϼ���");
			String com = sc.nextLine();
			
			if(com.equalsIgnoreCase("p")) {
				em.menuP();
			}else if(com.equalsIgnoreCase("t")) {
				em.menuT();
			}else if(com.equalsIgnoreCase("s")) {
				em.menuS();
			}else {
				System.out.println("�ٽ� �Է����ּ���");
				return;
			}
			System.out.println("==========================");
			em.showSalary();
		}
		
	}

}
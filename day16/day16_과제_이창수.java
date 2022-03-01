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

public class day16_과제_이창수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("고용형태 - 고용직<P>, 임시직<T>을 입력하세요");
		String choice = sc.nextLine();
		
		if(choice.equalsIgnoreCase("P")) {
			System.out.println("이름, 기본급여, 보너스를 입력하세요");
			Permanent p = new Permanent(sc.nextLine(),sc.nextInt(),sc.nextInt());
			sc.nextLine();
			System.out.println("---------------");
			System.out.println("고용형태:고용직");
			System.out.println("이름:"+p.getName());
			System.out.println("급여:"+p.findPay());
		}else if(choice.equalsIgnoreCase("T")) {
			System.out.println("이름, 일한시간, 시간당급여를 입력하세요");
			Temporary t = new Temporary(sc.nextLine(), sc.nextInt(),sc.nextInt());
			sc.nextLine();
			System.out.println("---------------");
			System.out.println("고용형태:임시직");
			System.out.println("이름:"+t.getName());
			System.out.println("급여:"+t.findPay());
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
	}
}

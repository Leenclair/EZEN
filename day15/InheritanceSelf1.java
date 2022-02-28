package day15;

import java.util.Scanner;

class Human{
	protected String name;
	protected int age;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
}

class Teacher extends Human{
	private String sub;
	
	public String getSub() {
		return sub;
	}
	
	public void setSub(String sub) {
		this.sub = sub;
	}//class

	public void work() {
		System.out.println("����ģ��");
	}
}

class Programmer extends Human{
	private int career;

	public int getCareer() {
		return career;
	}

	public void setCareer(int career) {
		this.career = career;
	}
	
	public void work() {
		System.out.println("���α׷��� �Ѵ�");
	}
}
	


public class InheritanceSelf1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Teacher t = new Teacher();
		Programmer p = new Programmer();
		
		System.out.println("�̸�, ����, ������ �Է��ϼ���");
		String name = sc.nextLine();
		int age = sc.nextInt();
		String sub = sc.nextLine();//�̰� �� �ȹ޴��� �ڵ帮���ض� ����
		
		System.out.println("===========");
		
		t.setName(name);
		t.setAge(age);
		t.setSub(sub);
		
		System.out.println("�̸�:"+t.getName());
		System.out.println("����:"+t.getAge());
		System.out.println("����:"+t.getSub());
		t.work();
		
		System.out.println("\n�̸�, ����, ���߰���� �Է�");
		name=sc.nextLine();
		age=sc.nextInt();
		int car=sc.nextInt();
		System.out.println("======================");
		
		p.setName(name);
		p.setAge(age);
		p.setCareer(car);
		
		System.out.println("�̸�: "+p.getName());
		System.out.println("����: "+p.getAge());
		System.out.println("���߰��: "+p.getCareer());
		p.work();
		
		
		}
	}


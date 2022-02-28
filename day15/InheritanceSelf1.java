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
		System.out.println("가르친다");
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
		System.out.println("프로그래밍 한다");
	}
}
	


public class InheritanceSelf1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Teacher t = new Teacher();
		Programmer p = new Programmer();
		
		System.out.println("이름, 나이, 과목을 입력하세요");
		String name = sc.nextLine();
		int age = sc.nextInt();
		String sub = sc.nextLine();//이거 왜 안받는지 코드리뷰해라 흑흑
		
		System.out.println("===========");
		
		t.setName(name);
		t.setAge(age);
		t.setSub(sub);
		
		System.out.println("이름:"+t.getName());
		System.out.println("나이:"+t.getAge());
		System.out.println("과목:"+t.getSub());
		t.work();
		
		System.out.println("\n이름, 나이, 개발경력을 입력");
		name=sc.nextLine();
		age=sc.nextInt();
		int car=sc.nextInt();
		System.out.println("======================");
		
		p.setName(name);
		p.setAge(age);
		p.setCareer(car);
		
		System.out.println("이름: "+p.getName());
		System.out.println("나이: "+p.getAge());
		System.out.println("개발경력: "+p.getCareer());
		p.work();
		
		
		}
	}


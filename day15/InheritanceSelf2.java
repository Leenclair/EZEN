package day15;

import java.util.Scanner;

class Person1{
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

class Student1 extends Person1{
	protected String idNo;

	public String getIdNo() {
		return idNo;
	}

	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}
	
	public void study() {
		System.out.println("공부한다");
	}
	
	
}

class Graduate1 extends Student1{
	protected String major;

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	public void writeThesis() {
		System.out.println("논문을 쓴다");
	}
}


public class InheritanceSelf2 {

	public static void main(String[] args) {
		Graduate1 g = new Graduate1();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름, 나이, 학번, 전공을 입력하세요");
		String name = sc.nextLine();
		int age = sc.nextInt();
		sc.nextLine();
		String idNo = sc.nextLine();
		String major = sc.nextLine();
		
		System.out.println("==========================");
		g.setName(name);
		g.setAge(age);
		g.setIdNo(idNo);
		g.setMajor(major);
		
		System.out.println("이름:"+g.getName());
		System.out.println("나이:"+g.getAge());
		System.out.println("학번:"+g.getIdNo());
		System.out.println("전공:"+g.getMajor());
		g.writeThesis();
		
	}

}
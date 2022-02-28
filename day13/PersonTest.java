package day13;

import java.util.Scanner;

class Person{
	//1.�������
	private String name;
	private String phone;
	private int age;
	
	//2. ������
	public Person(String name, String phone, int age){
		this.name = name;
		this.phone = phone;
		this.age = age;
	}
	//3. getter/setter
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	//4. �޼���
	public void showInfo() {
		System.out.println("�̸�:"+name);
		System.out.println("��ȭ��ȣ:"+phone);
		System.out.println("����:"+age+"\n");
	}
}

public class PersonTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸�, ��ȭ��ȣ, ���� �Է��ϼ���");
		
		Person person = new Person(sc.nextLine(),sc.nextLine(), sc.nextInt());
		person.showInfo();
		
		person.setName("��浿");
		person.setPhone("010-3000-4000");
		person.setAge(25);
		
		System.out.println("�̸�:"+person.getName());
		System.out.println("��ȭ��ȣ:"+person.getPhone());
		System.out.println("����:"+person.getAge()+"\n");
		
		
	}

}

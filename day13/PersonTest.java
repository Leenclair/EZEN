package day13;

import java.util.Scanner;

class Person{
	//1.멤버변수
	private String name;
	private String phone;
	private int age;
	
	//2. 생성자
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
	
	//4. 메서드
	public void showInfo() {
		System.out.println("이름:"+name);
		System.out.println("전화번호:"+phone);
		System.out.println("나이:"+age+"\n");
	}
}

public class PersonTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 전화번호, 나이 입력하세요");
		
		Person person = new Person(sc.nextLine(),sc.nextLine(), sc.nextInt());
		person.showInfo();
		
		person.setName("김길동");
		person.setPhone("010-3000-4000");
		person.setAge(25);
		
		System.out.println("이름:"+person.getName());
		System.out.println("전화번호:"+person.getPhone());
		System.out.println("나이:"+person.getAge()+"\n");
		
		
	}

}

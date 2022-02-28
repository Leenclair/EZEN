package day13;

import java.util.Scanner;

class Programmer{
	private String name;
	private String language;
	private int career;
	
	/*
	  this
	  - 자기 자신을 가리키는 this
	  - 인스턴스 자신을 가리키는 참조변수
	  - 인스턴스의 주소가 저장됨
	  - 클래스를 디자인할 때 사용, 객체 생성 후 사용하는 것이 아님
	  - 객체를 생성하기 전 단계의 그 주소를 this라 칭하고, 할당되는 순간
	  	this에게 할당된 메모리의 주소값(참조값)을 넘겨줌
	  
	*/
	Programmer(String name, String language, int career){
		this.name = name;
		this.language = language;
		this.career = career;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getLanguage() {
		return language;
	}
	
	public void setLanguage(String language) {
		this.language = language;
	}

	public int getCareer() {
		return career;
	}
	
	public void setCareer(int career) {
		this.career = career;
	}
	
	public void work(){
		System.out.println("프로그래밍을 합니다.");
	}
	
}

public class ProgrammerTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 개발언어, 개발경력을 입력하세요");
		
		Programmer programmer = new Programmer(sc.nextLine(), sc.nextLine(),sc.nextInt());
		
		System.out.println("이름:"+programmer.getName()+"\n개발언어:"+ programmer.getLanguage()+"\n개발경력:"+programmer.getCareer()+"년");
		programmer.work();
	}

}

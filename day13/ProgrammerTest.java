package day13;

import java.util.Scanner;

class Programmer{
	private String name;
	private String language;
	private int career;
	
	/*
	  this
	  - �ڱ� �ڽ��� ����Ű�� this
	  - �ν��Ͻ� �ڽ��� ����Ű�� ��������
	  - �ν��Ͻ��� �ּҰ� �����
	  - Ŭ������ �������� �� ���, ��ü ���� �� ����ϴ� ���� �ƴ�
	  - ��ü�� �����ϱ� �� �ܰ��� �� �ּҸ� this�� Ī�ϰ�, �Ҵ�Ǵ� ����
	  	this���� �Ҵ�� �޸��� �ּҰ�(������)�� �Ѱ���
	  
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
		System.out.println("���α׷����� �մϴ�.");
	}
	
}

public class ProgrammerTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸�, ���߾��, ���߰���� �Է��ϼ���");
		
		Programmer programmer = new Programmer(sc.nextLine(), sc.nextLine(),sc.nextInt());
		
		System.out.println("�̸�:"+programmer.getName()+"\n���߾��:"+ programmer.getLanguage()+"\n���߰��:"+programmer.getCareer()+"��");
		programmer.work();
	}

}

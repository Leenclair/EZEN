package day13;

import java.util.Scanner;

class Temporary{
	private String name;
	private int time;
	private int pay;
	
	Temporary(String name, int time, int pay){
		this.name = name;
		this.time = time;
		this.pay = pay;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
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
	
	public int wage() {
		return time*pay;
	}
	
}
public class TemporaryTest {

	public static void main(String[] args) {
		System.out.println("이름, 일한시간, 시간당 급여를 입력하세요");
		Scanner sc = new Scanner(System.in);
		
		Temporary tem = new Temporary(sc.nextLine(),sc.nextInt(),sc.nextInt());
		System.out.println("고용형태: 임시직");
		System.out.println("이름:"+tem.getName());
		System.out.println("급여:"+tem.wage());
		
	}

}

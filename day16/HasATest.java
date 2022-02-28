package day16;

import java.util.Scanner;

class Points2{
	int x;
	int y;

	Points2(int x, int y){
		this.x = x;
		this.y = y;
	}
}
//포함관계 이용 - 재사용하려는 클래스를 멤버변수로 포함시킨다
class Circle2{
	private Points2 p;
	private int r;
	
	Circle2(Points2 p, int r){
		this.p = p;
		this.r = r;
	}
	
	public void printInfo() {
		System.out.println("x="+ p.x);//참조변수.변수
		System.out.println("y="+ p.y);
		System.out.println("r="+r+"\n");
	}
}

public class HasATest {
	public static void main(String[] args) {
		Circle2 c = new Circle2(new Points2(10,20),5);
		c.printInfo();
		
		int n=7;
		Points2 p = new Points2(30,40); 
		Circle2 c2 = new Circle2(p, n);
		
		c2.printInfo();
	}
}
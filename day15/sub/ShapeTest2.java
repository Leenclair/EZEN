package day15.sub;

import java.util.Scanner;

class Shape1{
	Shape1(){
		
	}
	
	public double findArea(){
		return 0;
	}
}

class Circle1 extends Shape1{
	protected double r;
	
	Circle1(double r){
		this.r = r;
	}
	
	public double findArea() {
		return r*r*3.14;
	}
}

class Rectangle1 extends Shape1{
	protected double x;
	protected double y;
	
	Rectangle1(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public double findArea() {
		return x*y;
	}
	
}
public class ShapeTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("가로, 세로, 반지름을 입력하세요");
		int x = sc.nextInt();
		int y = sc.nextInt();
		double r = sc.nextDouble();
		
		Rectangle1 rec = new Rectangle1(x,y);
		System.out.println(rec.findArea());
		Circle1 c = new Circle1(r);
		System.out.println(c.findArea());
	}

}

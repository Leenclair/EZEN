package day19;

import java.util.Scanner;

abstract class Shape2{
	public abstract double findArea();
}

class Circle2 extends Shape2{
	private int r;
	
	Circle2(int r){
		this.r = r;
	}
	
	public double findArea() {
		return r*r*3.14; 
	}
}

class Rectangle2 extends Shape2{
	private int w;
	private int h;
	
	Rectangle2(int w, int h){
		this.w = w;
		this.h = h;
	}
	
	public double findArea() {
		return (w*h);
	}
}

public class InterfaceSelf2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Shape2 sh = null;
		
		while(true) {
			System.out.println("도형을 선택하세요(1.원, 2.사각형)");
			int type = sc.nextInt();
			
			if(type==1) {
				System.out.println("반지름 입력!");
				int r = sc.nextInt();
				sh = new Circle2(r);
			}else if(type==2) {
				System.out.println("가로, 세로 입력!");
				int w = sc.nextInt();
				int h = sc.nextInt();
				sh = new Rectangle2(w,h);
			}
			
			System.out.println("면적 : "+sh.findArea());
		}
	}
}
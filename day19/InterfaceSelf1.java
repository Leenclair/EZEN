package day19;

import java.util.Scanner;

interface Shape{
	public abstract double findArea();
}

class Circle implements Shape{
	private int r;
	
	Circle(int r){
		this.r = r;
	}
	
	public double findArea() {
		return r*r*3.14; 
	}
}

class Rectangle implements Shape{
	private int w;
	private int h;
	
	Rectangle(int w, int h){
		this.w = w;
		this.h = h;
	}
	
	public double findArea() {
		return (w*h);
	}
}

public class InterfaceSelf1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Shape sh = null;
		
		while(true) {
			System.out.println("도형을 선택하세요(1.원, 2.사각형)");
			int type = sc.nextInt();
			
			if(type==1) {
				System.out.println("반지름 입력!");
				int r = sc.nextInt();
				sh = new Circle(r);
			}else if(type==2) {
				System.out.println("가로, 세로 입력!");
				int w = sc.nextInt();
				int h = sc.nextInt();
				sh = new Rectangle(w,h);
			}
			
			System.out.println("면적 : "+sh.findArea());
		}
	}
}
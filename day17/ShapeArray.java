package day17;

import java.util.Scanner;

class Shape2{
	public double findArea() {
		return 0;
	}
	
	public String kind() {
		return "������ ����";
	}
}

class Circle2 extends Shape2{
	private int r;
	final double PI = 3.1415;
	
	Circle2(int r){
		this.r = r;
	}
	
	public double findArea() {
		return PI*r*r;
	}
	
	public String kind() {
		return "��";
	}
}

class Rect extends Shape2{
	private int w,h;
	
	Rect(int w, int h){
		this.w=w;
		this.h=h;
	}
	
	public double findArea() {
		return w*h;
	}

	public String kind() {
		return "�簢��";
	}
}

public class ShapeArray {
	public static void main(String[] args) {
		final int MAX_COUNT=100;
		Shape2[] sArr = new Shape2[MAX_COUNT];
		int idx=0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1.�� 2.�簢�� 3.���� 4.����");
			int type=sc.nextInt();
			
			switch(type) {
				case 1:
					System.out.print("r = ");
					int r = sc.nextInt();
					sArr[idx++] = new Circle2(r);
				break;
				case 2:
					System.out.print("w = ");
					int w = sc.nextInt();
					System.out.print("h = ");
					int h = sc.nextInt();
					sArr[idx++] = new Rect(w, h);
				break;
				case 3:
					for(int i=0;i<idx;i++) {
					double area=sArr[i].findArea();
					System.out.println(sArr[i].kind()+"�� ����:"+area);
				}
				break;
				case 4:
					System.out.println("������!");
					return;
				default:
					System.out.println("�߸� �Է�!\n");
					continue;
			}
		}//while
		
	}

}
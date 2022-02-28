package day12;

import java.util.Scanner;

class Rectangle1{
	int width;
	int height;
	
	Rectangle1(int p_width, int p_height){
		width=p_width;
		height=p_height;
	}

	public int findArea() {
		return width*height;
	}
	
	public int findRound() {
		return (width+height)*2;
	}
}

public class RectangleDesign {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�簢���� ����, ���θ� �Է��ϼ���");
		int width = sc.nextInt();
		int height = sc.nextInt();
		
		Rectangle1 rec = new Rectangle1(width, height);
		int area = rec.findArea();
		int round = rec.findRound();
		
		System.out.println("�簢���� ���� : "+area);
		System.out.println("�簢���� �ѷ� : "+round);
	}

}

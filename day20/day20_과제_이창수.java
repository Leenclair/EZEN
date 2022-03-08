package day20;

abstract class Shape{
	private Point p;

	Shape(){
		this(new Point(0,0));
	}
	Shape(Point p){
		this.p = p;
	}
	Point getP() {
		return p;
	}
	void setP(Point p) {
		this.p = p;
	}
	
	abstract double calcArea();//������ ������ ����ؼ� ��ȯ�ϴ� �޼���
}

class Point{
	private int x;
	private int y;
	Point(){
		this(0,0);
	}
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	public String findInfo() {
		return "["+x+","+y+"]";
	}
}

class Rect extends Shape{
	private int width;
	private int height;

	Rect(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	public double calcArea() {
		return width*height;
	}
	
	public boolean isSquare() {
		if(width==height) {
			return true;
		}else {
			return false;
		}
	}
}

class Circle extends Shape{
	private double r;
	
	Circle(double r){
		this.r = r;
	}
	
	public double calcArea() {
		return r*r*3.14;
	}
}



public class day20_����_��â�� {
	public static double sumArea(Shape[] arr) {
		double sum=0;
		for(int i=0;i<arr.length;i++) {
			sum += arr[i].calcArea();
		}
		return sum;
	}
	public static void main(String[] args) {
		Shape[] arr = {new Circle(5.2), new Rect(3,4), new Circle(1)};
		System.out.println("������ ��"+sumArea(arr));
	}
}
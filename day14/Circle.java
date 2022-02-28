package day14;

public class Circle {

	private int radius;	// 클래스의 맴버변수(필드), 반지름
	
	public Circle(int radius) {
		this.radius=radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public double findArea() {	// 클래스의 함수, 메소드()
		double area = radius*radius*3.14;
		return area;
	}
	
	public double findGirth() {	// 매개변수를 받아서 가공해도되지만, 필드를 사용 할 수도있다.
		double girth = 2*radius*3.14;
		return girth;
	}
	
}

package day14;

public class Circle {

	private int radius;	// Ŭ������ �ɹ�����(�ʵ�), ������
	
	public Circle(int radius) {
		this.radius=radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public double findArea() {	// Ŭ������ �Լ�, �޼ҵ�()
		double area = radius*radius*3.14;
		return area;
	}
	
	public double findGirth() {	// �Ű������� �޾Ƽ� �����ص�������, �ʵ带 ��� �� �����ִ�.
		double girth = 2*radius*3.14;
		return girth;
	}
	
}

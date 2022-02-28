package day12;

public class Rectangle {
	int width=0;
	int length=0;
	
	public int area() {
		int area = width*length;
		return area;
	}
	
	public int round() {
		int round = (width+length)*2;
		return round;
	}
	
}

package day16;

class Point{
	protected int x, y;
	
	Point(int x, int y){
		this.x= x;
		this.y=y;
	}
	
	public String findLocation() {
		return "x="+x+", y="+y;
	}
}

class Point3D extends Point{
	private int z;
	
	Point3D(int x, int y, int z) {
		super(x, y);
		/*
		  super() - 부모 생성자 호출
		  
		  부모 생성자가 매개변수를 가지고 있다면 자식은 부모의 생성자에게 매개변수를 넣어줘야 함
		  
		  모든 클래스의 생성자 첫줄에는 생성자를 호출해야 한다
		  그렇지 않으면 컴파일러가 자동적으로 super()를 생성자의 첫줄에 넣어준다
		 */
		this.z = z;
	}
	
	//오버라이딩 메서드
	public String findLocation() {
		return super.findLocation()+ ", z="+z; //부모 메서드 호출
	}
}

public class SuperTest {
	public static void main(String[] args) {
		Point3D p = new Point3D(10,20,30);
		String res = p.findLocation();
		System.out.println("3차원 점의 좌표:"+res);
	}
}

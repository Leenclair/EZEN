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
		  super() - �θ� ������ ȣ��
		  
		  �θ� �����ڰ� �Ű������� ������ �ִٸ� �ڽ��� �θ��� �����ڿ��� �Ű������� �־���� ��
		  
		  ��� Ŭ������ ������ ù�ٿ��� �����ڸ� ȣ���ؾ� �Ѵ�
		  �׷��� ������ �����Ϸ��� �ڵ������� super()�� �������� ù�ٿ� �־��ش�
		 */
		this.z = z;
	}
	
	//�������̵� �޼���
	public String findLocation() {
		return super.findLocation()+ ", z="+z; //�θ� �޼��� ȣ��
	}
}

public class SuperTest {
	public static void main(String[] args) {
		Point3D p = new Point3D(10,20,30);
		String res = p.findLocation();
		System.out.println("3���� ���� ��ǥ:"+res);
	}
}

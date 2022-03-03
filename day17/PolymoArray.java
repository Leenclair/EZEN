package day17;

class Unit{
	protected int x,y; //���� ��ġ

	public void move(int x, int y) {
		System.out.println("�̵� �޼���");
	}
	
	public void stop() {
		System.out.println("���� �޼���");
	}
}

class Marine extends Unit{
	public void move(int x, int y) {
		this.x=x;
		this.y=y;
		
		System.out.println("������ "+x+", "+y+"��ġ�� �̵��Ѵ�");
	}
	
	public void stimPack() {
		System.out.println("�������� ����Ѵ�");
	}
}

class Tank extends Unit{
	public void move(int x, int y) {
		this.x=x;
		this.y=y;
		
		System.out.println("��ũ�� "+x+", "+y+"��ġ�� �̵��Ѵ�");
	}
	
	public void changeMode() {
		System.out.println("���ݸ��� ��ȯ�Ѵ�");
	}
}

class Dropship extends Unit{
	public void move(int x, int y) {
		this.x=x;
		this.y=y;
		
		System.out.println("���ۼ��� ��ġ�� "+x+", "+y+"��ġ�� �̵��Ѵ�");
	}
	public void load() {
		System.out.println("���õ� ����� �¿��");
	}
	public void unload() {
		System.out.println("���õ� ����� ������");
	}
}

public class PolymoArray {
	public static void main(String[] args) {
		//Unit �迭 �����, ��� 4�� �ְ� move()�޼��� ȣ�� - for, Ȯ��for
		Unit[] uArr = new Unit[4];
		uArr[0] = new Marine();
		uArr[1] = new Tank();
		uArr[2] = new Dropship();
		uArr[3] = new Marine();
		
		for(int i=0;i<uArr.length;i++) {
			uArr[i].move(1, 1);
		}
		
		for(Unit u : uArr) {
			u.move(2, 2);
		}
	}

}

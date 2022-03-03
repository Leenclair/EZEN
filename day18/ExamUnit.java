package day18;

abstract class Unit{
	protected int x,y; //���� ��ġ

	public abstract void move(int x, int y) ;
	
	public void stop() {
		System.out.println("���� ��ġ�� �����Ѵ�");
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

public class ExamUnit {
	public static void main(String[] args) {
		/*
		  Unit �迭 �����, ��� 4�� �ְ�
		  [1] �������̵� �޼��� ȣ��
		  [2] �ڽĸ��� �޼��� ȣ��
		  
		  for, Ȯ��for �̿�
		 */
		
		Unit[] arr = new Unit[4];
		arr[0] = new Marine();
		arr[1] = new Tank();
		arr[2] = new Dropship();
		arr[3] = new Marine();
		//arr[3] = new Unit(); //error
		
		System.out.println("=====�������̵� �޼��� ȣ��=====");
		for(int i=0;i<arr.length;i++) {
			arr[i].move(1, 1);
		}
		
		System.out.println("=====Ȯ�� for=====");
		for(Unit u : arr) {
			u.move(2, 2);
		}
		
		
		System.out.println("=====�ڽĸ��� �޼��� ȣ��=====");
		for(int i=0;i<arr.length;i++) {
			if(arr[i] instanceof Marine) {
				Marine m = (Marine)arr[i];
				m.stimPack();
			}else if(arr[i] instanceof Tank) {
				Tank t = (Tank)arr[i];
				t.changeMode();
			}else if(arr[i] instanceof Dropship) {
				Dropship d = (Dropship)arr[i];
				d.load();
			}
		}
		System.out.println("=====Ȯ�� for=====");
		for(Unit u : arr) {
			if(u instanceof Marine) {
				Marine m = (Marine)u;
				m.stimPack();
			}else if(u instanceof Tank) {
				Tank t = (Tank)u;
				t.changeMode();
			}else if(u instanceof Dropship) {
				Dropship d = (Dropship)u;
				d.load();
			}			
		}
	}
}

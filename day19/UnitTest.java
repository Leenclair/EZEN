package day19;

interface Attackable{
	/**
	 * ������ ����� �����ϴ� ���
	 * /@param unit
	 */
	public abstract void attack(Unit unit);
}

interface Movable{
	/**
	 * ������ ��ġ�� �̵��ϴ� ���
	 * @param x
	 * @para y
	 */
	void move(int x, int y);
}

//�������̽������� ��ҵ� ����-extends Ű���� �̿�, ���� ����� ������
interface Fightable extends Attackable, Movable{
}

abstract class Unit{
	protected int x, y; //������ ��ġ
	protected int currentHP; //������ ü��
	
	Unit(int x, int y, int currentHP){
		this.x = x;
		this.y = y;
		this.currentHP = currentHP;
	}
}


class Fighter extends Unit implements Fightable{
	Fighter(int x, int y, int currentHP){
		super(x,y,currentHP);
	}
	
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println(x+", "+y+"��ġ�� �̵��մϴ�");
	}
	
	public void attack(Unit u) {
		System.out.println(u.x+ ", "+u.y + "��ġ�� �ְ�,"
				+u.currentHP +"�� ü���� ���� ������ �����մϴ�");
	}
}


public class UnitTest {
	public static void main(String[] args) {
		Fighter f = new Fighter(10, 25, 350);
		f.move(30, 40);
		
		//f�� 30,40��ġ�� �ְ�, ü���� 240�� ������ �����ϰ�, 70,80 ��ġ�� �̵�
		f.attack(new Fighter(30,40,240));
		f.move(70, 80);
		//f�� 70,80��ġ�� �ְ�, ü���� 100�� ������ �����Ѵ�
		f.attack(new Fighter(70,80,100));
		
		//�ڽ��� �θ��� �ν��Ͻ��̱⵵ �ϴ�
		if(f instanceof Unit) {
			System.out.println("f�� Unit�� �ν��Ͻ�!");
		}
		if(f instanceof Object) {
			System.out.println("f�� Object�� �ν��Ͻ�!");
		}
		if(f instanceof Fightable) {
			System.out.println("f�� Fightable �������̽��� �����޴�");
		}
		if(f instanceof Movable) {
			System.out.println("f�� Movable �������̽��� �����޴�");
		}
		if(f instanceof Attackable) {
			System.out.println("f�� Attackable �������̽��� �����޴�");
		}
	}
}
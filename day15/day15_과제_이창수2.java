package day15;

class Human1{
	public void work() {
		System.out.println("�ϴ� ���� ����Ѵ�");
	}
}

class Teacher1 extends Human1{
	public void work() {
		System.out.println("����ġ�� ���� �մϴ�");
	}
}

class Programmer1 extends Human1{
	public void work() {
		System.out.println("���α׷����� �մϴ�");
	}
}

public class day15_����_��â��2 {
	public static void main(String[] args) {
		Teacher1 t = new Teacher1();
		t.work();
		Programmer1 p = new Programmer1();
		p.work();
	}
}

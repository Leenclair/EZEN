package day15;

class Human1{
	public void work() {
		System.out.println("하는 일을 기술한다");
	}
}

class Teacher1 extends Human1{
	public void work() {
		System.out.println("가르치는 일을 합니다");
	}
}

class Programmer1 extends Human1{
	public void work() {
		System.out.println("프로그래밍을 합니다");
	}
}

public class day15_과제_이창수2 {
	public static void main(String[] args) {
		Teacher1 t = new Teacher1();
		t.work();
		Programmer1 p = new Programmer1();
		p.work();
	}
}

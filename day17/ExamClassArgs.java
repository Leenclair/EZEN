package day17;

class AAA{
	public void method1(Cat c) {
		c.bark();
	}

	public void method2(Animal an) {
		an.bark();
	}
	
	public Cat method3() {	//=> Cat �� ���ϵȴ�
		return new Cat();
	}
	
	public Animal method4() {	//=>Cow �� ���ϵȴ�
		return new Cow();
	}
}

public class ExamClassArgs {

	public static void main(String[] args) {
		//�� �޼��� ȣ��
		AAA a = new AAA();
		a.method1(new Cat());
		a.method2(new Dog());
		Cat c2 = a.method3();
		c2.bark();
		Animal a2 = a.method4();
		a2.bark();
	}
}

package day21.collection;

class Person{
	public void showInfo() {
		System.out.println("this = "+this);
	}
}

public class ToStringTest {

	public static void main(String[] args) {
		Person p = new Person();
		p.showInfo();
		
		System.out.println("p��ü�� ǥ���ϴ� �⺻ ���ڿ� : "+p.toString());
		System.out.println("p="+p);
		System.out.println(p);
		
		/*
		toString() �޼��尡 �ڵ����� ȣ��Ǵ� ���
		 [1] System.out.println() �޼��忡 �Ű������� ���� ���
		 [2] ��ü�� ���Ͽ� ���ϱ�(+) ������ �ϴ� ���
		*/
		
		/*
		 toString() �޼����� ��� : Ŭ������@16���� �ؽ��ڵ�
		 hashCode() - ��ü�� �޸� �ּҸ� ���� 
		*/
	}

}

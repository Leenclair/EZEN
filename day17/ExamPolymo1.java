package day17;
import java.util.Scanner;

class Cat extends Animal
{
	public void bark()
	{
		System.out.println("�߿˾߿�");
	}
	public void child()
	{
		System.out.println("�� �ڽ�-�����");
	}
}

class Cow extends Animal
{
	public void bark()
	{
		System.out.println("��������");
	}
}

class Dog extends Animal
{
	public void bark()
	{
		System.out.println("�۸�");
	}
}

class Animal
{
	public void bark(){
		System.out.println("���");
	}
	public void parent(){
		System.out.println("�� �θ�-����");
	}
}


public class ExamPolymo1{
	public static void main(String[] args) {
		//1.�⺻ ����
		//Dog ��ü ����, bark() �޼��� ȣ��
		Dog dog = new Dog();
		dog.bark();
		
		//2. ������ �̿�
		//Cat, Cow
		Animal a = new Cat();
		a.bark();
		
		a = new Cow();
		a.bark();

		//3. ����� �Է� �޾Ƽ� ó��
		//=> 1. Cat 2.Cow 3.Dog ����
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���� 1.����� 2.�� 3.��");
		int type = sc.nextInt();
		
		Animal a2=null;
		if(type==1) {
			a2=new Cat();
		}else if(type==2) {
			a2=new Cow();
		}else if(type==3) {
			a2=new Dog();
		}else {
			System.out.println("�߸��Է�");
			return;
		}
		a2.bark();
		
		//�޼��� ȣ��
		//bark�޼��� ȣ��
		Animal a3 = createAnimal(type);
		a3.bark();
	
		//Animal �迭 �����, ��� 3�� �ְ�, bark()�޼��� ȣ��-for, Ȯ��for
		System.out.println("=====Animal ������ �迭�̿�=====");
		Animal[] aArr = new Animal[3];
		aArr[0] = new Cat();
		aArr[1] = new Cow();
		aArr[2] = new Dog();
		
		for(int i=0;i<aArr.length;i++) {
			aArr[i].bark();
		}
		
		for(Animal ani :aArr) {
			ani.bark();
		}
		
	}
	
	//�޼��� �����
	public static Animal createAnimal(int type) {
		Animal a = null;
		
		if(type==1) {
			a = new Cat();
		}else if(type==2) {
			a = new Cow();
		}else if(type==3) {
			a = new Dog();
		}
		
		return a;
	}
}
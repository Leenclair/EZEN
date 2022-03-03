package day17;
import java.util.Scanner;

class Cat extends Animal
{
	public void bark()
	{
		System.out.println("야옹야옹");
	}
	public void child()
	{
		System.out.println("난 자식-고양이");
	}
}

class Cow extends Animal
{
	public void bark()
	{
		System.out.println("음메음메");
	}
}

class Dog extends Animal
{
	public void bark()
	{
		System.out.println("멍멍");
	}
}

class Animal
{
	public void bark(){
		System.out.println("울다");
	}
	public void parent(){
		System.out.println("난 부모-동물");
	}
}


public class ExamPolymo1{
	public static void main(String[] args) {
		//1.기본 사용법
		//Dog 객체 생성, bark() 메서드 호출
		Dog dog = new Dog();
		dog.bark();
		
		//2. 다형성 이용
		//Cat, Cow
		Animal a = new Cat();
		a.bark();
		
		a = new Cow();
		a.bark();

		//3. 사용자 입력 받아서 처리
		//=> 1. Cat 2.Cow 3.Dog 선택
		Scanner sc = new Scanner(System.in);
		System.out.println("동물 선택 1.고양이 2.소 3.개");
		int type = sc.nextInt();
		
		Animal a2=null;
		if(type==1) {
			a2=new Cat();
		}else if(type==2) {
			a2=new Cow();
		}else if(type==3) {
			a2=new Dog();
		}else {
			System.out.println("잘못입력");
			return;
		}
		a2.bark();
		
		//메서드 호출
		//bark메서드 호출
		Animal a3 = createAnimal(type);
		a3.bark();
	
		//Animal 배열 만들고, 요소 3개 넣고, bark()메서드 호출-for, 확장for
		System.out.println("=====Animal 다형성 배열이용=====");
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
	
	//메서드 만들기
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
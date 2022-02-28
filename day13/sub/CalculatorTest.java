package day13.sub;

import java.util.Scanner;

/*
 static �޼���
 - Ư�� ��ü�� �Ҽӵ��� �����Ƿ� Ŭ�����κ��� ȣ���ؾ� ��
 - static ������ �׼����� �� �ִ�. �ν��Ͻ� ������ ������ �� ����
 - this ��� �Ұ�
 - Ŭ������.�޼���() �� ȣ��
 */

class Calculator{
	//static �޼���
	public static int add(int a, int b) {
		return a+b;
	}
	
	//instatnce �޼���
	public int subtract(int a, int b) {
		return a-b;
	}
}

public class CalculatorTest {

	public static void main(String[] args) {
		//static �޼��� ȣ�� : Ŭ������.�޼���()
		int result = Calculator.add(10, 30);
		System.out.println("�� ���� �� : "+result);
		
		//int n = Integer.parseInt("123");
	
		//instance �޼��� ȣ�� : ��ü ���� �� ��������.�޼���()
		Calculator cal = new Calculator();
		cal.subtract(50, 20);
		System.out.println("�� ���� �� : "+result);
		
		/*
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		*/
	}

}

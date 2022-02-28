package day13.sub;

import java.util.Scanner;

/*
 static 메서드
 - 특정 객체에 소속되지 않으므로 클래스로부터 호출해야 함
 - static 변수만 액세스할 수 있다. 인스턴스 변수는 참조할 수 없다
 - this 사용 불가
 - 클래스명.메서드() 로 호출
 */

class Calculator{
	//static 메서드
	public static int add(int a, int b) {
		return a+b;
	}
	
	//instatnce 메서드
	public int subtract(int a, int b) {
		return a-b;
	}
}

public class CalculatorTest {

	public static void main(String[] args) {
		//static 메서드 호출 : 클래스명.메서드()
		int result = Calculator.add(10, 30);
		System.out.println("두 수의 합 : "+result);
		
		//int n = Integer.parseInt("123");
	
		//instance 메서드 호출 : 객체 생성 후 참조변수.메서드()
		Calculator cal = new Calculator();
		cal.subtract(50, 20);
		System.out.println("두 수의 차 : "+result);
		
		/*
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		*/
	}

}

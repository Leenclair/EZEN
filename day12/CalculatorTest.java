package day12;
import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� �Ǽ��� �Է��ϼ���");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		Calculator cal = new Calculator();
		System.out.println("a="+a+", b="+b);
		System.out.println("a+b = "+cal.plus(a,b));
		System.out.println("a-b = "+cal.minus(a,b));
		System.out.println("a*b = "+cal.multiply(a,b));
		System.out.println("a/b = "+cal.divide(a,b));
	}
}

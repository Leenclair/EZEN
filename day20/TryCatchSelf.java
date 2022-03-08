package day20;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchSelf {

	public static void main(String[] args) {
		try {
			System.out.println("두 수를 입력하세요");
			Scanner sc = new Scanner(System.in);
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			int res = num1/num2;
			System.out.println(res);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}catch(InputMismatchException e) {
			System.out.println(e);
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}

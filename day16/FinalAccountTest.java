package day16;

import java.util.Scanner;

class Account3{
	public static final double INTEREST_RATE = 0.02;

	public int input(int money) {
		return (int)(INTEREST_RATE*money);
	}
}

public class FinalAccountTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�Ա��� �ݾ��� �Է��ϼ���");
		Account3 acc = new Account3();
		int money = sc.nextInt();
		
		System.out.println("==================");
		System.out.println("���� : "+money+"��, ������ : "+Account3.INTEREST_RATE + ", ���� : "+acc.input(money)+"��");
	}
}
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
		System.out.println("입금할 금액을 입력하세요");
		Account3 acc = new Account3();
		int money = sc.nextInt();
		
		System.out.println("==================");
		System.out.println("원금 : "+money+"원, 이자율 : "+Account3.INTEREST_RATE + ", 이자 : "+acc.input(money)+"원");
	}
}
package day20.sample;

import java.util.Scanner;

import javax.net.ssl.CertPathTrustManagerParameters;

public class PdBuyerMain {
	public static void main(String[] args) {
		Buyer b = new Buyer(1000);
		
		//가격이 200인 TV구매
		b.buy(new TV(200));
		b.showInfo();
		
		//가격이 150인 computer구매
		Product p = new Computer(150);
		b.buy(p);
		b.showInfo();
		
		//
		Scanner sc = new Scanner(System.in);
		Buyer b2 = new Buyer(1000);
		PdManager manager = new PdManager();

		while(true) {
			System.out.println("1. 상품구매 2. 구매내역 조회 3. 종료");
			int type = sc.nextInt();

			switch(type) {
			case 1 :
				manager.inputPd(b2);
				break;
			case 2 :
				manager.showPd(b2);
				break;
			case 3 :
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			default:
				System.out.println("잘못입력!");
				continue;
			}	
		}//switch
	}
}

class PdManager{
	Scanner sc = new Scanner(System.in);
	
	public void inputPd(Buyer b) {
		System.out.println("구매할 상품을 선택하세요 <1. Tv 2. Computer>");
		int pro = sc.nextInt();
		
		if(pro!=1 && pro!=2) {
			System.out.println("다시 선택하세요");
			return;
		}
		System.out.println("상품 가격을 입력하세요");
		int price2 = sc.nextInt();
		Product p = null;
		if(pro==1) {
			p = new TV(price2);
		}else if(pro==2) {
			p = new Computer(price2);
		}
		b.buy(p);
		b.showInfo();
	}
	
	public void showPd(Buyer b) {
		b.summary();
	}
}
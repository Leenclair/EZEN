package day20.sample;

import java.util.Scanner;

import javax.net.ssl.CertPathTrustManagerParameters;

public class PdBuyerMain {
	public static void main(String[] args) {
		Buyer b = new Buyer(1000);
		
		//������ 200�� TV����
		b.buy(new TV(200));
		b.showInfo();
		
		//������ 150�� computer����
		Product p = new Computer(150);
		b.buy(p);
		b.showInfo();
		
		//
		Scanner sc = new Scanner(System.in);
		Buyer b2 = new Buyer(1000);
		PdManager manager = new PdManager();

		while(true) {
			System.out.println("1. ��ǰ���� 2. ���ų��� ��ȸ 3. ����");
			int type = sc.nextInt();

			switch(type) {
			case 1 :
				manager.inputPd(b2);
				break;
			case 2 :
				manager.showPd(b2);
				break;
			case 3 :
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);
			default:
				System.out.println("�߸��Է�!");
				continue;
			}	
		}//switch
	}
}

class PdManager{
	Scanner sc = new Scanner(System.in);
	
	public void inputPd(Buyer b) {
		System.out.println("������ ��ǰ�� �����ϼ��� <1. Tv 2. Computer>");
		int pro = sc.nextInt();
		
		if(pro!=1 && pro!=2) {
			System.out.println("�ٽ� �����ϼ���");
			return;
		}
		System.out.println("��ǰ ������ �Է��ϼ���");
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
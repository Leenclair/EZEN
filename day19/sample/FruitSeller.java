package day19.sample;

//���� �Ǹ���
public class FruitSeller {
	private int numOfApple; //��� ����
	private int myMoney; // �Ǹż���
	private final int APPLE_PRICE; //��� �ϳ��� ����
	
	FruitSeller(int numOfApple, int myMoney, int price){
		this.numOfApple = numOfApple;
		this.myMoney = myMoney;
		this.APPLE_PRICE=price; //fanal���-�����ڿ��� �� �ѹ� �ʱ�ȭ ����
		//=>�ν��Ͻ����� �ٸ� �� �Ҵ�
	}
	
	//��� �Ǹ� �޼���
	public int[] saleApple(int money) {
		int[] numNchange = new int[2];
		numNchange[0] = money/APPLE_PRICE;
		numNchange[1] = money-(money%APPLE_PRICE);
		numOfApple-=numNchange[0];
		myMoney+=numNchange[1];
		
		
		return numNchange; //�����ڿ��� �� ��� ����
	}
	
	public void showResult() {
		System.out.println("\n=====�Ǹ��� ����=====");
		System.out.println("���� ��� : "+ numOfApple);
		System.out.println("�Ǹż��� : "+ myMoney);
	}
}
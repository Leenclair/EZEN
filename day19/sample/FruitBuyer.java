package day19.sample;

//���� ������
public class FruitBuyer {
	private int myMoney; //���� ��
	private int numOfApple; //������ ��� ����
	
	public FruitBuyer(int money) {
		this.myMoney = money;
	}
	
	//����� �����ϴ� �޼���
	//����� �����ϴµ� �־ �ʿ��� �� - ���Ŵ��, ���űݾ� => �Ű������� ���޵Ǿ�� ��
	//seller ������, ��� 2000����ġ �ּ���
	public void buyApple(FruitSeller seller, int money) {
		if(money > myMoney) {
			System.out.println("�� �� �ּ���");
			return;
		}

		int[] numArr = seller.saleApple(money);
		numOfApple += numArr[0];
		myMoney -=numArr[1];
		
		//buyer�� �����ϴ� ��ü�� ���� �����ϰ� ����� ��Եȴ�
		//seller�� �����ϴ� ��ü�� ����� �Ǹ��ϰ� ������ �����
	}
	
	public void showResult() {
		System.out.println("\n=====������ ����=====");
		System.out.println("���� �ܾ� : "+ myMoney);
		System.out.println("��� ���� : "+ numOfApple);
	}
}
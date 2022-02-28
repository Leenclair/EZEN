package day16;

/*
 [1] final ����
 	- ������� ����� �Բ� �ʱ�ȭ���� �ʰ�
 	  �����ڿ��� �� �ѹ��� �ʱ�ȭ�� �� �ִ�
 	- �� �ν��Ͻ����� �ٸ� ���� ������ �� �� �ִ�
 [2] static final ����
	- ����� �Բ��� �ʱ�ȭ
	- Ŭ���� �������� �ϳ��� �����ǰ�, ��� �ν��Ͻ��� ���� ���� ���´�(����)
 */

class Card{
	final String KIND;	//ī�� ����
	final int NUMBER;	//ī�� ����
	
	static final int WIDTH=100;
	static final int HEIGHT=250;
	
	Card(String k, int num){
		KIND=k;
		NUMBER=num;
	}
	public void showInfo() {
		System.out.println("ī�� ����:"+KIND);
		System.out.println("ī�� ����:"+NUMBER+"\n");
		
		//KIND ="Spade";//The final field Card.KIND cannot be assigned
	}
}

public class CardFinal {
	public static void main(String[] args) {
		Card c1 = new Card("Diamond", 5);
		c1.showInfo();
		
		Card c2 = new Card("Heart", 9);
		c2.showInfo();
		
		System.out.println("ī�� �ʺ� : "+Card.WIDTH);
		System.out.println("ī�� ���� : "+Card.HEIGHT);
	}
}

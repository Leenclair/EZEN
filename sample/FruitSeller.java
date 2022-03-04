package day19.sample;

//과일 판매자
public class FruitSeller {
	private int numOfApple; //사과 개수
	private int myMoney; // 판매수익
	private final int APPLE_PRICE; //사과 하나의 가격
	
	FruitSeller(int numOfApple, int myMoney, int price){
		this.numOfApple = numOfApple;
		this.myMoney = myMoney;
		this.APPLE_PRICE=price; //fanal상수-생성자에서 단 한번 초기화 가능
		//=>인스턴스별로 다른 값 할당
	}
	
	//사과 판매 메서드
	public int[] saleApple(int money) {
		int[] numNchange = new int[2];
		numNchange[0] = money/APPLE_PRICE;
		numNchange[1] = money-(money%APPLE_PRICE);
		numOfApple-=numNchange[0];
		myMoney+=numNchange[1];
		
		
		return numNchange; //구매자에게 줄 사과 개수
	}
	
	public void showResult() {
		System.out.println("\n=====판매자 정보=====");
		System.out.println("남은 사과 : "+ numOfApple);
		System.out.println("판매수익 : "+ myMoney);
	}
}
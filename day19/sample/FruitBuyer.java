package day19.sample;

//과일 구매자
public class FruitBuyer {
	private int myMoney; //남은 돈
	private int numOfApple; //구매한 사과 개수
	
	public FruitBuyer(int money) {
		this.myMoney = money;
	}
	
	//사과를 구매하는 메서드
	//사과를 구매하는데 있어서 필요한 것 - 구매대상, 구매금액 => 매개변수로 전달되어야 함
	//seller 아저씨, 사과 2000원어치 주세요
	public void buyApple(FruitSeller seller, int money) {
		if(money > myMoney) {
			System.out.println("돈 더 주세요");
			return;
		}

		int[] numArr = seller.saleApple(money);
		numOfApple += numArr[0];
		myMoney -=numArr[1];
		
		//buyer가 참조하는 객체는 돈을 지불하고 사과를 얻게된다
		//seller가 참조하는 객체는 사과를 판매하고 수익이 생긴다
	}
	
	public void showResult() {
		System.out.println("\n=====구매자 정보=====");
		System.out.println("현재 잔액 : "+ myMoney);
		System.out.println("사과 개수 : "+ numOfApple);
	}
}
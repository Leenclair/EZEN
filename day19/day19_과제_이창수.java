package day19;

class Child{
	private int numOfBead;
	
	Child(int numOfBead){
		this.numOfBead = numOfBead;
	}
	
	public int loseBead(int loseCount) {
		if(loseCount>numOfBead) {
			loseCount = numOfBead;
		}
		return loseCount;
	}
	
	public void obtainBead(Child child, int obtainCount) {
		child.numOfBead -= obtainCount;
		this.numOfBead += obtainCount;
	}
	
	public void showProperty() {
		System.out.println("보유 구슬의 개수 : "+numOfBead);
	}
}

public class day19_과제_이창수 {
	public static void main(String[] args) {
		
		Child ch1 = new Child(15);
		Child ch2 = new Child(9);
		
		System.out.println("게임 전 구슬의 보유 개수");
		System.out.println("===어린이 1====");
		ch1.showProperty();
		System.out.println("===어린이 2====");
		ch2.showProperty();
		System.out.println();
		
		System.out.println("게임 후 구슬의 보유 개수");
		ch1.obtainBead(ch2, 2); // ch1 => 15+2 = 17 / ch2 => 9-2 = 7
		ch2.obtainBead(ch1, 7); // ch1 => 17-7 = 10 / ch2 => 7+7 = 14
		
		System.out.println("===어린이 1====");
		ch1.showProperty();
		System.out.println("===어린이 2====");
		ch2.showProperty();
		System.out.println();
	}
}
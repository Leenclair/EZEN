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
		System.out.println("���� ������ ���� : "+numOfBead);
	}
}

public class day19_����_��â�� {
	public static void main(String[] args) {
		
		Child ch1 = new Child(15);
		Child ch2 = new Child(9);
		
		System.out.println("���� �� ������ ���� ����");
		System.out.println("===��� 1====");
		ch1.showProperty();
		System.out.println("===��� 2====");
		ch2.showProperty();
		System.out.println();
		
		System.out.println("���� �� ������ ���� ����");
		ch1.obtainBead(ch2, 2); // ch1 => 15+2 = 17 / ch2 => 9-2 = 7
		ch2.obtainBead(ch1, 7); // ch1 => 17-7 = 10 / ch2 => 7+7 = 14
		
		System.out.println("===��� 1====");
		ch1.showProperty();
		System.out.println("===��� 2====");
		ch2.showProperty();
		System.out.println();
	}
}
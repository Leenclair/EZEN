package day17;

class Unit{
	protected int x,y; //현재 위치

	public void move(int x, int y) {
		System.out.println("이동 메서드");
	}
	
	public void stop() {
		System.out.println("정지 메서드");
	}
}

class Marine extends Unit{
	public void move(int x, int y) {
		this.x=x;
		this.y=y;
		
		System.out.println("보병이 "+x+", "+y+"위치로 이동한다");
	}
	
	public void stimPack() {
		System.out.println("스팀팩을 사용한다");
	}
}

class Tank extends Unit{
	public void move(int x, int y) {
		this.x=x;
		this.y=y;
		
		System.out.println("탱크가 "+x+", "+y+"위치로 이동한다");
	}
	
	public void changeMode() {
		System.out.println("공격모드로 변환한다");
	}
}

class Dropship extends Unit{
	public void move(int x, int y) {
		this.x=x;
		this.y=y;
		
		System.out.println("수송선의 위치를 "+x+", "+y+"위치로 이동한다");
	}
	public void load() {
		System.out.println("선택된 대상을 태운다");
	}
	public void unload() {
		System.out.println("선택된 대상을 내린다");
	}
}

public class PolymoArray {
	public static void main(String[] args) {
		//Unit 배열 만들고, 요소 4개 넣고 move()메서드 호출 - for, 확장for
		Unit[] uArr = new Unit[4];
		uArr[0] = new Marine();
		uArr[1] = new Tank();
		uArr[2] = new Dropship();
		uArr[3] = new Marine();
		
		for(int i=0;i<uArr.length;i++) {
			uArr[i].move(1, 1);
		}
		
		for(Unit u : uArr) {
			u.move(2, 2);
		}
	}

}

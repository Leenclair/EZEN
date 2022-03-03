package day18;

abstract class Unit{
	protected int x,y; //현재 위치

	public abstract void move(int x, int y) ;
	
	public void stop() {
		System.out.println("현재 위치에 정지한다");
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

public class ExamUnit {
	public static void main(String[] args) {
		/*
		  Unit 배열 만들고, 요소 4개 넣고
		  [1] 오버라이딩 메서드 호출
		  [2] 자식만의 메서드 호출
		  
		  for, 확장for 이용
		 */
		
		Unit[] arr = new Unit[4];
		arr[0] = new Marine();
		arr[1] = new Tank();
		arr[2] = new Dropship();
		arr[3] = new Marine();
		//arr[3] = new Unit(); //error
		
		System.out.println("=====오버라이딩 메서드 호출=====");
		for(int i=0;i<arr.length;i++) {
			arr[i].move(1, 1);
		}
		
		System.out.println("=====확장 for=====");
		for(Unit u : arr) {
			u.move(2, 2);
		}
		
		
		System.out.println("=====자식만의 메서드 호출=====");
		for(int i=0;i<arr.length;i++) {
			if(arr[i] instanceof Marine) {
				Marine m = (Marine)arr[i];
				m.stimPack();
			}else if(arr[i] instanceof Tank) {
				Tank t = (Tank)arr[i];
				t.changeMode();
			}else if(arr[i] instanceof Dropship) {
				Dropship d = (Dropship)arr[i];
				d.load();
			}
		}
		System.out.println("=====확장 for=====");
		for(Unit u : arr) {
			if(u instanceof Marine) {
				Marine m = (Marine)u;
				m.stimPack();
			}else if(u instanceof Tank) {
				Tank t = (Tank)u;
				t.changeMode();
			}else if(u instanceof Dropship) {
				Dropship d = (Dropship)u;
				d.load();
			}			
		}
	}
}

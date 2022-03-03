package day17;

import java.util.Scanner;

class Shape3Manager{
	Scanner sc = new Scanner(System.in);
	final int MAX_COUNT=100;
	Shape2[] sArr = new Shape2[MAX_COUNT];
	private int idx=0;
	
	public void showMenu() {
		System.out.println("1.원 2.사각형 3.보기 4.종료");
	}
	
	public void inputCircle() {
		if(idx>MAX_COUNT) {
			System.out.println("더이상 데이터 저장을 할 수 없습니다");
			return;
		}
		System.out.print("r = ");
		int r = sc.nextInt();
		sArr[idx++] = new Circle2(r);
	}
	
	public void inputRect() {
		if(idx>MAX_COUNT) {
			System.out.println("더이상 데이터 저장을 할 수 없습니다");
			return;
		}
		System.out.print("w = ");
		int w = sc.nextInt();
		System.out.print("h = ");
		int h = sc.nextInt();
		sArr[idx++] = new Rect(w, h);
	}
	
	public void showArea() {
		if(idx==0){
			System.out.println("데이터가 존재하지 않습니다");
			return;
		}
		for(int i=0;i<idx;i++) {
			double area=sArr[i].findArea();
			System.out.println(sArr[i].kind()+"의 면적:"+area);
		}		
	}
	
	public void exit() {
		System.out.println("종료함!");
		System.exit(0);
	}
	
}

public class day17_과제_이창수 {
	public static void main(String[] args) {
		Shape3Manager sh = new Shape3Manager();
		Scanner sc = new Scanner(System.in);
		int type=0;
		
		while(true) {
			sh.showMenu();
			type=sc.nextInt();
			
			switch(type) {
				case 1:
					sh.inputCircle();
					break;
				case 2:
					sh.inputRect();
					break;
				case 3:
					sh.showArea();
					break;
				case 4:
					sh.exit();
					break;
				default:
					System.out.println("잘못 입력!\n");
					continue;
			}
		}//while
		
	}

}
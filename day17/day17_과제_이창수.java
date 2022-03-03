package day17;

import java.util.Scanner;

class Shape3Manager{
	Scanner sc = new Scanner(System.in);
	final int MAX_COUNT=100;
	Shape2[] sArr = new Shape2[MAX_COUNT];
	private int idx=0;
	
	public void showMenu() {
		System.out.println("1.�� 2.�簢�� 3.���� 4.����");
	}
	
	public void inputCircle() {
		if(idx>MAX_COUNT) {
			System.out.println("���̻� ������ ������ �� �� �����ϴ�");
			return;
		}
		System.out.print("r = ");
		int r = sc.nextInt();
		sArr[idx++] = new Circle2(r);
	}
	
	public void inputRect() {
		if(idx>MAX_COUNT) {
			System.out.println("���̻� ������ ������ �� �� �����ϴ�");
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
			System.out.println("�����Ͱ� �������� �ʽ��ϴ�");
			return;
		}
		for(int i=0;i<idx;i++) {
			double area=sArr[i].findArea();
			System.out.println(sArr[i].kind()+"�� ����:"+area);
		}		
	}
	
	public void exit() {
		System.out.println("������!");
		System.exit(0);
	}
	
}

public class day17_����_��â�� {
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
					System.out.println("�߸� �Է�!\n");
					continue;
			}
		}//while
		
	}

}
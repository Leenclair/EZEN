package day23;
import java.util.ArrayList;
import java.util.Scanner;

abstract class Shape{
	abstract int findGirth();
}

class Circle extends Shape{
	private double r;
	final double PI = 3.14;
	
	Circle(double r){
		this.r = r;
	}
	
	int findGirth() {
		return (int) Math.round(2*r*PI);
	}
	
	public String toString() {
		return "원의 둘레 : "+findGirth();
	}
}

class Rect extends Shape{
	private int w;
	private int h;
	
	Rect(int w, int h){
		this.w = w;
		this.h=h;
	}
	
	int findGirth() {
		return 2*(w+h);
	}
	
	public String toString() {
		return "사각형의 둘레 : "+findGirth();
	}
}

public class day23_과제2_이창수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Shape> alist = new ArrayList<Shape>();
		Shape sh = null;
		
		while(true) {
			System.out.print("1.원 2.사각형 3.보기 4.종료 ===>");
			int type = sc.nextInt();
			
			if(type==1) {
				System.out.print("반지름은 ? ");
				double r = sc.nextDouble();
				sh = new Circle(r);
				alist.add(sh);
			}else if(type==2) {
				System.out.print("가로는?");
				int w = sc.nextInt();
				System.out.print("세로는?");
				int h = sc.nextInt();
				
				sh = new Rect(w,h);
				alist.add(sh);
			}else if(type==3) {
				for(int i=0;i<alist.size();i++) {
					System.out.println(alist.get(i).toString());
				}//for
			}else if(type==4) {
				System.out.println("프로그램을 종료합니다");
				return;
			}else{
				System.out.println("다시입력하세요");
				continue;
			}
		}
	}
}

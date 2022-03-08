package day20;
import java.util.Scanner;

class Pitcher{
	int[] arr = new int[3];
	public void rndAnswer() {
		for(int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*9);
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) --i;
			}
		}
	}
}

class Hitter{
	int[] user;
	Hitter(int[] arr){
		this.user = arr;
	}
}

class Umpire{
	int strike, ball;
	
	public void findAswer(Pitcher p, Hitter h) {
		int s=0;
		int b=0;
		for(int i=0;i<3;i++) {
			if(h.user[i]==p.arr[i]) {
				s+=1;
			}
			for(int j=0;j<3;j++) {
				if(i!=j&&h.user[i]==p.arr[j]) {
					b+=1;
				}
			}
		}
		this.strike = s;
		this.ball = b;
	}
}

public class day20_����2_��â�� {
	
	public static int[] arr() {
		Scanner sc = new Scanner(System.in);
		int[] arr = {sc.nextInt(),sc.nextInt(),sc.nextInt()};
		for(int i=0;i<3;i++) {
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("�ߺ��� ���ڰ� �ֽ��ϴ�, �ٽ� �Է����ּ���");
					return arr();
				}//if
			}//for
		}//�ٱ�for
		return arr;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Umpire u = new Umpire();
		Hitter h = null;
		Pitcher p = new Pitcher();
		
		while(true) {
			p.rndAnswer();
			for(int i=0;i<10;i++) {
				System.out.println("�ٸ� �� ���� �Է��ϼ���<0~9>");
				h = new Hitter(arr());
				u.findAswer(p, h);
				if(u.strike==3) {
					System.out.println("You Win in "+(i+1));
					break;
				}
				System.out.println("�ݺ�Ƚ��:"+(i+1)+","+u.strike+"Strike!!"+u.ball+"Ball!!");
				if(i==9) {
					System.out.println("You Lose, Pitcher is");
					System.out.println(p.arr[0]+"\t"+p.arr[1]+"\t"+p.arr[2]);
				}
			}
			System.out.println("����Ͻðڽ��ϱ�?<Y/N>");
			String input = sc.nextLine();
			if(input.equalsIgnoreCase("n"))
				break;
		}
	}
}
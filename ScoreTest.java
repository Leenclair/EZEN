package day22;

import java.util.ArrayList;
import java.util.Scanner;

class Score{
	private int sum;
	private double avg;
	
	public int getSum() {
		return sum;
	}
	
	public double getAvg() {
		return avg;
	}
	
	public void findSum(ArrayList<Integer> subject) {
		sum=0;
		for(int i=0;i<subject.size();i++) {
			int n = subject.get(i);
			sum+=n;
		}
	}
	
	public void findAvg(ArrayList<Integer> subject) {
		findSum(subject);
		avg = (double)sum/subject.size();
	}
}

public class ScoreTest {

	public static void main(String[] args) {
		Score s = new Score();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("����, ����, ���������� �Է��ϼ���");
		
		for(int i=0;i<3;i++) {
		list.add(sc.nextInt());
		}
		//���� ���ϴ� �޼��� ȣ��
		s.findSum(list);
		System.out.println("���� : "+s.getSum());
		
		//��� ���ϴ� �޼��� ȣ��
		s.findAvg(list);
		System.out.println("��� : "+s.getAvg());
	}
}
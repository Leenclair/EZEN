package day12;
import java.util.Scanner;

public class RectangleTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�簢���� ����, ���θ� �Է��ϼ���");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		Rectangle rec = new Rectangle();
		rec.width = a;
		rec.length = b;
		
		int area = rec.area();
		int round = rec.round();
		
		System.out.println("�簢���� ���� : "+area);
		System.out.println("�簢���� �ѷ� : "+round);
		
	}

}

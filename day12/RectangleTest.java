package day12;
import java.util.Scanner;

public class RectangleTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("사각형의 가로, 세로를 입력하세요");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		Rectangle rec = new Rectangle();
		rec.width = a;
		rec.length = b;
		
		int area = rec.area();
		int round = rec.round();
		
		System.out.println("사각형의 넓이 : "+area);
		System.out.println("사각형의 둘레 : "+round);
		
	}

}

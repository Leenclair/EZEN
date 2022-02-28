package day14;

public class ArrayClassExam {

	public static void main(String[] args) {
		//String 배열 만들고, 프로그래밍 언어 3개 넣고, 출력(for, 확장for)
		String[] strArr = new String[3];
		strArr[0] = "안녕";
		strArr[1] = "Java";
		strArr[2] = "Spring";
		
		for(int i=0;i<strArr.length;i++) {
			System.out.print(strArr[i]+"\t");
		}
		
		System.out.println("\n=======확장for=========");
		
		for(String str:strArr){
			System.out.print(str+"\t");
		}
		
		System.out.println();
		
		//Circle배열 만들고, 요소 4개 넣고, 면적 구한 후 출력(for, 확장for)
		
		Circle[] cirArr = new Circle[4];
		cirArr[0] = new Circle(1);
		cirArr[1] = new Circle(2);
		cirArr[2] = new Circle(3);
		cirArr[3] = new Circle(4);
		
		//double area=cirArr[0].findArea();
		
		for(int i = 0; i < cirArr.length; i++) {
			System.out.println(cirArr[i].findArea());
		}
		System.out.println();
		
		for(Circle n : cirArr) {
			System.out.println(n.findArea());
		}
	}

}
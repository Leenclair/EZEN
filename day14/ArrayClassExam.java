package day14;

public class ArrayClassExam {

	public static void main(String[] args) {
		//String �迭 �����, ���α׷��� ��� 3�� �ְ�, ���(for, Ȯ��for)
		String[] strArr = new String[3];
		strArr[0] = "�ȳ�";
		strArr[1] = "Java";
		strArr[2] = "Spring";
		
		for(int i=0;i<strArr.length;i++) {
			System.out.print(strArr[i]+"\t");
		}
		
		System.out.println("\n=======Ȯ��for=========");
		
		for(String str:strArr){
			System.out.print(str+"\t");
		}
		
		System.out.println();
		
		//Circle�迭 �����, ��� 4�� �ְ�, ���� ���� �� ���(for, Ȯ��for)
		
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
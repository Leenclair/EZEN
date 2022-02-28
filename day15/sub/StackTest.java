package day15.sub;

public class StackTest {

	public static void main(String[] args) {

	}
	
	public static void firstMethod() {
		secondMethod();
	}

	public static void secondMethod() {
		System.out.println("secondMethod!!");
	}

}

package day17;

public class PolymoTest3 {

	public static void main(String[] args) {
		//Triangle 배열 만들고, 요소 3개 넣고, draw()메서드 호출(for, 확장for 이용)
		Triangle[] t = new Triangle[3];
		t[0] = new Triangle();
		t[1] = new Triangle();
		t[2] = new Triangle();
		
		for(int i=0;i<t.length;i++) {
			t[i].draw();
		}
		
		for(Triangle tri : t) {
			tri.draw();
		}
		
		System.out.println("\n=====다형성 이용=====");
		//Shape
		Shape[] s = new Shape[3];
		s[0] = new Circle();
		s[1] = new Triangle();
		s[2] = new Circle();

		for(int i=0;i<s.length;i++) {
			s[i].draw();
			s[i].delete();
		}
		
		for(Shape sh : s) {
			sh.draw();
			sh.delete();
		}
	}
}

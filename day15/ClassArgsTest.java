package day15;

public class ClassArgsTest {
	public static void func1(Student st) {
		System.out.println("func1()�޼���");
		st.showInfo();
	}
	
	public static void func2(Teacher t) {
		t.work();
	}
	
	public static void func3(String s, int a) {
		System.out.println("s="+s+"a="+a);
	}
	
	public static void main(String[] args) {
		//func3() ȣ��
		String str="c";
		int n=1;
		func3(str, n);
		
		func3("java",1);
		
		//func1() ȣ��
		Student st = new Student("�ڹ�","2022");
		func1(st);
		
		Student[] arr = new Student[2];
		arr[0] = new Student("java","123");
		arr[1] = new Student("java","124");
		
		//func2() ȣ��
		Teacher t = new Teacher();
		func2(t);
	}

}

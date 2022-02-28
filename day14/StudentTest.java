package day14;

import java.util.Scanner;

class Student{
	private String name;
	private String idNo;
	
	Student(String name, String idNo){
		this.name = name;
		this.idNo = idNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdNo() {
		return idNo;
	}

	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}
	
	public void showInfo() {
		System.out.println("�̸�:"+name);
		System.out.println("�й�:"+idNo);
	}
}


public class StudentTest {

	public static void main(String[] args) {
		System.out.println("======Self[1]=======\n");
		Student s1 = new Student("ȫ�浿","2012001");
		s1.showInfo();
		System.out.println("======================");
		Student s2 = new Student("�迬��","2012002");
		s2.showInfo();
		System.out.println("======================");
		Student s3 = new Student("���缮","2012003");
		s3.showInfo();
		System.out.println("======================");
		Student s4 = new Student("������","2012004");
		s4.showInfo();
		System.out.println("======================");

		System.out.println("\n======Self[2]=======\n");
		
		Student[] arr = new Student[3];
		arr[0] = new Student("�ڹ�1","2012005");
		arr[1] = new Student("�ڹ�2","2012006");
		arr[2] = new Student("�ڹ�3","2012007");
		
		for(int i=0;i<arr.length;i++) {
			arr[i].showInfo();
		}
		
		System.out.println("\n======Ȯ��for=======\n");
		for(Student st : arr) {
			st.showInfo();
		}
		
		System.out.println("\n======Self[3]=======\n");
		Student[] arrSt = new Student[3];
		Scanner sc = new Scanner(System.in);

		for(int i=0;i<arrSt.length;i++) {
		System.out.println("�̸��� �й��� �Է��ϼ���");
		String Student = sc.nextLine();
		String idNo = sc.nextLine();
		
		arrSt[i] = new Student(Student, idNo);
		}
		System.out.println("\n======Ȯ��for=======\n");
		for(Student st:arrSt) {
			st.showInfo();
		}
	}

}
//3. ����� �Է¹޾Ƽ� student��ü �����ؼ� �迭�� ����
//=>for������ ��ü �л��� ��� �޼��� ȣ��
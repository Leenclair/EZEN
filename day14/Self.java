package day14;

import java.util.Scanner;

public class Self {
	
	public static void main(String[] args) {
		/*
		Student �迭 �����, 2�� ��� �ְ�
		��� �л��� ��¸޼��� ȣ��(for, Ȯ�� for) 
		*/
		
		Student[] arr = new Student[2];
		
		arr[0]= new Student("���ڹ�", "123-123");
		arr[1]= new Student("�轺����", "123-124");
		
		for(int i=0;i<arr.length;i++) {
			arr[i].showInfo();
		}
		
		for(Student stu:arr) {
			stu.showInfo();
		}
	}
}
package day14;

import java.util.Scanner;

public class Self {
	
	public static void main(String[] args) {
		/*
		Student 배열 만들고, 2개 요소 넣고
		모든 학생의 출력메서드 호출(for, 확장 for) 
		*/
		
		Student[] arr = new Student[2];
		
		arr[0]= new Student("김자바", "123-123");
		arr[1]= new Student("김스프링", "123-124");
		
		for(int i=0;i<arr.length;i++) {
			arr[i].showInfo();
		}
		
		for(Student stu:arr) {
			stu.showInfo();
		}
	}
}
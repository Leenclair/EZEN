package day14;

import java.util.Scanner;

public class StudentSelf {

	public static void main(String[] args) {
		Student[] sArr = new Student[100];
		Scanner scanner = new Scanner(System.in);
		
		int index = 0;
		
		while(true) {
			System.out.println("1.저장 2.전체학생 조회 3.종료 선택");
			int num = scanner.nextInt();
			scanner.nextLine();
			
			if(num == 3) {
				System.out.println("종료합니다.");
				break;
			}else if(num == 2) {
				int arrLength = sArr.length - (sArr.length - index);
				System.out.println("=====학생 리스트=====");
				for(int i = 0; i < arrLength; i++) {
					sArr[i].showInfo();
					System.out.println();
				}
			}else if(num == 1) {
				System.out.println("이름, 학번을 입력하세요.");
				String name = scanner.nextLine();
				String idNo = scanner.nextLine();
				
				sArr[index++] = new Student(name, idNo);
			}
			System.out.println();
		}
	}

}
package day14;

import java.util.Scanner;

class PhoneInfo{
	private String name;
	private String phone;
	private String birth;

	PhoneInfo(){
		this.name=name;
		this.phone=phone;
		this.birth=birth;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}
	
	public void showInfo() {
		System.out.println("n======입력된 정보 출력======");
		System.out.println("이름: "+name);
		System.out.println("전화번호: "+phone);
		if(birth!=null)System.out.println("생년월일: "+birth);
	}
	
	
	
}
public class day14_과제_이창수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PhoneInfo[] Parr = new PhoneInfo[100];
		int index = 0;
		
		while(true) {
			System.out.println("선택하세요...");
			System.out.println("1.데이터 입력(저장)");
			System.out.println("2. 전체 데이터 조회");
			System.out.println("3. 데이터 검색");
			System.out.println("4. 데이터 삭제");
			System.out.println("5. 프로그램 종료");
			System.out.print("선택:");
			int choice = sc.nextInt();
			
			if(choice==5) {
				System.out.println("프로그램을 종료합니다");
				break;
			}else if(choice==1) {
				System.out.println("데이터 입력을 시작합니다..");
				Parr[index] = new PhoneInfo();
				sc.nextLine();
				System.out.print("이름:");
				Parr[index].setName(sc.nextLine());
				System.out.print("전화번호:");
				Parr[index].setPhone(sc.nextLine());
				System.out.print("생년월일:");
				Parr[index++].setBirth(sc.nextLine());
				System.out.println("데이터 입력이 완료되었습니다.\n");
			}else if(choice==2) {
				System.out.println("-----전체 데이터 조회-----");
				for(int i=0;i<index;i++) {
					Parr[i].showInfo();
				}
				System.out.println();
			}else if(choice==3) {
				System.out.println("데이터 검색을 시작합니다..");
				System.out.print("이름: ");
				sc.nextLine();
				String search = sc.nextLine();
				for(int i=0;i<index;i++) {
					if(search.equals(Parr[i].getName())) {
						Parr[i].showInfo();
					}//if
				}//for
				System.out.println("데이터 검색이 완료되었습니다");
			}else if(choice==4) {
				System.out.println("데이터 삭제를 시작합니다");
				sc.nextLine();
				System.out.print("이름 ");
				String del = sc.nextLine();
				for(int i=0;i<index;i++) {
					if(del.equals(Parr[i].getName())) {
						for(int j=i+1;j<index;j++) {
							Parr[j-1] = Parr[j];
						}
						--index;
					}
				}
				System.out.println("데이터 삭제가 완료되었습니다.");
			}
		}//while
	}
}

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
		System.out.println("n======�Էµ� ���� ���======");
		System.out.println("�̸�: "+name);
		System.out.println("��ȭ��ȣ: "+phone);
		if(birth!=null)System.out.println("�������: "+birth);
	}
	
	
	
}
public class day14_����_��â�� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PhoneInfo[] Parr = new PhoneInfo[100];
		int index = 0;
		
		while(true) {
			System.out.println("�����ϼ���...");
			System.out.println("1.������ �Է�(����)");
			System.out.println("2. ��ü ������ ��ȸ");
			System.out.println("3. ������ �˻�");
			System.out.println("4. ������ ����");
			System.out.println("5. ���α׷� ����");
			System.out.print("����:");
			int choice = sc.nextInt();
			
			if(choice==5) {
				System.out.println("���α׷��� �����մϴ�");
				break;
			}else if(choice==1) {
				System.out.println("������ �Է��� �����մϴ�..");
				Parr[index] = new PhoneInfo();
				sc.nextLine();
				System.out.print("�̸�:");
				Parr[index].setName(sc.nextLine());
				System.out.print("��ȭ��ȣ:");
				Parr[index].setPhone(sc.nextLine());
				System.out.print("�������:");
				Parr[index++].setBirth(sc.nextLine());
				System.out.println("������ �Է��� �Ϸ�Ǿ����ϴ�.\n");
			}else if(choice==2) {
				System.out.println("-----��ü ������ ��ȸ-----");
				for(int i=0;i<index;i++) {
					Parr[i].showInfo();
				}
				System.out.println();
			}else if(choice==3) {
				System.out.println("������ �˻��� �����մϴ�..");
				System.out.print("�̸�: ");
				sc.nextLine();
				String search = sc.nextLine();
				for(int i=0;i<index;i++) {
					if(search.equals(Parr[i].getName())) {
						Parr[i].showInfo();
					}//if
				}//for
				System.out.println("������ �˻��� �Ϸ�Ǿ����ϴ�");
			}else if(choice==4) {
				System.out.println("������ ������ �����մϴ�");
				sc.nextLine();
				System.out.print("�̸� ");
				String del = sc.nextLine();
				for(int i=0;i<index;i++) {
					if(del.equals(Parr[i].getName())) {
						for(int j=i+1;j<index;j++) {
							Parr[j-1] = Parr[j];
						}
						--index;
					}
				}
				System.out.println("������ ������ �Ϸ�Ǿ����ϴ�.");
			}
		}//while
	}
}

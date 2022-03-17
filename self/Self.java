package self;

import java.util.ArrayList;
import java.util.Scanner;

class Score{
	String name, classroom,grade;
	int java,oracle,jsp,sum;
	double avg;
	
	Score(String name, String classroom, int java, int oracle, int jsp){
		this.name = name;
		this.classroom = classroom;
		this.java = java;
		this.oracle = oracle;
		this.jsp = jsp;
	}
	
	public String getName() {
		return name;
	}

	public String getClassroom() {
		return classroom;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public void setOracle(int oracle) {
		this.oracle = oracle;
	}

	public void setJsp(int jsp) {
		this.jsp = jsp;
	}

	
	public int getSum() {
		sum = java+oracle+jsp;
		return sum;
	}
	
	public double getAvg() {
		avg = getSum()/3.0;
		return avg;
	}
	
	public String getGrade() {
		grade = "";
		if(getAvg()>90) {
			grade = "A";
		}else if(getAvg()>80) {
			grade = "B";
		}else if(getAvg()>70) {
			grade = "C";
		}else {
			grade = "D";
		}
		return grade;
	}
	
	public void showInfo() {
		System.out.println(name+"\t"+java+"\t"+oracle+"\t"+jsp
				+"\t"+getSum()+"\t"+getAvg()+"\t"+getGrade());
	}
}



public class Self {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Score> list = new ArrayList<Score>();
		String type = "";
		
		while(true) {
			System.out.println("1. �����Է�");
			System.out.println("2. ��ü�л��� ���� ��ȸ");
			System.out.println("3. �л��� ���� ��ȸ");
			System.out.println("4. Ŭ����<��>�� ���� ��ȸ");
			System.out.println("5. �л� ���� ����");
			System.out.println("6. ����");
			System.out.print("�����ϼ��� : ");
			type = sc.nextLine();

			switch(type) {
			case "1":
				System.out.println("�л��̸�, ��, java, oracle, jsp ������ �Է��ϼ���");
				String name = sc.nextLine();
				String classroom = sc.nextLine();
				int java = sc.nextInt();
				int oracle = sc.nextInt();
				int jsp = sc.nextInt();
				sc.nextLine();
				list.add(new Score(name, classroom, java, oracle, jsp));
				break;
			case "2":
				if(list.isEmpty()) {
					System.out.println("�����Ͱ� �����ϴ�");
					return;
				}
				
				for(int i=0;i<list.size();i++) {
					Score s = list.get(i);
					s.showInfo();
				}
				break;
			case "3":
				System.out.println("Ŭ����<��>�� �л��̸��� �Է��ϼ���");
				classroom = sc.nextLine();
				name = sc.nextLine();
				
				for(int i=0;i<list.size();i++) {
					Score s = list.get(i);
					if((s.getName().equals(name))
							&&s.getClassroom().equals(classroom)) {
						s.showInfo();
					}
				}
				break;
			case "4":
				System.out.println("���� �Է��ϼ���");
				classroom = sc.nextLine();
				for(int i=0;i<list.size();i++) {
					Score s = list.get(i);
					if(s.getClassroom().equals(classroom)) {
						s.showInfo();
					}
				}
				break;
			case "5":
				System.out.println("Ŭ����<��>�� �л��̸��� �Է��ϼ���");
				classroom = sc.nextLine();
				name = sc.nextLine();
				for(int i=0;i<list.size();i++) {
					Score s = list.get(i);
					if(s.getName().equals(name)&s.getClassroom().equals(classroom)) {
						System.out.println("�����Ϸ��� ������ java,oracle,jsp���� ������ �Է��ϼ���");
						s.setJava(sc.nextInt());
						s.setOracle(sc.nextInt());
						s.setJsp(sc.nextInt());
						sc.nextLine();
						s.showInfo();
					}
				}
				break;
			case "6":
				System.out.println("����");
				return;
				
			}
		}
	}
}
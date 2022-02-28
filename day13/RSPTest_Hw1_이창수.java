package day13;

import java.util.Scanner;

class RSP{
	private String user;
	private String com;
	private String result;
	
	public String getUser() {
		return user;
	}
	
	public String getCom() {
		return com;
	}
	
	public String getResult() {
		return result;
	}
	
	private String conv(int num) {
		String rsp="";
		if(num==0) {
			rsp="����";
		}else if(num==1) {
			rsp="����";
		}else if(num==2) {
			rsp="��";
		}
		return rsp;
	}
	
	public void comp(int iuser, int icom) {
		int res = (iuser-icom+3)%3;
		switch(res) {
			case 1 : result = "�̰��";
			break;
			case 2 : result = "����";
			break;
			case 0 : result = "����";
			break;
		}
		this.user = conv(iuser);
		this.com = conv(icom);
	}
}

public class RSPTest_Hw1_��â�� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		RSP rsp = new RSP();
		while(true) {
			System.out.println("����<0>, ����<1>, ��<2>, q<quit>�� �Է����ּ���");
			String user = sc.nextLine();
			int iuser = 0;
			if(user.equalsIgnoreCase("q")) {
				System.out.println("����");
				break;
			}else if(user.equals("0")||user.equals("1")||user.equals("2")) {
				iuser = Integer.parseInt(user);
			}else {
				System.out.println("�߸��Է�\n");
				continue;
			}
			int icom = (int)(Math.random()*3);
			rsp.comp(iuser,icom);
			System.out.println("����� = "+rsp.getUser());
			System.out.println("��ǻ�� = "+rsp.getCom());
			System.out.println("��� = " + rsp.getResult()+"\n");
		}
	}
}

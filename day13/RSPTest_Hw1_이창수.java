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
			rsp="가위";
		}else if(num==1) {
			rsp="바위";
		}else if(num==2) {
			rsp="보";
		}
		return rsp;
	}
	
	public void comp(int iuser, int icom) {
		int res = (iuser-icom+3)%3;
		switch(res) {
			case 1 : result = "이겼다";
			break;
			case 2 : result = "졌다";
			break;
			case 0 : result = "비겼다";
			break;
		}
		this.user = conv(iuser);
		this.com = conv(icom);
	}
}

public class RSPTest_Hw1_이창수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		RSP rsp = new RSP();
		while(true) {
			System.out.println("가위<0>, 바위<1>, 보<2>, q<quit>를 입력해주세요");
			String user = sc.nextLine();
			int iuser = 0;
			if(user.equalsIgnoreCase("q")) {
				System.out.println("종료");
				break;
			}else if(user.equals("0")||user.equals("1")||user.equals("2")) {
				iuser = Integer.parseInt(user);
			}else {
				System.out.println("잘못입력\n");
				continue;
			}
			int icom = (int)(Math.random()*3);
			rsp.comp(iuser,icom);
			System.out.println("사용자 = "+rsp.getUser());
			System.out.println("컴퓨터 = "+rsp.getCom());
			System.out.println("결과 = " + rsp.getResult()+"\n");
		}
	}
}

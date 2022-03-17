package day24;

import java.util.StringTokenizer;

public class TokenizerTest1 {

	public static void main(String[] args) {
		/*
		 StringTokenizer
		 - �� ���ڿ��� ������ �����ڸ� �������� ��ū�̶�� ���� ���� ���� ���ڿ��� �߶󳻴µ� ���
		 - �����ڷ� �� �ϳ��� ���ڹۿ� ������� ����
		 - split() �� ���� 
		 */
		
		String str = "100,200,300,400";
		StringTokenizer st = new StringTokenizer(str, ",");
		
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
		
		System.out.println("\n");
		String[] arr = str.split(",");
		for(String s : arr) {
			System.out.println(s);
		}
		
		str = "x=100*(200+300)/2";
		StringTokenizer st2 = new StringTokenizer(str, "+-*/=()", true);
		//StringTokenizer st2 = new StringTokenizer(str, "+-*/=()");
		//�� �� ������ �����ڸ� ����� �� �ֱ� ������ +-*/=() ��ü�� �ϳ��� �����ڰ� �ƴ϶�
		//������ ���ڰ� ��� ��������
		//=> true : �����ڵ� ��ū���� ����

		System.out.println("\n==================");
		while(st2.hasMoreTokens()) {
			String token = st2.nextToken();
			System.out.println(token);
		}
	}
}
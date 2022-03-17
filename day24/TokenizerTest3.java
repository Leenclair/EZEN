package day24;

import java.util.StringTokenizer;

public class TokenizerTest3 {
	public static void main(String[] args) {
		/*
		  split() �� �� ���ڿ��� ��ū���� �ν��ϴ� �ݸ�
		  StringTokenizer �� �� ���ڿ��� ��ū���� �ν����� �ʱ� ������ �ν��ϴ� ��ū��
		  ������ ���� �ٸ�
		*/
		String str = "100,,,200,300";
		
		String[] arr=str.split(",");
		int n=0;
		for(String s : arr) {
			System.out.print(s+"|");
			n++;
		}
		
		System.out.println("����:"+n+"\n\n");
		
		StringTokenizer st = new StringTokenizer(str, ",");
		n=0;
		while(st.hasMoreTokens()) {
			String s = st.nextToken();
			System.out.print(s+"|");
			n++;
		}
		System.out.println("����:"+n+"\n\n");
	}
}

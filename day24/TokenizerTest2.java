package day24;

import java.util.StringTokenizer;

public class TokenizerTest2 {
	public static void main(String[] args) {
		String str="1,È«±æµ¿,100,100,100|2,±è±æµ¿,90,85,77|3,ÀÌ±æµ¿,80,70,60";
		
		StringTokenizer st = new StringTokenizer(str,"|");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			
//			System.out.println(token);
			
			StringTokenizer st2 = new StringTokenizer(token, ",");
			while(st2.hasMoreTokens()) {
				String s = st2.nextToken();
				System.out.println(s);
			}
			System.out.println("-----------------");
		}//while
		
		System.out.println("\n========split()===========");
		
		String[] strArr = str.split("\\|");
		
		for(int i=0;i<strArr.length;i++) {
			String[] strArr2 = strArr[i].split(",");
			for(int j=0;j<strArr2.length;j++) {
				System.out.println(strArr2[j]);
			}
			System.out.println("-----------------");
		}
		
		
	}
}
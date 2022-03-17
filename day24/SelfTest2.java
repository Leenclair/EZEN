package day24;

public class SelfTest2 {

	public static void main(String[] args) {
		//public StringBuilder reverse()
		
		String str = "ABCDEFG";
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		System.out.println(sb);
		
		String str2 = "990107-1112222";
		StringBuilder sb2 = new StringBuilder(str2);
		int bar = sb2.lastIndexOf("-");
		sb2.deleteCharAt(bar);
		System.out.println(sb2);
	}

}

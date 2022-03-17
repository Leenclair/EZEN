package day24;

class Man{}

public class HashCodeTest {
	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
	
		String str3="abc";
		String str4="abc";
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		//str1, str2�� ���ڿ��� ������ �����Ƿ� ������ �ؽ��ڵ� ���� ��´�
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		//��ü�� �ּҰ� ����=> str1, str2�� �ٸ� �ؽ��ڵ尪�� ���´�
		
		/*
		  String Ŭ������ ���ڿ��� ������ ������, ������ �ؽ��ڵ带 ��ȯ��
		  ���� hashCode �޼��带 �������̵��Ͽ���
		  System.identityHashCode(Object x)
		  - ��ü�� �ּҰ����� �ؽ��ڵ带 ����
		  => ��� ��ü�� ���� �׻� �ٸ� �ؽ��ڵ尪�� ��ȯ��
		*/
		
		Integer n1=10, n2=30;
		System.out.println("\n=====Integer=====");
		System.out.println(n1.hashCode());
		System.out.println(n2.hashCode());
		System.out.println(System.identityHashCode(n1));
		System.out.println(System.identityHashCode(n2));
		
		Man m1 = new Man();
		Man m2 = new Man();
		System.out.println("\n=====Man======");
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
		System.out.println(System.identityHashCode(m1));
		System.out.println(System.identityHashCode(m2));
		
	}
}
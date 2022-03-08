package day21.collection;

import java.util.ArrayList;

public class ArrayListTest1 {

	public static void main(String[] args) {
		/*
		 ���׸���(Generics)
		 - jdk 5.0�� �߰��� ���
		 - �÷��ǿ� ������ ��ü�� Ÿ���� ����
		 - �������� �ڵ����� ����ȯ���� 
		  
		 �÷���Ŭ����<������ ��ü�� Ÿ��> ������ = new �÷���Ŭ����<������ ��ü�� Ÿ��>(); 
		*/
		
		/*
		 Boxing - ���ÿ� ����� �⺻�ڷ��� �����͸� �������� ���������� ��ȯ�ϴ� �� 
					�ڽ��� ���ִ� Ŭ������ Wrapper Ŭ�����̴�
					
 		 UnBoxing - �������� �����͸� �⺻������ ��ȯ
		*/
		
		//Generics //�� �ܿ켼��
		
		ArrayList<Integer> list = new ArrayList<Integer>(4);
		
		//������ ����
		list.add(10); //autoboxing : int => Integer
		list.add(30);
		list.add(77);
		
		System.out.println("size:"+list.size()); //3
		
		//������ �о����
		for(int i=0;i<list.size();i++) {
			int n=list.get(i); //unboxing : Integer => int
			System.out.println(n);
		}
		
		//������ ����
		list.remove(0);
		
		System.out.println("\n���� ��");
		for(int n : list) {
			System.out.println(n);
		}//for
		
		//for�� �ȿ��� �ʱ�ȭ
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		for(int i=0;i<4;i++) {
			list2.add(i*2);
		}
		
		System.out.println("\n======================");
		for(int i=0;i<list2.size();i++) {
			int num=list2.get(i);
			System.out.println(num);
		}
	}

}
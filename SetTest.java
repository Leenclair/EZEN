package day22;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest {

	public static void main(String[] args) {
		/*
		 HastTest
		 - ���� �������� �ʴ´�
		 - �ߺ� ���� ������� �ʴ´�
		*/
		
		HashSet<String> hset = new HashSet<String>();
		
		hset.add("first");
		hset.add("second");
		hset.add("third");
		hset.add("first");
		
		System.out.println("����� ������ �� : " +hset.size());
		
		Iterator<String> iter = hset.iterator();
		while(iter.hasNext()) {
			String s = iter.next();
			System.out.println(s);
		}
		
		/*
		 Enumeration, Iterator
		 - �÷��ǿ� ����� ��Ҹ� �����ϴµ� ���Ǵ� �������̽�
		 
		 Collection �������̽����� Iterator(Iterator�� ������ Ŭ������ �ν��Ͻ�)��
		 ��ȯ�ϴ� iterator()�� ����
		
		 Iterator<E> iterator()
		 
		 boolean hasNext()
		 - �о� �� ��Ұ� �����ִ��� Ȯ����. ������ true, ������ false
		 
		 Object next()
		 - ���� ��Ҹ� �о��
		*/
	}
}
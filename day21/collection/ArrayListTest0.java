package day21.collection;

import java.util.ArrayList;

public class ArrayListTest0 {

	public static void main(String[] args) {
		/*
		�÷��� - �������� ������ ���� ���ǵ� Ŭ����
		�÷��� �����ӿ�ũ - ������ �׷��� �����ϴ� Ŭ�������� ǥ��ȭ�� ����
		 				��� �÷��� Ŭ������ ǥ��ȭ�� ������� �ٷ� �� �ֵ��� ü��ȭ��
		
		�޸��� ����� �������� Ȯ���� �� �ִ�
		�ٽ� �������̽�
		[1] List
			������ �����Ǹ�, �������� �ߺ��� �����
			���� Ŭ���� = ArrayList, Vector
			
		[2] Set
			������ �������� ������, �������� �ߺ��� ������� ����
			HashSet
			
		[3] Map
			Ű�� ��(Value)�� ������ �̷���� ������ ����
			������ �������� ������, Ű�� �ߺ� ������� �ʰ�, ���� �ߺ� ���
			HashMap, Hashtable, Properies
			
		List, Set, �� �θ� - Collection
		
		Vector, ArrayList - Object �迭�� �̿��ؼ� �����͸� ���������� ������
		*/
		
		ArrayList list = new ArrayList(3);
		
		//������ ����
		list.add(new Integer(10));	//Jdk 5.0���� - �÷��ǿ� ���� ������ �� ��ü��
									//�����ؾ� �ϹǷ� Wrapper Ŭ���� �̿�
		list.add(new Integer(20));
		list.add(40); //Jdk 5.0 - autoboxing: �⺻ �ڷ����� �����Ϸ��� ���� �ڵ�����
					//Wrapper Ŭ������ ��ȯ�Ǿ� ����
		
		System.out.println("ArrayList ũ��:"+list.size()+"\n");
		
		//������ ����
		for(int i=0;i<list.size();i++) {
			Object obj = list.get(i);
			Integer n = (Integer)obj;
			int num = n.intValue();
			/*
			 int intValue()
			 - Returns the value of this Integer as an int
			 */
			System.out.println(num);
		}
		
		list.add(new Double(3.14));
		list.add("java");
		
		Double d = (Double)list.get(3);
		System.out.println("\n"+d);

	}
}
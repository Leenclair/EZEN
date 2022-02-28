package day14;

public class ArrayClassTest {

	public static void main(String[] args) {
		/*
		 1. int�迭�� ���� 3�� �ְ� ���(for, Ȯ��for) - �� ����
		 
		 2. String�迭�� ���ɸ޴� 4�� �ְ�, ���(for, Ȯ��for) - �� ����
		 
		*/
	
		//1.
		int[] arr = new int[3];
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
		
		System.out.println("\n=========Ȯ��for========");
		for(int i:arr) {
			System.out.print(i+"\t");
		}
		
		System.out.println("\n");
		//2.
		String[] arr2 = new String[4];
		arr2[0] = "���";
		arr2[1] = "�ܹ���";
		arr2[2] = "����";
		arr2[3] = "������";
		
		for(int i=0; i<arr2.length;i++) {
			System.out.print(arr2[i]+"\t");
		}
		
		System.out.println("\n=========Ȯ��for========");
		for(String str:arr2) {
			System.out.print(str+"\t");
		}
		System.out.println("\n");
		//���� - ������ �� ���� �����ϱ� ���� �����(�޸� ����)
		//�迭 - ������ ���� ���� �����ϱ� ���� �����
		int a=10;
		String s = "java";
		Account acc =  new Account("010-12-1234", 10000); //��ü����
		Account acc2;
		acc2 = new Account("010-12-1234", 10000);
		
		acc.display(); //��������.�޼���() ȣ��
		
		//�迭�� �� �ֱ�
		Account[] accArr = new Account[3];
		accArr[0]= new Account("010-234-11", 1000000);
		accArr[1]= new Account("010-234-12", 1000000);
		Account acc3 = new Account("010-100-4001", 300000);
		accArr[2]= acc3;//acc3 : ��������, accArr[2]��� �迭��ҵ� ��������(�ּҰ� ��)
				
		/*
		  int�迭���� int�� �ִ´�
		  String�迭���� String�� �ִ´�
		  
		  [1]Account�迭���� Account�� �ִ´�
		  => ? new �� ��ü�����ؼ� �ִ´�
		  
		  [2]for�� �ȿ��� ��������.�޼���() ȣ��
		*/
		
		/*
		accArr[0].display();
		accArr[1].display();
		accArr[2].display();
		*/
		
		for(int i=0;i<accArr.length;i++) {
			accArr[i].display(); //��������.�޼���() ȣ��
		}
		
		System.out.println("\n======Ȯ��for=======");
		for(Account acc4 : accArr) {
			acc4.display();
		}//for
	}

}
package day15;

import day14.MyParent;

class MyChild extends MyParent{
	public void putData() {
		//num1=10;  //private, error
		num2=20;  //protected
		//num3=30;  //default, error
		num4=40;  //public
	}
}

public class ProtectedTest {

	public static void main(String[] args) {
		MyChild ch = new MyChild();
		//ch.num1 = 300; //num1 is not visible, private, error
		//ch.num2 = 404; //num1 is not visible, protected, error
		//ch.num3=500;  //num1 is not visible, default, error
		ch.num4=600;	//public
	
		/*
		 protected
		 - ���� ��Ű���� �����̰�, �ٸ� ��Ű���� �ִ��� ��Ӱ��迡���� ������ ���
		 - �ܺο� �ڽ��� ����� ���߰� �ڽ� Ŭ�������Ը� ����� ������
		 - ����Ÿ�ӿ��� default, Ŭ���� ������ Ÿ�ӿ� �ڽĿ��Դ� public 
		 */
	}

}

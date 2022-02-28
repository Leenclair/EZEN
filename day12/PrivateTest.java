package day12;

import day11.BBB;

/*
 ���� ������(���� ������)
 - ����� Ŭ������ ���Ǿ�, �ܺο��� �������� ���ϵ��� �����ϴ� ����
 - Ŭ���� ������ ����� �����ϰų� ���� �� ���
 
  private - ���� Ŭ���� �������� ���� ����
  default(������) - ���� ��Ű�� �������� ���� ����
  protected - ���� ��Ű���� ���� �ٸ� ��Ű�������� ��Ӱ��谡 ������ ���� ����
  public - ��𼭳� ���� ����
  
  private < default < protected < public
  
  Ŭ���� - public, default �� ��� ����
  �޼���, ������� - public, protected, default, private
  �������� - ���Ұ�
  
  ��������� private���� ����
  �޼���� public���� ����
 */

public class PrivateTest {
	public static void main(String[] args) {
		AAA obj = new AAA();
		obj.showInfo();
		
		//obj.x=20; //error : The field AAA.x is not visible
		obj.y=1;
		obj.z=2;
		obj.n=3;
		
		BBB b = new BBB();
		b.showInfo();
		
		//b.x=11; //The field BBB.x is not visible
		//b.y=12; //error
		//b.z=13; //error
		b.n=14;
		
	}
}
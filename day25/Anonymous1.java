package day25;

/*
 �͸� Ŭ���� - �̸��� ����
 		  - Ŭ������ ����� ��ü�� ������ ���ÿ� ��
 		    �� �ѹ��� ���� �� �ְ�, ���� �ϳ��� ��ü���� ������ �� �ִ� ��ȸ�� Ŭ����
 		    
 new Ŭ������(){
 }
 
 new �������̽���(){
 
 }
 */

public class Anonymous1 {
		Object iv = new Object() {
			void method() {}
		};
		
		static Object cv = new Object() {
			void method() {}
		};
		
		void myMethod() {
			Object lv = new Object() {
				void method() {}
			};
		
	}
}
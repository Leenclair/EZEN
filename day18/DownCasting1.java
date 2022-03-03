package day18;

/*
  ������ ������ ����ȯ�� ����
  ��, ���� ��Ӱ��迡 �ִ� Ŭ�� ���̿����� ����
  
  �θ�Ÿ�� <- �ڽ� Ÿ�� (up-casting, ������, �ڵ�����ȯ)
  �ڽ�Ÿ���� ���������� �θ� Ÿ������ ����ȯ�ϴ� ��쿡�� ����ȯ �����ϴ�
  
  �ڽ�Ÿ�� <- �θ�Ÿ��(Down-casting, ����� ����ȯ, ����ȯ �����Ұ�)
  
  Parent p = new Child(); //�ڵ�����ȯ
  Child ch = (Child)p; //����� ����ȯ
  
  Child c = (Child)new Parent(); //���࿡��!! (�������� ��)
 */

class Car{
	protected String color;
	protected int door;
	
	public void drive() {
		System.out.println("driver~~");

	}
	public void stop() {
		System.out.println("stop!");
	}
}

class FireEngine extends Car{
	public void water() {
		System.out.println("water!!");
	}
	
	public void drive() {
		System.out.println("�ҹ����� �����մϴ�");
	}
}

class Ambulance extends Car{
	public void siren() {
		System.out.println("siren~~");
	}
	
	public void drive() {
		System.out.println("�ں深���� �����մϴ�");
	}
}
public class DownCasting1 {
	public static void main(String[] args) {
		Car c = new FireEngine(); //��ĳ����, ������, �ڵ�����ȯ
		c.drive();
		//c.water(); //error:�ڽĸ��� �޼��� ȣ�� �Ұ�!
		
		FireEngine f = (FireEngine)c;//�ٿ�ĳ����, ����� ����ȯ
		f.water();//�ڽĸ��� �޼��嵵 ȣ�� ��������
		
		//FireEngine fe = (FireEngine)new Car(); //�������� �ǳ� ���࿡�� �߻�
		//ClassCastExcetion : Car cannot be cast to class FireEngine
		
		c = new Ambulance();
		Ambulance am = (Ambulance)c;//�ٿ�ĳ����
		am.siren();
		
		/*
		  instanceof ������ - ���������� �����ϰ� �ִ� �ν��Ͻ��� ���� Ÿ���� �˾ƺ��� ���� ���
		  
		  �������� instanceof Ÿ��(Ŭ������)
		  => ���������� �ش� Ŭ������ �ν��Ͻ����� Ȯ��,
		  ������ true, �ƴϸ� false����
		  
		  true�̸� ���������� �˻��� Ÿ������ ����ȯ�� �����ϴٴ� �ǹ�
		 */
		
		System.out.println("\n===============");
		if(c instanceof FireEngine) {
			FireEngine f2 = (FireEngine)c;
			f2.water();
		}else if(c instanceof Ambulance) {
			Ambulance am2 = (Ambulance)c;
			am2.siren();
		}else {
			System.out.println("����ȯ �Ұ�!");
		}
		
		/*
		  �ڽ� instanceof �θ� : true
		  => �ڽ��� �θ��� �ν��Ͻ��̱⵵ �ϹǷ�
		  �θ�Ÿ���� instanceof ���꿡�� true
		 */
		
		FireEngine f3 = new FireEngine();
		if(f3 instanceof FireEngine) {
			System.out.println("f3�� FireEngine�� �ν��Ͻ�!");
		}
		if(f3 instanceof Car) {
			System.out.println("f3�� Car�� �ν��Ͻ��̱⵵ �ϴ�!");
		}
		if(f3 instanceof Object) {
			System.out.println("f3�� Object�� �ν��Ͻ��̱⵵ �ϴ�!");
		}
	}

}

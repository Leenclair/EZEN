package day18;

public class DownCastArray {
	public static void main(String[] args) {
		//Car�迭�� ��� 3�� �ְ�, drive() �޼��� ȣ��(for, Ȯ��for)
		Car[] cArr = new Car[3]; 
		cArr[0] = new FireEngine();
		cArr[1] = new Ambulance();
		cArr[2] = new FireEngine();
		
		System.out.println("=====Car[].drive=>for=====");
		for(int i=0;i<cArr.length;i++) {
			cArr[i].drive();
		}
		
		System.out.println("\n=====Car[].drive=>Ȯ��for=====");
		for(Car c : cArr) {
			c.drive();
		}
		
		System.out.println("\n=====downcasting=====");
		for(int i=0;i<cArr.length;i++) {
			if(cArr[i] instanceof FireEngine) {
				FireEngine f = (FireEngine)cArr[i];
				f.water();
			}else if(cArr[i] instanceof Ambulance) {
				Ambulance am = (Ambulance)cArr[i];
				am.siren();
			}			
		}//for
		
		System.out.println("\n=====Ȯ�� for=====");
		for(Car c : cArr) {
			if(c instanceof FireEngine) {
				FireEngine f = (FireEngine)c;
				f.water();
			}else if(c instanceof Ambulance) {
				Ambulance am = (Ambulance)c;
				am.siren();
			}			
		}//for
		
	}
}

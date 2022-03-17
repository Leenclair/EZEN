package day24;
 /*
 finalize() 메서드
 - 인스턴스가 소멸되기 직전에 자바 가상머신에 의해서 자동으로 호출되는 메서드 
 */

class MyName{
	private String objName;
	
	MyName(String objName){
		this.objName = objName;
	}
	
	//오버라이딩
	protected void finalize() throws Throwable{
		super.finalize();
		System.out.println(objName+"이 소멸되었습니다.");
	}
}

public class FinalizeTest {
	public static void main(String[] args) {
		MyName obj1 = new MyName("인스턴스1");
		MyName obj2 = new MyName("인스턴스2");
//		obj1 = null;
//		obj2 = null;
		obj1=obj2; //gb-인스턴스1
		obj2=null; //gb-없음
		obj1=null; //gb-인스턴스2
		System.out.println("\n프로그램을 종료합니다.");
		
		//finalize 메서드의 완벽한 호출이 필요한 상황에서는 다음 두 메서드의 연이은 호출이 필요함
		System.gc();
		System.runFinalization();
	}
}

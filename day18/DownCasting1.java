package day18;

/*
  참조형 변수도 형변환이 가능
  단, 서로 상속관계에 있는 클라스 사이에서만 가능
  
  부모타입 <- 자식 타입 (up-casting, 다형성, 자동형변환)
  자식타입의 참조변수를 부모 타입으로 형변환하는 경우에는 형변환 생략하능
  
  자식타입 <- 부모타입(Down-casting, 명시적 형변환, 형변환 생략불가)
  
  Parent p = new Child(); //자동형변환
  Child ch = (Child)p; //명시적 형번환
  
  Child c = (Child)new Parent(); //실행에러!! (컴파일은 됨)
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
		System.out.println("소방차를 운전합니다");
	}
}

class Ambulance extends Car{
	public void siren() {
		System.out.println("siren~~");
	}
	
	public void drive() {
		System.out.println("앰뷸런스를 운전합니다");
	}
}
public class DownCasting1 {
	public static void main(String[] args) {
		Car c = new FireEngine(); //업캐스팅, 다형성, 자동형변환
		c.drive();
		//c.water(); //error:자식만의 메서드 호출 불가!
		
		FireEngine f = (FireEngine)c;//다운캐스팅, 명시적 형변환
		f.water();//자식만의 메서드도 호출 가능해짐
		
		//FireEngine fe = (FireEngine)new Car(); //컴파일은 되나 실행에러 발생
		//ClassCastExcetion : Car cannot be cast to class FireEngine
		
		c = new Ambulance();
		Ambulance am = (Ambulance)c;//다운캐스팅
		am.siren();
		
		/*
		  instanceof 연산자 - 참조변수가 참조하고 있는 인스턴스의 실제 타입을 알아보기 위해 사용
		  
		  참조변수 instanceof 타입(클래스명)
		  => 참조변수가 해당 클래스의 인스턴스인지 확인,
		  맞으면 true, 아니면 false리턴
		  
		  true이면 참조변수가 검사한 타입으로 형변환이 가능하다는 의미
		 */
		
		System.out.println("\n===============");
		if(c instanceof FireEngine) {
			FireEngine f2 = (FireEngine)c;
			f2.water();
		}else if(c instanceof Ambulance) {
			Ambulance am2 = (Ambulance)c;
			am2.siren();
		}else {
			System.out.println("형변환 불가!");
		}
		
		/*
		  자식 instanceof 부모 : true
		  => 자식은 부모의 인스턴스이기도 하므로
		  부모타입의 instanceof 연산에도 true
		 */
		
		FireEngine f3 = new FireEngine();
		if(f3 instanceof FireEngine) {
			System.out.println("f3은 FireEngine의 인스턴스!");
		}
		if(f3 instanceof Car) {
			System.out.println("f3은 Car의 인스턴스이기도 하다!");
		}
		if(f3 instanceof Object) {
			System.out.println("f3은 Object의 인스턴스이기도 하다!");
		}
	}

}

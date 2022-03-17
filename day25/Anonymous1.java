package day25;

/*
 익명 클래스 - 이름이 없다
 		  - 클래스의 선언과 객체의 생성을 동시에 함
 		    단 한번만 사용될 수 있고, 오직 하나의 객체만을 생성할 수 있는 일회용 클래스
 		    
 new 클래스명(){
 }
 
 new 인터페이스명(){
 
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
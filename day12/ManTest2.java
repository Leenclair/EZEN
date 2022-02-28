package day12;

class Man2{
	private int age;
	int height;
	
	public int getAge() {//읽기
		return age;
	}
	
	public void setAge(int p_age) {//쓰기,저장
		if(p_age<1) {
		age=1;
		}else if(p_age>170) {
			System.out.println("나이가 잘못 들어왔어요!");
			return;
		}else {
		age=p_age;
		}
	}
}
public class ManTest2 {
	public static void main(String[] args) {
		Man2 m = new Man2();
		m.height=1800;
		//m.age=20; //error
		m.setAge(20); //setter이용해서 값을 저장
		
		System.out.println("키 : "+m.height);
		//System.out.println("나이 : "+m.age);//error
		System.out.println("나이 : "+m.getAge()); //getter이용해서 값을 읽어온다
		
		m.setAge(0);
		System.out.println("나이 : "+m.getAge()); //1
		
		m.setAge(190);
		System.out.println("나이 : "+m.getAge()); //1
		
	}

}
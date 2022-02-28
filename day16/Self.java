package day16;

class Person4{
	protected String name;
	protected int age;
	
	Person4(String name, int age){
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

class Student4 extends Person4{
	protected String stNo;
	Student4(String name, int age, String stNo){
		super(name, age);
		this.stNo = stNo;
	}
	
	public void study() {
		System.out.println("공부한다");
	}
}

class Graduate4 extends Student4{
	protected String major;
	
	Graduate4(String name, int age, String stNo, String major){
		super(name, age, stNo);
		this.major = major;
	}
	
	public void writeThesis() {
		System.out.println("논문을 쓴다");
	}
}

public class Self {
	public static void main(String[] args) {
		Graduate4 gr = new Graduate4("홍길동", 30, "20153215", "java");
		gr.writeThesis();
	}
}

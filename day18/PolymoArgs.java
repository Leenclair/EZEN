package day18;
class Person
{
	public String kind()
	{
		return "���";
	}
};
class Student extends Person
{
	public String kind()
	{
		return "�л�";
	}
};
class Graduate extends Student
{
	public String kind()
	{
		return "���п���";
	}
};
class Assistant extends Person
{
	public String kind()
	{
		return "����";
	}
};
class Professor extends Person
{
	public String kind()
	{
		return "����";
	}
}


public class PolymoArgs {
	/*
	public static void register(Student st) {
		System.out.println(st.kind()+ "��/�� ����մϴ�.");
	}
	public static void register(Graduate gr) {
		System.out.println(gr.kind()+ "��/�� ����մϴ�.");
	}
	public static void register(Assistant ass) {
		System.out.println(ass.kind()+ "��/�� ����մϴ�.");
	}
	*/
	
	//public static void register(Person p) {
	//	if(p instanceof Student || p instanceof Graduate ||p instanceof Assistant) {
	public static void register(Person p) {
		if(p instanceof Student ||p instanceof Assistant) {
			//�ڽ��� �θ��� �ν��Ͻ��̱⵵ �ϴ� : �ڽ� instance �θ� => true
		System.out.println(p.kind()+ "��/�� ����մϴ�.");
		}else {
			System.out.println(p.kind()+"��/�� ����� �� �����ϴ�.");
		}
	}
	
	public static void main(String[] args) {
		register(new Student());
		register(new Graduate());
		register(new Assistant());
		}
	}

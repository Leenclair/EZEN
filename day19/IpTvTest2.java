package day19;

interface Tv2{
	void onTv();
}

interface Computer2{
	public void dataReceive();
}

//��Ӱ� ������ ���ÿ� �� �� �ִ�
class IPTv2 implements Tv2, Computer2{
	public void dataReceive() {
		System.out.println("���� ������ ���� ��");
	}
	
	public void onTv(){
		System.out.println("�������!");
	}
	
	public void powerOn() {
		dataReceive();
		onTv();
	}
}

public class IpTvTest2 {
	public static void main(String[] args) {
		IPTv2 obj = new IPTv2();
		obj.powerOn();
	}
}
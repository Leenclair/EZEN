package day19;

interface Tv2{
	void onTv();
}

interface Computer2{
	public void dataReceive();
}

//상속과 구현을 동시에 할 수 있다
class IPTv2 implements Tv2, Computer2{
	public void dataReceive() {
		System.out.println("영상 데이터 수신 중");
	}
	
	public void onTv(){
		System.out.println("영상출력!");
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
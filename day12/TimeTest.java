package day12;

import java.util.Scanner;

class Time{
	int hour, minute, second;
	
	Time(int p_hour, int p_minute, int p_second){
		hour = p_hour;
		minute = p_minute;
		second = p_second;
	}
	
	public void toTime() {
		System.out.println(hour+"��"+minute+"��"+second+"��");
		System.out.println("�ʷ� ȯ���ϸ�"+((hour*60*60)+(minute*60)+second));
	}

}

public class TimeTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��, ��, �ʸ� �Է��ϼ���");
		int hour = sc.nextInt();
		int min = sc.nextInt();
		int sec = sc.nextInt();
		
		Time time = new Time(hour, min, sec);
		time.toTime();
		
	}

}

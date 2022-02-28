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
		System.out.println(hour+"시"+minute+"분"+second+"초");
		System.out.println("초로 환산하면"+((hour*60*60)+(minute*60)+second));
	}

}

public class TimeTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("시, 분, 초를 입력하세요");
		int hour = sc.nextInt();
		int min = sc.nextInt();
		int sec = sc.nextInt();
		
		Time time = new Time(hour, min, sec);
		time.toTime();
		
	}

}

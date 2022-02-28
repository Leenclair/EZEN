package day12;

import java.util.Scanner;

class Score{
	private int kor;
	private int eng;
	private int math;
	
	Score(int p_kor, int p_eng, int p_math){
		kor = p_kor;
		eng = p_eng;
		math = p_math;
	}
	
	public int getKor() {
		return kor;
	}
	public void setKor(int k) {
		kor = k;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int e) {
		eng = e;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int m) {
		math = m;
	}
	
	public int sum() {
		return kor+eng+math;
	}
	
	public float avg() {
		return (float)(Math.round(sum()*100/3)/100.0);
	}
}


public class day12_Hw_이창수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("국어, 영어, 수학 점수를 입력하세요");
		int kor=sc.nextInt();
		int eng=sc.nextInt();
		int math=sc.nextInt();
		
		Score score = new Score(kor, eng, math);
		int sum = score.sum();
		float avg = score.avg();
		
		System.out.println("총점="+sum+", 평균="+avg);
		System.out.println("=======값 변경=====");
		
		score.setKor(99);
		score.setEng(99);
		score.setMath(99);
		
		System.out.println("국어:"+score.getKor()+", 영어:"+score.getEng()+", 수학:"+score.getMath());
		System.out.println("총점="+score.sum()+", 평균="+score.avg());
		
		
	}

}

package day24;

import java.util.ArrayList;
import java.util.Scanner;

public class day24_과제1_이창수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("배열의 개수를 입력하세요<짝수로>");
			int input = sc.nextInt();
			sc.nextLine();
			if(input%2!=0) return;
			
			input /= 2;
			ArrayList<Integer> list = new ArrayList<Integer>(input);
			
			for(int i=0;i<input;i++) {
				list.add((int)(Math.random()*input));
			}
			
			if(list.size()<2) {
				for(int i=0;i<list.size();i++) {
					int n = list.get(i);
					System.out.println(n+" ");
				}
				System.out.println("Quit?<Y/N>");
				String type = sc.nextLine();
				if(type.equalsIgnoreCase("n")) {
					continue;
				}else return;
			}else {
				for(int i=0;i<input;i++) {
					list.add((int)(Math.random()*input));
				}
				
				for(int i=0;i<list.size();i++) {
					int n = list.get(i);
					System.out.print(n+" ");
				}
				System.out.println("\nQuit?<Y/N>");
				String type = sc.nextLine();
				if(type.equalsIgnoreCase("n")) {
					continue;
				}else return;
			}
		}
	}
}
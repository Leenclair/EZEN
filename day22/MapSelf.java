package day22;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class MapSelf {

	public static void main(String[] args) {
		ArrayList<Character> list = new ArrayList<Character>();
		char ch = 'A';
		
		for(int i=0;i<26;i++) {
			list.add(ch);
			ch++;
		}
		
		System.out.println("=======ArrayList�̿�=========");
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		
		System.out.println("\n=======Ȯ�� for=========");
		for(char ch2 : list) System.out.print(ch2+" ");
		
		System.out.println("\n=======HashMap�̿�=========");
		HashMap<Integer, Character> h = new HashMap<Integer, Character>();
		
		for(int i=0;i<26;i++) {
			h.put(i, ((char)(i+65)));
		}
		
		Iterator<Integer> it = h.keySet().iterator();
		while(it.hasNext()) {
			System.out.print(h.get(it.next())+" ");
		}

		System.out.println("\n=======for=========");
		for(int i=0;i<h.size();i++) {
			System.out.print(h.get(i)+" ");
		}
		
		
		System.out.println("\n=======HashSet �̿�=========");
		HashSet<Character> hset = new HashSet<Character>();
		ch = 'A';
		for(int i=0;i<26;i++) {
			hset.add(ch++);
		}
		
		Iterator<Character> iset = hset.iterator();
		while(iset.hasNext()) {
			System.out.print(iset.next()+" ");
		}
		
		System.out.println("\n=======================");
		Scanner sc = new Scanner(System.in);

		HashMap<String, String> hmap = new HashMap<String,String>();
		hmap.put("boy", "�ҳ�");
		hmap.put("girl", "�ҳ�");
		hmap.put("school", "�б�");
		
		System.out.print("\ngirl, boy, school ���� �˻� : ");
		String s = sc.nextLine();
		System.out.println(s+" => "+hmap.get(s));
	}
}

package day21.collection;

import java.util.ArrayList;

public class ArrayListSelf1 {

	public static void main(String[] args) {
		ArrayList<Double> list = new ArrayList<Double>(4);
		list.add(3.14);
		list.add(5.87);
		list.add(2.476);
		
		for(int i=0;i<list.size();i++) {
			double n=list.get(i);
			System.out.println(n);
		}
		
		ArrayList<String> list2 = new ArrayList<String>(5);
		for(int i=0;i<5;i++) list2.add("Hello Java");
		
		for(int i=0;i<list2.size();i++) {
			System.out.println((i+1)+" : "+list2.get(i));
			}
		
		
	}

}

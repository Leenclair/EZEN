package day22;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ListSelf {

	public static void main(String[] args) {
		ArrayList<Double> dArrList = new ArrayList<Double>();
		double d = 1.5;
		for(int i = 0; i < 4; i++) {
			dArrList.add(d);
			d+=1;
		}
		
		System.out.println("\n====ArrayList====");
		System.out.println("for");
		for(int i = 0; i < dArrList.size(); i++) {
			System.out.println(dArrList.get(i));
		}
		
		System.out.println("확장 for");
		for(double d2 : dArrList) {
			System.out.println(d2);
		}
		
		System.out.println("\nHashSet iterator<> 이용");
		d = 1.5;
		HashSet<Double> hSet = new HashSet<Double>();
		for(int i = 0; i < 4; i++) {
			hSet.add(d);
			d+=1;
		}
		
		Iterator<Double> iHas = hSet.iterator();
		while(iHas.hasNext()) {
			double d2 = iHas.next();
			System.out.println(d2);
		}
	}
}

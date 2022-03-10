package day22;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class ListTest {
	public static void main(String[] args) {
		ArrayList<Member> list = new ArrayList<Member>();
		list.add(new Member("lee", "이길동"));
		list.add(new Member("Kim", "김길동"));
		
		Iterator<Member> iter = list.iterator();
		while(iter.hasNext()) {
			Member m = iter.next();
			System.out.println(m);
		}
		
		Vector<Member> vec = new Vector<Member>();
		vec.add(new Member("lee","이길동"));
		vec.add(new Member("park","박길동"));
		
		System.out.println("==========================");
		Enumeration<Member> en = vec.elements();
		while(en.hasMoreElements()) {
			Member m = en.nextElement();
			System.out.println(m);
		}
		
		System.out.println("==========================");
		for(int i=0;i<vec.size();i++) {
			Member m = vec.get(i);
			System.out.println(m);
		}
	}
}

package day25.etc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;

public class LambdaTest2 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("1. 홍길동");
		list.add("2. 김길동");
		list.add("3. 이길동");
		list.add("4. 박길동");
		list.add("5. 정길동");
		
		// Iterator는 일회용이기 때문에 한번만 사용할 수 있음
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			String s = iter.next();
			System.out.println(s);
		}
		
		// Iterator가 일회용이기 때문에 필요하면 다시 얻어와야 함
		iter = list.iterator();
		
		//forEachRemaining 이용
		System.out.println("\n=================");
		
		//default void forEachRemaining(Consumer<? super String> action)
		iter.forEachRemaining(n->System.out.println(n));
		
		System.out.println();
		iter=list.iterator();
		iter.forEachRemaining(System.out::println);
		
		
		iter=list.iterator();
		System.out.println("\n\n-------------------");
		iter.forEachRemaining(new Consumer<String>() {//익명클래스

			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});
		
		System.out.println("\n\n");
		iter = list.iterator();
		Map<String, String> map = new HashMap<String, String>();
		iter.forEachRemaining(name->map.put(name, name));
		map.forEach((k,v)->System.out.println(k+":"+v));
		
		Map<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(1, "java");
		map2.put(2, "spring");
		map2.put(3, "oracle");
		
		//void forEach(BiConsumer<? super Integer, ? super String> action)
		System.out.println("\n========map2==========");
		map2.forEach((k,v)->System.out.println(k+" => "+v));
		
		System.out.println("\n");
		map2.keySet().iterator()
		.forEachRemaining(k->System.out.println(k+" - "+map2.get(k)));
		
		//Collection<String> java.util.Map.values()
		//Optional<String> java.util.stream.Stream.findAny()
		System.out.println("\n====Optional===========");
		Optional<String> str
		= map2.values().stream().filter(s->s.equals("spring")).findAny();
		
		if(str.isPresent()) {
			System.out.println(str.get()+"\n");
		}
		
		
		Member m =func1();
		if(m!=null) {
			m.showInfo();
		}
		
		Member m2 = func2();
		if(m2!=null) {
			m2.showInfo();
		}else {
			System.out.println("null!!\n");
		}
		
		Optional<Member> opt = func3();
		if(opt.isPresent()) {
			Member m3 = opt.get();
			m3.showInfo();
		}
	}
	
	public static Member func1() {
		Member m = new Member(1,"홍길동");
		return m;
	}

	public static Member func2() {
		Member m = null;
		return m;
	}
	
	//위의 두개는 null 체크 일일이 해야하는데 Optional하면 null 체크가 쉽다
	public static Optional<Member> func3() {
		Member m = new Member(2, "김길동");
		return Optional.ofNullable(m);
	}
}

class Member{
	private int no;
	private String name;
	
	Member(int no, String name){
		this.no = no;
		this.name = name;
	}
	
	public void showInfo() {
		System.out.println("번호:"+no);
		System.out.println("이름:"+name+"\n");
	}
	
}
package day14;

public class ArrayClassTest {

	public static void main(String[] args) {
		/*
		 1. int배열에 정수 3개 넣고 출력(for, 확장for) - 다 따로
		 
		 2. String배열에 점심메뉴 4개 넣고, 출력(for, 확장for) - 다 따로
		 
		*/
	
		//1.
		int[] arr = new int[3];
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
		
		System.out.println("\n=========확장for========");
		for(int i:arr) {
			System.out.print(i+"\t");
		}
		
		System.out.println("\n");
		//2.
		String[] arr2 = new String[4];
		arr2[0] = "김밥";
		arr2[1] = "햄버거";
		arr2[2] = "피자";
		arr2[3] = "떡볶이";
		
		for(int i=0; i<arr2.length;i++) {
			System.out.print(arr2[i]+"\t");
		}
		
		System.out.println("\n=========확장for========");
		for(String str:arr2) {
			System.out.print(str+"\t");
		}
		System.out.println("\n");
		//변수 - 데이터 한 개를 저장하기 위한 저장소(메모리 공간)
		//배열 - 데이터 여러 개를 저장하기 위한 저장소
		int a=10;
		String s = "java";
		Account acc =  new Account("010-12-1234", 10000); //객체생성
		Account acc2;
		acc2 = new Account("010-12-1234", 10000);
		
		acc.display(); //참조변수.메서드() 호출
		
		//배열에 값 넣기
		Account[] accArr = new Account[3];
		accArr[0]= new Account("010-234-11", 1000000);
		accArr[1]= new Account("010-234-12", 1000000);
		Account acc3 = new Account("010-100-4001", 300000);
		accArr[2]= acc3;//acc3 : 참조변수, accArr[2]라는 배열요소도 참조변수(주소가 들어감)
				
		/*
		  int배열에는 int를 넣는다
		  String배열에는 String을 넣는다
		  
		  [1]Account배열에는 Account를 넣는다
		  => ? new 로 객체생성해서 넣는다
		  
		  [2]for문 안에서 참조변수.메서드() 호출
		*/
		
		/*
		accArr[0].display();
		accArr[1].display();
		accArr[2].display();
		*/
		
		for(int i=0;i<accArr.length;i++) {
			accArr[i].display(); //참조변수.메서드() 호출
		}
		
		System.out.println("\n======확장for=======");
		for(Account acc4 : accArr) {
			acc4.display();
		}//for
	}

}
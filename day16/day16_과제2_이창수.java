package day16;

import java.util.Scanner;

class FoodSale{
	protected String menu;
	protected int quantity;
	protected int unit;
	protected int price;
	public static int sum;
	
	FoodSale(String menu, int quantity, int unit){
		this.menu = menu;
		this.quantity = quantity;
		this.unit = unit;
	}

	public int getPrice() {
		return price;
	}

	public void finePrice() {
		this.price = quantity*unit;
	}
	
	public void findTotalPrice() {
		FoodSale.sum += price;
	}
}

class StudentFoodSale extends FoodSale{
	private int DCPrice;
	public static int totalSalePrice;
	private final double SALE_RATE = 0.1;
	
	StudentFoodSale(String menu, int quantity, int unit){
		super(menu, quantity, unit);
	}

	public int getPrice() {
		return price;
	}

	public void salesPrice() {
		this.DCPrice = (int)(quantity*unit*SALE_RATE);
	}
	
	public void findPrice() {
		this.price = quantity*unit - (int)(quantity*unit*SALE_RATE);
	}
	
	public void findTotalPrice() {
		FoodSale.sum += price;
		StudentFoodSale.totalSalePrice += DCPrice;
	}
}

public class day16_과제2_이창수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("메뉴, 수량, 단가, 학생여부<Y/N>를 입력하세요!");
			String menu = sc.nextLine();
			int quantity = sc.nextInt();
			int unit = sc.nextInt();
			sc.nextLine();
			String s = sc.nextLine();
			
			if(s.equalsIgnoreCase("Y")) {
				StudentFoodSale st = new StudentFoodSale(menu, quantity, unit);
				st.salesPrice();
				st.findPrice();
				st.findTotalPrice();
				System.out.println("판매금약="+st.getPrice()+", 누적판매금액="+FoodSale.sum+", 누적할인금액="+StudentFoodSale.totalSalePrice);
			}else if(s.equalsIgnoreCase("N")) {
				FoodSale f = new FoodSale(menu, quantity, unit);
				f.finePrice();
				f.findTotalPrice();
				System.out.println("판매금액="+f.getPrice()+", 누적판매금액="+FoodSale.sum);
			}else {
				System.out.println("잘못 입력했습니다");
			}
			System.out.println("그만하시겠습니까?<Q>uit?");
			String q = sc.nextLine();
			if(q.equalsIgnoreCase("Q")) break;
		}
	}

}
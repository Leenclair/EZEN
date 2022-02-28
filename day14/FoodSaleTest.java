package day14;

import java.util.Scanner;

class FoodSale{
	private String menu;
	private int quantity;
	private int unitPrice;
	private int salesPrice;
	
	private static float discountrate=0.15f;
	private static int totalPrice;
	
	FoodSale(String menu, int quantity, int unitPrice){
		this.menu = menu;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}
	
	public int getSalesPrice() {
		return salesPrice;
	}
	
	public static int getTotalPrice() {
		return totalPrice;
	}
	
	public void salesPrice() {
		salesPrice = (int)(quantity*unitPrice - quantity*unitPrice*discountrate);
	}
	
	public void findTotal() {
		totalPrice += salesPrice;
	}
}
public class FoodSaleTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("메뉴, 수량, 단가를 입력하세요!");
			String menu = sc.nextLine();
			int amount = sc.nextInt();
			int cost = sc.nextInt();
			FoodSale f = new FoodSale(menu, amount, cost);
			f.salesPrice();
			f.findTotal();
			System.out.println("판매금액 = " + f.getSalesPrice());
			System.out.println("판매 총 금액 = " + FoodSale.getTotalPrice());
			System.out.println("그만하시겠습니까? <Q>uit");
			sc.nextLine();
			if(sc.nextLine().equalsIgnoreCase("Q")) break;
			System.out.println();
		}
	}

}

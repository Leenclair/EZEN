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

public class day16_����2_��â�� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("�޴�, ����, �ܰ�, �л�����<Y/N>�� �Է��ϼ���!");
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
				System.out.println("�Ǹűݾ�="+st.getPrice()+", �����Ǹűݾ�="+FoodSale.sum+", �������αݾ�="+StudentFoodSale.totalSalePrice);
			}else if(s.equalsIgnoreCase("N")) {
				FoodSale f = new FoodSale(menu, quantity, unit);
				f.finePrice();
				f.findTotalPrice();
				System.out.println("�Ǹűݾ�="+f.getPrice()+", �����Ǹűݾ�="+FoodSale.sum);
			}else {
				System.out.println("�߸� �Է��߽��ϴ�");
			}
			System.out.println("�׸��Ͻðڽ��ϱ�?<Q>uit?");
			String q = sc.nextLine();
			if(q.equalsIgnoreCase("Q")) break;
		}
	}

}
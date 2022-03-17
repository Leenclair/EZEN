package day23;

public abstract class Product{
	private int price; //상품의 가격
	private int Point; //포인트 점수
	private final double POINT_RATE=0.02; //가격의 2%가 포인트점수

	Product(int price){
		this.price=price;
		this.Point = (int)(price*POINT_RATE);
	}

	public int getPrice(){
		return price;
	}

	public int getPoint(){
		return Point;
	}
}//class

class TV extends Product{
	TV(int price){
		super(price);
	}

	public String toString(){
		return "TV";
	}
}

class Computer extends Product{
	Computer(int price){
		super(price);
	}

	public String toString(){
		return "Computer";
	}
}

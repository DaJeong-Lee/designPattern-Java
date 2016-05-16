package decorator;

public class Main {
	public static void main(String[] args) {
		IBeverage beverage = new Base();
		
		beverage = new Esspresso(beverage);
		System.out.println("현재 가격 : "+beverage.getTotalPrice());
		
		beverage = new Milk(beverage);
		System.out.println("현재 가격 : "+beverage.getTotalPrice());
	}
}

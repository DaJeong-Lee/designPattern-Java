package abstractFactory01;

import abstractFactory01.gt.GtFactory;
import abstractFactory01.samchunri.SamFactory;

public class Main {
	public static void main(String[] args) {

		//삼천리나 GT자전거를 생성할 수 있음
//		BikeFactory factory = new SamFactory();
		BikeFactory factory = new GtFactory();
		
		Body body = factory.createBody();
		Wheel wheel = factory.createWheel();
		
		System.out.println(body.getClass());
		System.out.println(wheel.getClass());
	}
}

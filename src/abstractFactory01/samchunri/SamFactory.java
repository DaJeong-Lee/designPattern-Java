package abstractFactory01.samchunri;

import abstractFactory01.BikeFactory;
import abstractFactory01.Body;
import abstractFactory01.Wheel;

public class SamFactory implements BikeFactory{

	@Override
	public Body createBody() {
		return new SamBody();
	}

	@Override
	public Wheel createWheel() {
		return new SamWheel();
	}
	
}

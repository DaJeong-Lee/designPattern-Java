package abstractFactory01.gt;

import abstractFactory01.BikeFactory;
import abstractFactory01.Body;
import abstractFactory01.Wheel;

public class GtFactory implements BikeFactory{

	@Override
	public Body createBody() {
		return new GtBody();
	}

	@Override
	public Wheel createWheel() {
		return new GtWheel();
	}
	
}

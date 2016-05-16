package decorator;

public class Esspresso extends AbstAdding{

	public Esspresso(IBeverage base) {
		super(base);
	}
	
	@Override
	public int getTotalPrice() {
		return super.getTotalPrice()+100;
	}

}

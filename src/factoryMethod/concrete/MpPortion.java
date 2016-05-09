package factoryMethod.concrete;

import factoryMethod.framework.Item;

public class MpPortion implements Item{
	@Override
	public void use() {
		System.out.println("마력 회복 물약 사용");
	}

}

package factoryMethod.concrete;

import factoryMethod.framework.Item;

public class HpPortion implements Item{

	@Override
	public void use() {
		System.out.println("체력 회복 물약 사용");
	}

}

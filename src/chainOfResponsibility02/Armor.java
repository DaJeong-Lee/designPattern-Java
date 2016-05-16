package chainOfResponsibility02;

public class Armor implements Defense{

	
	private Defense nextDefense;
	
	@Override
	public void defense(Attack attack) {
		process(attack);
		
		//nextDefense(방어구가 더 있으면) 나머지도 defense해줌
		if(nextDefense != null){
			nextDefense.defense(attack);
		}
		
		
	}
	
	private void process(Attack attack){
		int amount = attack.getAmount();
		amount -= 10;
		
		attack.setAmount(amount);
		System.out.println("방어력이 -10 감소됨. 현재 남은 Attack : "+attack.getAmount());
	}

	public void setNextDefense(Defense nextDefense) {
		this.nextDefense = nextDefense;
	}

	

	
}

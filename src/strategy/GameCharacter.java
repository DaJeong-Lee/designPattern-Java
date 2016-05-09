package strategy;

public class GameCharacter {

	//접근점
	private Weapon weapon;

	//교환 가능
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
	public void attack(){
		
		if(weapon == null){
			System.out.println("맨손 공격");
		}else{
			//델리게이트 : 어떤 무기가 있는지는 모르지만 들고 있는 무기로 공격
			weapon.attack();
		}
		
	}
	
	
}

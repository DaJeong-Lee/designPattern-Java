package strategy;

public class Main {
	public static void main(String[] args) {
		GameCharacter charater = new GameCharacter();
		
		charater.attack();
		
		charater.setWeapon(new Knife());
		charater.attack();
		
		charater.setWeapon(new Sword());
		charater.attack();
	}
}

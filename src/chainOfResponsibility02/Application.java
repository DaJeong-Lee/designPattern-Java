package chainOfResponsibility02;

public class Application {
	public static void main(String[] args) {
		Attack attack = new Attack(100);
		
		Armor armor1 = new Armor();
		Armor armor2 = new Armor();
		
		armor1.setNextDefense(armor2);
		
		armor1.defense(attack);
	}
}

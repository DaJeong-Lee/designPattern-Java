package builder01;

public class Main {
	public static void main(String[] args) {
		
		ComputerFactory factory = new ComputerFactory();
		
		//1. factory에 LgGram설계도를 넣어줌
		factory.setBlueprint(new LgGramBlueprint());
		
		//2. factory에서 computer를 세팅
		factory.make();
		
		//3. factory에서 computer를 가져옴
		Computer computer = factory.getComputer();
		
		System.out.println(computer.toString());
	}
}

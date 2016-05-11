package builder02;

public class Main {
	public static void main(String[] args) {
		//체이닝 방식으로 멤버변수를 세팅할 수 있음 -> 좀 더 가독성있고, 편하게 세팅가능
		Computer computer = ComputerBuilder
							.start()
							.setCpu("i7")
							.setRam("8g")
							.build();
										
		
		System.out.println(computer.toString());
	}
}

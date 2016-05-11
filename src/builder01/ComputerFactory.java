package builder01;

public class ComputerFactory {
	// 설계도(BluePrint)를 갖고 Computer를 만듬
	private BluePrint print;

	public void setBlueprint(BluePrint print) {
		this.print = print;
	}
	
	public void make(){
		print.setCpu();
		print.setRam();
		print.setStorage();
	}
	
	public Computer getComputer(){
		return print.getComputer();
	}
	
}

package observer03;

public class Man implements Observer{
	private String name;

	public Man(String name) {
		this.name = name;
	}

	@Override
	public void update(String msg) {
		System.out.println("receive : name ="+name +", msg = "+msg);
	}
	
	
	
}

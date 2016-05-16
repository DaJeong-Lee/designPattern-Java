package observer03;

public class Main {
	public static void main(String[] args) {
		Observer lee = new Man("lee");
		Observer kim = new Man("kim");
		
		Subject jtbc = new Newspaper("jtbc");
		
		jtbc.attach(lee);
		jtbc.attach(kim);

		jtbc.notifyObservers();
		
	}
}

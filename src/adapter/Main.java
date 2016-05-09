package adapter;

public class Main {
	public static void main(String[] args) {
		Adapter adapter =  new AdapterImpl();
		
		// Adapter를 사용하여 float을 넘겨 float을 받게됨 
		System.out.println(adapter.twiceOf(100f));
		System.out.println(adapter.halfOf(100f));
	}
}

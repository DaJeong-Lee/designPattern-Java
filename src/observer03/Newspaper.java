package observer03;

import java.util.ArrayList;
import java.util.List;

public class Newspaper implements Subject{
	
	private String name;
	private List<Observer> subscribers;
	
	
	public Newspaper(String name) {
		super();
		this.name = name;
		this.subscribers = new ArrayList<>();
	}

	@Override
	public void attach(Observer o) {
		subscribers.add(o);
	}

	@Override
	public void detach(Observer o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notifyObservers() {
		System.out.println("send : "+ name);
		subscribers.forEach((subscriber) -> subscriber.update("NewMessege.."));
	}

}

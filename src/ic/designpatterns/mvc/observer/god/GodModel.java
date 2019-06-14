package ic.designpatterns.mvc.observer.god;

import java.util.ArrayList;
import java.util.Collection;

import ic.designpatterns.mvc.Model;
import ic.designpatterns.mvc.observer.Observer;

public class GodModel implements Model {
	private final Collection<Observer> observers;
	private String attribute;

	public GodModel() {
		observers = new ArrayList<>();
	}

	@Override
	public String getAttribute() {
		return attribute;
	}

	@Override
	public void setAttribute(String attribute) {
		this.attribute = attribute;
		publish(attribute);
	}
	
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	public void publish(String variable) {
		for (Observer observer : observers) {
			observer.wakeUp(variable);
		}
	}
}

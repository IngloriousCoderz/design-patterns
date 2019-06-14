package ic.designpatterns.mvc;

import java.util.ArrayList;
import java.util.Collection;

public class Observable {
	private final Collection<Observer> observers;

	public Observable() {
		observers = new ArrayList<>();
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

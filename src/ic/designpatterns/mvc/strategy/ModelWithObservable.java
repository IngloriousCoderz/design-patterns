package ic.designpatterns.mvc.strategy;

import ic.designpatterns.mvc.Model;
import ic.designpatterns.mvc.Observable;
import ic.designpatterns.mvc.Observer;

public class ModelWithObservable implements Model {
	private String attribute;
	private Observable observable;

	public ModelWithObservable() {
		observable = new Observable();
	}

	@Override
	public String getAttribute() {
		return attribute;
	}

	@Override
	public void setAttribute(String attribute) {
		this.attribute = attribute;
		observable.publish(attribute);
	}

	public void addObserver(Observer observer) {
		observable.addObserver(observer);
	}
}

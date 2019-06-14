package ic.designpatterns.mvc.observer.decorator;

import ic.designpatterns.mvc.Model;
import ic.designpatterns.mvc.observer.Observable;

public class ObservableDecorator extends Observable implements Model {
	private Model decorated;

	public ObservableDecorator(Model decorated) {
		this.decorated = decorated;
	}

	@Override
	public String getAttribute() {
		return decorated.getAttribute();
	}

	@Override
	public void setAttribute(String attribute) {
		decorated.setAttribute(attribute);
		publish(attribute);
	}
}

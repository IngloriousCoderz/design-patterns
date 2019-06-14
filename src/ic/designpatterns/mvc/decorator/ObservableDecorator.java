package ic.designpatterns.mvc.decorator;

import ic.designpatterns.mvc.Model;
import ic.designpatterns.mvc.Observable;

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

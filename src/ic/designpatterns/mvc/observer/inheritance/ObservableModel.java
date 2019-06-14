package ic.designpatterns.mvc.observer.inheritance;

import ic.designpatterns.mvc.Model;
import ic.designpatterns.mvc.observer.Observable;

public class ObservableModel extends Observable implements Model {
	private String attribute;

	@Override
	public String getAttribute() {
		return attribute;
	}

	@Override
	public void setAttribute(String attribute) {
		this.attribute = attribute;
		publish(attribute);
	}

}

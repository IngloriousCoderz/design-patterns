package ic.designpatterns.mvc.inheritance;

import ic.designpatterns.mvc.Model;
import ic.designpatterns.mvc.Observable;

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

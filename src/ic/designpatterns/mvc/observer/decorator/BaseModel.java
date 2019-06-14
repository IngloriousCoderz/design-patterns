package ic.designpatterns.mvc.observer.decorator;

import ic.designpatterns.mvc.Model;

public class BaseModel implements Model {
	private String attribute;

	@Override
	public String getAttribute() {
		return attribute;
	}

	@Override
	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}
}

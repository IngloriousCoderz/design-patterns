package ic.designpatterns.mvc;

import ic.designpatterns.mvc.observer.Observer;

public class View implements Observer {
	private final String TEMPLATE;

	private String output;

	public View() {
		TEMPLATE = "<h1>Hello ${variable}!</h1>";
		update("nobody");
	}

	public void update(String variable) {
		output = TEMPLATE.replace("${variable}", variable);
	}

	public String getOutput() {
		return output;
	}

	@Override
	public void wakeUp(String variable) {
		update(variable);
	}
}

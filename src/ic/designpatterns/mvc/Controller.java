package ic.designpatterns.mvc;

public class Controller {
	private Model model;
	private View view;

	public void setModel(Model model) {
		this.model = model;
	}

	public void setView(View view) {
		this.view = view;
	}

	public void handleInput(String input) {
		model.setAttribute(input);
		if (view != null) {
			view.update(input);
		}
	}
}

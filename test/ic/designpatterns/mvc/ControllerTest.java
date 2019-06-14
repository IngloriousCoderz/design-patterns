package ic.designpatterns.mvc;

import ic.designpatterns.mvc.decorator.ObservableDecorator;
import ic.designpatterns.mvc.decorator.BaseModel;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ControllerTest {
	@Test
	public void shouldUpdateViewManually() {
		// given
		Model model = new BaseModel();

		View view = new View();

		Controller controller = new Controller();
		controller.setModel(model);
		controller.setView(view);

		// when
		controller.handleInput("world");

		// then
		assertEquals("world", model.getAttribute());
		assertEquals("<h1>Hello world!</h1>", view.getOutput());
	}

	@Test
	public void shouldUpdateViewAutomatically() {
		// given
		// Model model = new ObservableModel();
		// Model model = new ModelWithObservable();
		Model model = new BaseModel();
		model = new ObservableDecorator(model);

		View view = new View();
		((Observable) model).addObserver(view);

		Controller controller = new Controller();
		controller.setModel(model);

		// when
		controller.handleInput("world");

		// then
		assertEquals("world", model.getAttribute());
		assertEquals("<h1>Hello world!</h1>", view.getOutput());
	}
}

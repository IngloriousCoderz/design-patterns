package ic.designpatterns.mvc.observer;

import static org.junit.Assert.assertEquals;

import ic.designpatterns.mvc.Model;
import ic.designpatterns.mvc.View;

public class ObserverTestHelper {
	static void shouldObserveChanges(Model model, View view) {
		// when
        model.setAttribute("world");

        // then
        assertEquals("<h1>Hello world!</h1>", view.getOutput());
	}
}

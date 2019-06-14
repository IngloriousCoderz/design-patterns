package ic.designpatterns.mvc.observer;

import ic.designpatterns.mvc.Model;
import ic.designpatterns.mvc.Observer;
import ic.designpatterns.mvc.View;
import ic.designpatterns.mvc.strategy.ModelWithObservable;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StrategyTest {

    @Test
    public void shouldObserveChanges() {
        // given
        Model model = new ModelWithObservable();
        Observer observer = new View();
        ((ModelWithObservable) model).addObserver(observer);

        // when
        model.setAttribute("world");

        // then
        View view = (View) observer;
        assertEquals("<h1>Hello world!</h1>", view.getOutput());
    }
}

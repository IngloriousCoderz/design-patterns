package ic.designpatterns.mvc.observer;

import ic.designpatterns.mvc.Model;
import ic.designpatterns.mvc.Observable;
import ic.designpatterns.mvc.Observer;
import ic.designpatterns.mvc.View;
import ic.designpatterns.mvc.decorator.ObservableDecorator;
import ic.designpatterns.mvc.decorator.BaseModel;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DecoratorTest {

    @Test
    public void shouldObserveChanges() {
        // given
        Model decorated = new BaseModel();
        Observable observable = new ObservableDecorator(decorated);

        Observer observer = new View();
        observable.addObserver(observer);

        // when
        Model model = (Model) observable;
        model.setAttribute("world");

        // then
        View view = (View) observer;
        assertEquals("<h1>Hello world!</h1>", view.getOutput());
    }
}

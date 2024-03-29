package ic.designpatterns.mvc.observer;

import org.junit.Test;

import ic.designpatterns.mvc.Model;
import ic.designpatterns.mvc.View;
import ic.designpatterns.mvc.observer.decorator.BaseModel;
import ic.designpatterns.mvc.observer.decorator.ObservableDecorator;

public class DecoratorTest {

    @Test
    public void shouldObserveChanges() {
        // given
        Model decorated = new BaseModel();
        Observable observable = new ObservableDecorator(decorated);

        Observer observer = new View();
        observable.addObserver(observer);

        ObserverTestHelper.shouldObserveChanges((Model) observable, (View) observer);
    }
}

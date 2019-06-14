package ic.designpatterns.mvc.observer;

import org.junit.Test;

import ic.designpatterns.mvc.Model;
import ic.designpatterns.mvc.View;
import ic.designpatterns.mvc.observer.strategy.ModelWithObservable;

public class StrategyTest {

    @Test
    public void shouldObserveChanges() {
        // given
        ModelWithObservable observable = new ModelWithObservable();
        
        Observer observer = new View();
        observable.addObserver(observer);

        ObserverTestHelper.shouldObserveChanges((Model) observable, (View) observer);
    }
}

package ic.designpatterns.mvc.observer;

import org.junit.Test;

import ic.designpatterns.mvc.Model;
import ic.designpatterns.mvc.View;
import ic.designpatterns.mvc.observer.inheritance.ObservableModel;

public class InheritanceTest {

    @Test
    public void shouldObserveChanges() {
        // given
        Observable observable = new ObservableModel();
        
        Observer observer = new View();
        observable.addObserver(observer);

        ObserverTestHelper.shouldObserveChanges((Model) observable, (View) observer);
    }
}

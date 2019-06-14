package ic.designpatterns.mvc.observer;

import org.junit.Test;

import ic.designpatterns.mvc.Model;
import ic.designpatterns.mvc.View;
import ic.designpatterns.mvc.observer.god.GodModel;

public class GodTest {

    @Test
    public void shouldObserveChanges() {
        // given
        GodModel observable = new GodModel();
        
        Observer observer = new View();
        observable.addObserver(observer);

        ObserverTestHelper.shouldObserveChanges((Model) observable, (View) observer);
    }
}

package ic.designpatterns.mario.state;

import ic.designpatterns.mario.KeyCode;

public interface State {
	public String onKeyPressed(KeyCode keyCode);
}

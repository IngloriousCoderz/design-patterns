package ic.designpatterns.mario.state;

import ic.designpatterns.mario.KeyCode;

public class BaseState implements State {
	@Override
	public String onKeyPressed(KeyCode keyCode) {
		switch (keyCode) {
		case DOWN:
			return noop();

		case JUMP:
			return jump();

		case ACTION:
			return run();

		default:
			return noop();
		}
	}

	private String jump() {
		return "Jumping";
	}

	private String run() {
		return "Running";
	}

	private String noop() {
		return "";
	}
}

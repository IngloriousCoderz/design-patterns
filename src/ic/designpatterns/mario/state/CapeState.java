package ic.designpatterns.mario.state;

import ic.designpatterns.mario.KeyCode;

public class CapeState implements State {
	@Override
	public String onKeyPressed(KeyCode keyCode) {
		switch (keyCode) {
		case DOWN:
			return crash();

		case JUMP:
			return glide();

		case ACTION:
			return run();

		default:
			return noop();
		}
	}

	private String crash() {
		return "Crashing";
	}

	private String glide() {
		return "Gliding";
	}

	private String run() {
		return "Running";
	}

	private String noop() {
		return "";
	}
}

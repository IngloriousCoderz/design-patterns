package ic.designpatterns.mario.decorator;

import ic.designpatterns.mario.KeyCode;
import ic.designpatterns.mario.Mario;

public class SuperDecorator implements Mario {
	private Mario mario;

	public SuperDecorator(Mario mario) {
		this.mario = mario;
	}

	public void setMario(Mario mario) {
		this.mario = mario;
	}

	@Override
	public String onKeyPressed(KeyCode keyCode) {
		switch (keyCode) {
		case DOWN:
			return crash();

		default:
			return mario.onKeyPressed(keyCode);
		}
	}

	private String crash() {
		return "Crashing";
	}
}

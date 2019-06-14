package ic.designpatterns.mario.decorator;

import ic.designpatterns.mario.KeyCode;
import ic.designpatterns.mario.Mario;

public class FireDecorator implements Mario {
	private Mario mario;

	public FireDecorator(Mario mario) {
		this.mario = mario;
	}

	public void setMario(Mario mario) {
		this.mario = mario;
	}

	@Override
	public String onKeyPressed(KeyCode keyCode) {
		switch (keyCode) {
		case ACTION:
			return shoot();

		default:
			return mario.onKeyPressed(keyCode);
		}
	}

	private String shoot() {
		return "Shooting";
	}
}

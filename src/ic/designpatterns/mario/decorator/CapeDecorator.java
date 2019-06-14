package ic.designpatterns.mario.decorator;

import ic.designpatterns.mario.KeyCode;
import ic.designpatterns.mario.Mario;

public class CapeDecorator implements Mario {
	private Mario mario;

	public CapeDecorator(Mario mario) {
		this.mario = mario;
	}

	public void setMario(Mario mario) {
		this.mario = mario;
	}

	@Override
	public String onKeyPressed(KeyCode keyCode) {
		switch (keyCode) {
		case JUMP:
			return glide();

		default:
			return mario.onKeyPressed(keyCode);
		}
	}

	private String glide() {
		return "Gliding";
	}
}

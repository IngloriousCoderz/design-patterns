package ic.designpatterns.mario.inheritance;

import ic.designpatterns.mario.KeyCode;

public class FireMario extends SuperMario {
	@Override
	public String onKeyPressed(KeyCode keyCode) {
		switch (keyCode) {
		case ACTION:
			return shoot();

		default:
			return super.onKeyPressed(keyCode);
		}
	}

	private String shoot() {
		return "Shooting";
	}
}

package ic.designpatterns.mario.inheritance;

import ic.designpatterns.mario.KeyCode;

public class SuperMario extends BaseMario {
	@Override
	public String onKeyPressed(KeyCode keyCode) {
		switch (keyCode) {
		case DOWN:
			return crash();

		default:
			return super.onKeyPressed(keyCode);
		}
	}

	private String crash() {
		return "Crashing";
	}
}

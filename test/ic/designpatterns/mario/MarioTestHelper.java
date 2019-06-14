package ic.designpatterns.mario;

import static org.junit.Assert.assertEquals;

class MarioTestHelper {
	static void testBaseMario(Mario mario) {
		assertEquals("Moving left", mario.onKeyPressed(KeyCode.LEFT));
		assertEquals("Moving right", mario.onKeyPressed(KeyCode.RIGHT));
		assertEquals("", mario.onKeyPressed(KeyCode.UP));
		assertEquals("", mario.onKeyPressed(KeyCode.DOWN));
		assertEquals("Jumping", mario.onKeyPressed(KeyCode.JUMP));
		assertEquals("Running", mario.onKeyPressed(KeyCode.ACTION));
	}

	static void testSuperMario(Mario mario) {
		assertEquals("Moving left", mario.onKeyPressed(KeyCode.LEFT));
		assertEquals("Moving right", mario.onKeyPressed(KeyCode.RIGHT));
		assertEquals("", mario.onKeyPressed(KeyCode.UP));
		assertEquals("Crashing", mario.onKeyPressed(KeyCode.DOWN));
		assertEquals("Jumping", mario.onKeyPressed(KeyCode.JUMP));
		assertEquals("Running", mario.onKeyPressed(KeyCode.ACTION));
	}

	static void testFireMario(Mario mario) {
		assertEquals("Moving left", mario.onKeyPressed(KeyCode.LEFT));
		assertEquals("Moving right", mario.onKeyPressed(KeyCode.RIGHT));
		assertEquals("", mario.onKeyPressed(KeyCode.UP));
		assertEquals("Crashing", mario.onKeyPressed(KeyCode.DOWN));
		assertEquals("Jumping", mario.onKeyPressed(KeyCode.JUMP));
		assertEquals("Shooting", mario.onKeyPressed(KeyCode.ACTION));
	}

	static void testCapeMario(Mario mario) {
		assertEquals("Moving left", mario.onKeyPressed(KeyCode.LEFT));
		assertEquals("Moving right", mario.onKeyPressed(KeyCode.RIGHT));
		assertEquals("", mario.onKeyPressed(KeyCode.UP));
		assertEquals("Crashing", mario.onKeyPressed(KeyCode.DOWN));
		assertEquals("Gliding", mario.onKeyPressed(KeyCode.JUMP));
		assertEquals("Running", mario.onKeyPressed(KeyCode.ACTION));
	}
}

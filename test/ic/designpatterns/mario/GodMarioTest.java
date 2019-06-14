package ic.designpatterns.mario;

import org.junit.Test;

import ic.designpatterns.mario.god.GodMario;
import ic.designpatterns.mario.god.Type;

public class GodMarioTest {	
	@Test
	public void testBaseMario() {
		Mario mario = new GodMario(Type.BASE);

		MarioTestHelper.testBaseMario(mario);
	}

	@Test
	public void testSuperMario() {
		Mario mario = new GodMario(Type.SUPER);

		MarioTestHelper.testSuperMario(mario);
	}

	@Test
	public void testFireballMario() {
		Mario mario = new GodMario(Type.FIRE);

		MarioTestHelper.testFireMario(mario);
	}

	@Test
	public void testFlyingSquirrelMario() {
		Mario mario = new GodMario(Type.CAPE);

		MarioTestHelper.testCapeMario(mario);
	}
}

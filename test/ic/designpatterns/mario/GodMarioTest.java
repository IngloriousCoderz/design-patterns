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
	public void testFireMario() {
		Mario mario = new GodMario(Type.FIRE);

		MarioTestHelper.testFireMario(mario);
	}

	@Test
	public void testCapeMario() {
		Mario mario = new GodMario(Type.CAPE);

		MarioTestHelper.testCapeMario(mario);
	}
}
